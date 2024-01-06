package com.learnthebasic.youtube.learnthebasics.stepone.four;

public class CountDigitSolution {
    public static int countDigits(int n){
        // Write your code here.
        int count = 0;
        int dul=n;
        while(n>0) {
            int lastDigit = n%10;
            if (lastDigit != 0 && dul%lastDigit ==  0) {
                count++;
            }
            n = n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int count = countDigits(660);
        System.out.println(count);
    }
}
