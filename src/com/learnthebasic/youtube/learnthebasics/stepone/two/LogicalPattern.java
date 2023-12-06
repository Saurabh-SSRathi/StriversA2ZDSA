package com.learnthebasic.youtube.learnthebasics.stepone.two;

public class LogicalPattern {

    public static void patternOne(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LogicalPattern.patternOne(3);
    }
}
