package com.learnthebasic.youtube.learnthebasics.stepone.six;

import java.util.Scanner;

public class Hashing1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write no. of element in array");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            System.out.println("write " +n+" no. of element in array");
            arr[i] = scanner.nextInt();
        }

        //preCompute
        int[] hash = new int[13];
        for (int i=0; i<n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("write how much time you want check");
        int q = scanner.nextInt();
        while (q-- !=0) {
            System.out.println("write num for count: ");
            int number = scanner.nextInt();

            //fetching
            System.out.println(hash[number]);
        }

    }
}
