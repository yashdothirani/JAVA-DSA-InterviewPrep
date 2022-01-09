package com.yash.dsa;

import java.util.Scanner;

public class P1 {
    public static void main(String[] args) {
// Write a program to print whether a number is even or odd, also take input.
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number%2==0)
            System.out.println(number + " is an Even number");
        else
            System.out.println(number + " is an Odd Number");

    }
}
