package com.yash.dsa;

import java.util.Scanner;

public class P8 {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        Scanner sc = new Scanner(System.in);
        String palindrome = sc.next();
        String pal = "";
        for (int i = palindrome.length()-1;i>=0;i--) {
            pal = pal + palindrome.charAt(i);
        }
        System.out.println(pal);
        if (pal.equals(palindrome))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");
    }
}
