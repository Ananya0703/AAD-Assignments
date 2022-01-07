package com.Assignment2.Basic;
import java.util.Scanner;


public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans= "";
        for (int i = s.length() - 1 ; i >= 0; i--){
            ans = ans + s.charAt(i);
        }
        if (ans.equals(s)){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It is a NOT palindrome");
        }
    }
}
