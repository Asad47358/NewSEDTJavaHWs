package org.example.e79;

public class E79Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int[]sum=new int[4];
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 3; c++) {
                sum[r]=sum[r]+a[r][c];

            }
            System.out.println(sum[r]);
        }


    }
}
