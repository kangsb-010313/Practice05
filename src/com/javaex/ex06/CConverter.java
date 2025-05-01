package com.javaex.ex06;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    
    public static void showDoller() {
    	System.out.println("백만원은 " + CConverter.toDoller(1000000) + "달러입니다.");
    }
    public static void showWon() {
    	System.out.println("백달러는 " + CConverter.toKWR(1000000) + "입니다.");
    }
}
