package org.example.e81;

public class E81Arrays {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given values
        int[][] a = {
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum = 0;
        // Use nested loops to iterate through the 2D array and sum the elements that are on even indexes and even rows
        for (int i = 0; i < a.length; i++) {
            for (int r = 0; r <a[i].length; r++) {
                if(i%2==0 && r%2==0){
                    sum+=a[i][r];
                }
            }
        }
        System.out.println(sum);
    }
}
//if (i % 2 == 0 && r % 2 == 0) {
//if conditions like this
//It worked
//Why we can’t do
//If (i ][r]%2==0){

//The condition if (i % 2 == 0 && r % 2 == 0) is checking if both i (the row index) and r (the column index) are even. This is the correct way to determine if an element is on an even row and an even column. The condition ensures that only elements at positions with both even row and even column indices are summe
//The condition if (i % 2 == 0 && r % 2 == 0) is used to check if both indices i and r are even. Here's the breakdown:
//
//i % 2 == 0: Checks if the row index i is even.
//r % 2 == 0: Checks if the column index r is even.
//This ensures that only elements in positions (i, r) where both i and r are even are considered.