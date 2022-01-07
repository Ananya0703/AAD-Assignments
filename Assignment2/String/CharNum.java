package com.Assignment2.String;

import java.util.Scanner;

public class CharNum {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        for (int i = 0; i < inp.length(); i++){
            if (inp.charAt(i) != ' '){
                count++;
            }
        }
        System.out.println("The number of characters are " + count);
    }
}
