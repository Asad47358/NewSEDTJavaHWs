package org.example.e82;

public class E82NestedForLoops {
    public static void main(String[] args) {
        // Declare and initialize the 2D array with the given pattern values
        String[][] pattern = {
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*"}
        };

        // Use nested loops to iterate through the 2D array and print the pattern
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(pattern[i][j]+" ");
            }
            System.out.println();
        }
    }
}
