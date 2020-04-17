package com.rajbhavsar.practice.problemsolvingdsalgo.assignment1sortlogs.version3.utilityclasses;

import java.util.*;

public class LogValidators {
    public static List<String> logValidation(String[] logs){
        List<String> logsList= new ArrayList<>();
        int n=logs.length;
        if ( constraintNoOfLogs(n) && constraintLogLength(logs) && constraintValidLog(logs)){
            logsList.addAll(Arrays.asList(logs));
        }
        return logsList;
    }

    public static List<String> logValidation(){
        List<String> logsList= new ArrayList<>();
        int n;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the number of logs which you want to filter:");
        n=scanner.nextInt();
        scanner.nextLine();
        String[] logs=new String[n];
        if (constraintNoOfLogs(n)){
            for (int i = 0; i < n; i++) {
                System.out.println("Enter the " + (i+1) + "th log:");
                logs[i] = scanner.nextLine();
            }
            if (constraintLogLength(logs)&&constraintValidLog(logs)){
                logsList.addAll(Arrays.asList(logs));
            }else {
                System.exit(0);
            }
        }
        else
            System.exit(0);
        return logsList;
    }

    public static List<String> logValidation(String string){
        System.out.println(string+" is executing...........");
        List<String> logsList= new ArrayList<>();
        int n,t;
        Random random = new Random();
        n=random.nextInt(100);
        System.out.println("Number of Logs Generated Randomly: "+n);
        String temp="";
        String[] logs=new String[n];
        if (constraintNoOfLogs(n)){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < random.nextInt(10) ; j++) {
                    t=random.nextInt()%2;
                    if (t==0)
                        for (int k = 0; k < random.nextInt(5); k++)
                            temp+=random.nextInt(10000)+" ";
                    else
                        for (int k = 0; k < random.nextInt(5); k++)
                            temp+= LogGenerators.randomLettersGenerator()+" ";
                }
                logs[i] = LogGenerators.randomIdentifierGenerator()+" "+ temp;
                temp="";
            }
            if (constraintLogLength(logs)&&constraintValidLog(logs)){
                logsList.addAll(Arrays.asList(logs));
            }else {
                //logValidation("RandomLogGenerator");
                System.exit(0);
            }
        }
        else{
            //logValidation("RandomLogGenerator");
            System.exit(0);
        }
        System.out.println("List of Randomly Generated Logs: \n"+logsList);
        return logsList;
    }
    private static boolean constraintNoOfLogs(int n){
        if (n<0||n>=100){
            System.out.println("The Number of logs should not be more than 100");
            return false;
        }
        return true;
    }
    private static boolean constraintLogLength(String[] logs){
        String[] temp;
        for (String log:logs){
            if (log.length()<=3 || log.length()>=100){
                System.out.println("The length of the log should be more or equal to 3 and smaller or equals to 100 " +
                        "for following log" + " : " + log);
                return false;
            }
        }
        return true;
    }
    private static boolean constraintValidLog(String[] logs){
        String[] logTokens;
        for (String log:logs){
            logTokens=log.split(" ");
            if (logTokens.length>=2){
                if (logTokens[0].matches("^[a-z]+[0-9]+"))
                    return true;
                else{
                    System.out.println("Identifier should be AlphaNumeric keyword such as lower case letters followed" +
                            " by numbers" +
                            " only for following log : "+log);
                    return false;
                    //System.exit(0);
                }
            }
            else{
                System.out.println("At least one word should be there after the identifier for following log: "+log);
                return false;
                //System.exit(0);
            }
        }
        return false;
    }

}
