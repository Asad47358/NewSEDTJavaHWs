package org.example.e67;

public class E67Arrays {
    public static void main(String[] args) {
        // Create an array of integers and store the values 45, 78, 12, 67, 55, 89, 23, 77, and 88
        int[] num={45, 78, 12, 67, 55, 89, 23, 77,88};

        // Use a loop to iterate through the array and print the values at even indices followed by a space
        for (int n = 0; n < num.length; n+=2) {
            System.out.print(num[n]+" ");
            }
        System.out.println();


    }
}
