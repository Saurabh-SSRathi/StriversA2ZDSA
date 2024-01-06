package com.learnthebasic.youtube.learnthebasics.stepone.practice;

public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.

        int[] arr = new int[n];
        arr[0] = 0;
        if (n<2) {
            return arr;
        }
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }
//
//         int[] arr = new int[n];
//         for(int i =0; i<n; i++) {
//             arr[i] = fibonacci(i);
//         }
//         return arr;

   // }

//         private static int fibonacci(int n) {
//             if (n<=1) {
//                 return n;
//             }
//             return fibonacci(n-2) + fibonacci(n-1);
//         }


        public static void main(String[] args) {

        int n = 5;
        int[] arr = generateFibonacciNumbers(n);
        for (int i =0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
