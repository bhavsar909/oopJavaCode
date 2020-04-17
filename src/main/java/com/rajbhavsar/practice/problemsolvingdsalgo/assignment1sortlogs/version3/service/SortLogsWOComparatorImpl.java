package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.service;

import com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.utilityclasses.LogFilters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLogsWOComparatorImpl implements LogSorter {
    @Override
    public List<String> sortLogs(List<String> logs) {
        List<String> result = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();
        List<String> junkLogs = new ArrayList<>();
        for (String log : logs) {
            if (LogFilters.isDigitLog(log))
                digitLogs.add(log);
            else if (LogFilters.isLetterLog(log))
                letterLogs.add(log);
            else
                junkLogs.add(log);
        }
        result.addAll(sortLexographically(letterLogs));
        result.addAll(digitLogs);
        return result;
    }

    private static List<String> sortLexographically(List<String> logs) {
        List<String> tempLogs = new ArrayList<>();
        List<String> sortedLogs = new ArrayList<>();
        String tempLog = "";
        for (String log : logs) {
            String[] words = log.split(" ");
            String temp = words[0];
            for (int i = 0; i < words.length - 1; i++)
                words[i] = words[i + 1];
            words[words.length - 1] = temp;
            tempLog = "";
            for (int i = 0; i < words.length; i++) {
                tempLog = tempLog + " " + words[i];
            }
            tempLogs.add(tempLog);
        }
        Collections.sort(tempLogs);
        for (String log : tempLogs) {
            String[] words = log.split(" ");
            String temp = words[words.length - 1];
            for (int i = words.length - 1; i > 0; i--)
                words[i] = words[i - 1];
            words[0] = temp;
            tempLog = "";
            for (int i = 0; i < words.length; i++) {
                tempLog = tempLog + " " + words[i];
            }
            sortedLogs.add(tempLog);
        }
        return sortedLogs;
    }

}
