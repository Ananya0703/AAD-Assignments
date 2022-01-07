package com.Assignment2.Basic;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        char ascii = inp.charAt(0);
        int num = (int) ascii;
        System.out.println("The number is " + num);

    }
}
