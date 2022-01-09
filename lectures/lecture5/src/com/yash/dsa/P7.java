package com.yash.dsa;

import java.util.Scanner;

public class P7 {
    public static void main(String[] args) {
//        To calculate Fibonacci Series up to n numbers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c = 0;
        System.out.print("0 1 ");
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");

        }
    }
}
