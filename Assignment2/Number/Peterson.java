package com.Assignment2.Number;
import java.util.Scanner;

public class Peterson {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();
        int ans = 0;
        String s = String.valueOf(inp);
        for (int n = 0; n < s.length(); n++){
            int num = Character.getNumericValue(s.charAt(n));
            int fact = 1;
            for (int i = 1; i <= num; i++){
                fact = fact*i;
            }
            ans = fact + ans;
        }
        if (ans == inp){
            System.out.println("It is a Peterson number");
        }
        else{
            System.out.println("It is NOT a Peterson number");
        }
    }
}
