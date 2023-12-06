package com.learnthebasic.youtube.learnthebasics.stepone.one;

import java.util.Scanner;

public class Q6SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int even = 0;
        int odd = 0;
        int digit = 0;

        while (n>0) {
            digit = n%10;
            n = n/10;
            if (digit%2!=0) {
                odd = digit + odd;
            } else {
                even = digit + even;
            }
        }
        System.out.println(even+" "+odd);
    }
}