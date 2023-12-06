package com.learnthebasic.youtube.learnthebasics.stepone.one;

import java.util.Scanner;

public class Q4SwitchCaseStatement {
    public static double areaSwitchCase(int ch, double []a) {

        switch(ch) {
            case 1 :
                return Math.PI*a[0]*a[0];
            case 2 :
                return a[0]*a[1];
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ch:");
        int ch = sc.nextInt();
        int n=sc.nextInt();
        double[] a = new double[2];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
            a[i]=sc.nextInt();
        }
        double s = areaSwitchCase(ch,a);
        System.out.println(s);


    }
}
