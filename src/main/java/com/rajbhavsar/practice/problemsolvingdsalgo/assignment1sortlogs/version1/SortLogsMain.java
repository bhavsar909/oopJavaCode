package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Algo:
 * sortLogs(String[] logs){
 * for(log1 to logn){
 * filter(digit-log and letter-log)
 * list of digit log
 * list of letter log
 * }
 * <p>
 * sort the list of letter logs lexicographically ignoring identifiers and in case of tie use the identifier
 * <p>
 * digit logs should be in their original order.
 * <p>
 * now the result list should be like letter logs followed by digit logs.
 * }
 */
public class SortLogsMain {
    public static void main(String[] args) {
        System.out.println(sortLogs(new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 " +
                "art zero"}));
    }

    private static List<String> sortLogs(String[] logs) {
        List<String> result = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();
        List<String> junkLogs = new ArrayList<>();
        for (int i = 0; i < logs.length; i++) {
            if (isDigitLog(logs[i]))
                digitLogs.add(logs[i]);
            else if (isLetterLog(logs[i]))
                letterLogs.add(logs[i]);
            else
                junkLogs.add(logs[i]);
        }
        result.addAll(sortLexographically(letterLogs));
        result.addAll(digitLogs);
        return result;
    }

    private static boolean isLetterLog(String log) {
        String[] words = log.split(" ");
        String tempWord;
        for (int i = 1; i < words.length; i++) {
            tempWord = words[i].toLowerCase();
            if (!words[i].equals(tempWord))
                return false;
        }
        return true;
    }

    private static boolean isDigitLog(String log) {
        String[] words = log.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (words[i] == null)
                return false;
            else {
                try {
                    double temp = Double.parseDouble(words[i]);
                } catch (Exception e) {
                    return false;
                }
            }
        }
        return true;
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
