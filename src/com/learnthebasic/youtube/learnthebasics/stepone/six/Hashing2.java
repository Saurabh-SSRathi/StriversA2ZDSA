package com.learnthebasic.youtube.learnthebasics.stepone.six;

import java.util.Scanner;

public class Hashing2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scanner.next();

        //PreCompute
        int [] hash = new int[26];
        for (int i=0; i<str.length(); i++) {
            hash[str.charAt(i) - 'a'] ++;
        }

        System.out.println("Enter how much character you want to check: ");
        int q = scanner.nextInt();
        while (q-- !=0) {
            System.out.println("Enter Character: ");
            char c = scanner.next().charAt(0);

            // fetch:
            System.out.println(hash[c - 'a']);
        }
    }
}
