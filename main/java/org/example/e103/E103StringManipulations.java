package org.example.e103;

import java.util.Scanner;

public class E103StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to input a string
        System.out.print("In:");
        String user = input.nextLine();
        
        // Use a for loop to iterate through the string and print each character separated by spaces on the same line
        for (int i = 0; i < user.length(); i++) {
            System.out.print(user.charAt(i)+" ");
        }

    }
}
