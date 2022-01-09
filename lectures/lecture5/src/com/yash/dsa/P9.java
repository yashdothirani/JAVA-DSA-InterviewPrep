package com.yash.dsa;

import java.util.Scanner;

public class P9 {
    public static void main(String[] args) {
//        To find Armstrong Number between two given number.
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
int digit = 0;
int armstrong = 0;
int length = String.valueOf(number).length();
        while(number>0){
            digit = number%10;
            number = number/10;
            armstrong = armstrong + (int)Math.pow(digit,length);
        }
        System.out.println(armstrong);
    }
}
