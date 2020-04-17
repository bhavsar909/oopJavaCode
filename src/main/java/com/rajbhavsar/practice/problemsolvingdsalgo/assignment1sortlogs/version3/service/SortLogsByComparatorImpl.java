package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.service;

import com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.utilityclasses.LogFilters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLogsByComparatorImpl implements LogSorter {
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
        Collections.sort(letterLogs, (logObj1, logObj2) -> {
            String[] log1 = logObj1.toString().split(" ");
            String[] log2 = logObj2.toString().split(" ");
            String log1Identifier = log1[0];
            String log2Identifier = log2[0];
            log1[0] = null;
            log2[0] = null;
            String temp1 = Arrays.toString(log1);
            String temp2 = Arrays.toString(log2);
            if (temp1.equals(temp2))
                return log1Identifier.compareTo(log2Identifier);
            else
                return temp1.compareTo(temp2);

        });
        result.addAll(letterLogs);
        result.addAll(digitLogs);
        return result;
    }
}
