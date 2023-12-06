package com.learnthebasic.youtube.learnthebasics.stepone.one;

import java.util.Scanner;

/*
A school has a following rules for grading system:
a. Below 25 - F
b. 25 to 44 - E
c. 45 to 49 - D
d. 50 to 59 - C
e. 60 to 79 - B
f. 80 to 100 - A
ASk user to enter marks and print the corresponding grade.
*/
public class Q1 {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks < 25) {
            System.out.println("F");
        }
        else if (marks <= 44) {
            System.out.println("E");
        }
        else if (marks <= 59) {
            System.out.println("C");
        }
        else if (marks <= 79) {
            System.out.println("B");
        }
        else if (marks <=100) {
            System.out.println("A");
        }
    }
}
