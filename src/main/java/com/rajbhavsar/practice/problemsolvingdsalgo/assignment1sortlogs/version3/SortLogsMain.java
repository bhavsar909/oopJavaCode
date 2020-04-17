package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3;

import com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.service.LogSorter;
import com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.service.SortLogsByComparatorImpl;
import com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.utilityclasses.LogValidators;

import java.util.*;

public class SortLogsMain {
    public static void main(String[] args) {
        List<String> validLogs;
        LogSorter service1=new SortLogsByComparatorImpl();
        //LogSorter service1=new SortLogsWOComparatorImpl();
        String [] logs=new String[]{"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 " +
                "art zero"};
        //validLogs=LogValidators.logValidation(logs);
        //validLogs=LogValidators.logValidation();
        validLogs= LogValidators.logValidation("Random Logs Generator ");
        System.out.println("Sorted Logs:\n"+service1.sortLogs(validLogs));
    }
}

