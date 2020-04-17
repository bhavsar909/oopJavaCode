package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version2;

import java.util.*;

public class SortLogsVersion2 {
    public static void main(String[] args) {
        List<String> logs;
        logs=logScanner();
        System.out.println(sortLogs(logs));
    }
    private static List<String> sortLogs(List<String> logs) {
        List<String> result = new ArrayList<>();
        List<String> digitLogs = new ArrayList<>();
        List<String> letterLogs = new ArrayList<>();
        List<String> junkLogs = new ArrayList<>();
        for (String log:logs) {
            if (isDigitLog(log))
                digitLogs.add(log);
            else if (isLetterLog(log))
                letterLogs.add(log);
            else
                junkLogs.add(log);
        }
        Collections.sort(letterLogs,new LetterLogComparator());
        result.addAll(letterLogs);
        result.addAll(digitLogs);
        return result;
    }

    private static boolean isLetterLog(String log) {
        String[] words = log.split(" ");
        for (int i = 1; i < words.length; i++) {
            if (!(words[i].matches("^[a-z]+$")))
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


    private static void constraints(int n){
        if (n<0||n>100){
            System.out.println("The Size of the logs Array should be less than or equal 100 and grater than or equals" +
                    " to 0 " +
                    "only");
            System.exit(0);
        }
    }
    private static List<String> logScanner(){
        List<String> logs= new ArrayList<>();
        int n;
        String temp;
        String[] log;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of logs which you want to filter:");
        n=scanner.nextInt();
        scanner.nextLine();
        constraints(n);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the "+i+"th log:");
            temp=scanner.nextLine();
            log=temp.split(" ");
            if (log.length>=3&&log.length<=100){
                if (log[0].matches("^[a-z]+[0-9]+"))
                    logs.add(temp);
                else{
                    System.out.println("Identifier should be AlphaNumeric keyword such as letters followed by numbers" +
                            " only");
                    //System.exit(0);
                }
            }
            else{
                System.out.println("The Constraint is not satisfied :  3 <= logs[i].length <= 100");
                //System.exit(0);
            }
        }
        System.out.println(logs);
        return logs;
    }
}
class LetterLogComparator implements Comparator {
    @Override
    public int compare(Object logObj1, Object logObj2) {
        String[] log1=logObj1.toString().split(" ");
        String[] log2=logObj2.toString().split(" ");
        String log1Identifier=log1[0];
        String log2Identifier=log2[0];
        log1[0]=null;
        log2[0]=null;
        String temp1= Arrays.toString(log1);
        String temp2= Arrays.toString(log2);
        if (temp1.equals(temp2))
            return log1Identifier.compareTo(log2Identifier);
        else
            return temp1.compareTo(temp2);
    }
}
