package com.yash.dsa;

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {
//        Input currency in rupees and output in USD.
        Scanner sc = new Scanner(System.in);
        float currency = sc.nextFloat();

        System.out.println(currency + " rupees = " + currency/70 + " USD");
    }
}
