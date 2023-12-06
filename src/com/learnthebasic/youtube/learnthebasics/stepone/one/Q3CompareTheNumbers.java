package com.learnthebasic.youtube.learnthebasics.stepone.one;

import java.util.Scanner;

public class Q3CompareTheNumbers {
    public static String compareIfElse(int a, int b) {

        if (a>b) {
            return "greater";
        } else if (a<b) {
            return "smaller";
        } else if (a==b) {
            return "equal";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a:");
        int a = sc.nextInt();
        System.out.println("b:");
        int b = sc.nextInt();

        String s = compareIfElse(a,b);
        System.out.println(s);
    }
}
