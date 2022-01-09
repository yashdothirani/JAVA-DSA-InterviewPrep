package com.yash.dsa;

import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
//        Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String operator = sc.next();

        if (operator.equals("+"))
            System.out.println(num1 + num2);
        if (operator.equals("-"))
            System.out.println(num1 - num2);
        if (operator.equals("*"))
            System.out.println(num1 * num2);
        if (operator.equals("/"))
            System.out.println(num1 / num2);

    }
}
