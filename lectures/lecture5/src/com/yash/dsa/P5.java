package com.yash.dsa;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
//        Take 2 numbers as input and print the largest number.
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1>num2?num1:num2);
    }
}
