package com.learnthebasic.youtube.learnthebasics.stepone.two;

public class LogicalPattern {

    public static void patternOne(int n) {
        for (int row=0; row<n; row++) {
            for (int col=0; col<n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void patternTwo(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    public static void patternThree(int n) {

    }


    public static void main(String[] args) {
        //patternOne(3);
        patternTwo(3);
    }
}
