package com.Assignment2.Basic;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 1){
            System.out.println("NOT a Prime Number");
            System.exit(0);
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println("NOT a Prime Number");
                System.exit(0);
            }
        }
        System.out.println("It is a Prime Number");
    }
}
