package com.Assignment2.Matrix;

public class Transpose {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] trans = new int[a[0].length][a.length];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                trans[i][j] = a[j][i];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();//new line
        }
        System.out.println("\nAfter Transpose:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();//new line
        }

    }
}
