package com.learnthebasic.youtube.learnthebasics.stepone.pointone;

import java.util.Scanner;

public class Q5NthFibonacciNumber {
    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n==1) {
            System.out.println("1");
        } else if (n==2) {
            System.out.println("2");
        } else {
            int fib[] = new int[n + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println(fib[n]);
        }
*/

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int c;

        for(int i =0; i<n; i++) {
            c = a+b;
            a=b;
            b=c;
        }
        System.out.println(a);

    }
}
