package com.Assignment2.Number;

public class Bouncy {
    public static void main(String[] args){
        String inp = "29086";
        boolean i = false;
        boolean d = false;
        for(int n = 0; n < inp.length()-1; n++){
            if (i & d){
                System.out.println("It is a Bouncy number");
                System.exit(0);
            }
            if (Character.getNumericValue(inp.charAt(n)) > Character.getNumericValue(inp.charAt(n+1))){
                d = true;
            }
            if (Character.getNumericValue(inp.charAt(n)) < Character.getNumericValue(inp.charAt(n+1))){
                i = true;
            }
        }
        System.out.println("It is NOT a Bouncy number");
    }
}
