package org.example.e78;

public class E78Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values

        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum=0;
        for (int r = 0; r <a.length; r++) {
            for (int c = 0; c <4; c++) {
                sum+=a[r][c];
            }
        }
        System.out.println(sum);
    }
}
