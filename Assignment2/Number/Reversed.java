package com.Assignment2.Number;

import java.util.Scanner;

public class Reversed {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = "";
        for (int i = s.length() - 1 ; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }
        System.out.println("The reversed number is " + ans);
    }
}
