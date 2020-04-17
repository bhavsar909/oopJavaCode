package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.utilityclasses;

public class LogFilters {
    public static boolean isLetterLog(String log) {
        String[] words = log.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (!(words[i].matches("^[a-z]+$")))
                return false;
        }
        return true;
    }

    public static boolean isDigitLog(String log) {
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
}
