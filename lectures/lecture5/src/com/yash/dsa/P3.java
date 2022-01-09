package com.yash.dsa;

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {
//        Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        int principal = sc.nextInt();
        System.out.print("Enter time: ");
        int time = sc.nextInt();
        System.out.print("Enter rate: ");
        float rate = sc.nextFloat();

        float SI = (principal*rate/100)*time;

        System.out.println("Your Simple Interest is " + SI);

    }
}
