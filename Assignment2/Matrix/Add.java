package com.Assignment2.Matrix;

public class Add {
    public static void main(String[] args){
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{11,12,13},{14,15,16},{17,18,19}};
        int[][] c = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
