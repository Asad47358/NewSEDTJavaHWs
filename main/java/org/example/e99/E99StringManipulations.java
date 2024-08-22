package org.example.e99;

import java.util.Scanner;

public class E99StringManipulations {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("Please enter a string:");

        // Read the input string
        String user = input.nextLine();

        // Remove all spaces and convert the string to lowercase
          user= user.toLowerCase().replace(" "," ");
        System.out.println(user);
        // Check if the string is a palindrome
        StringBuilder reversdword = new StringBuilder(user);
        reversdword = reversdword.reverse();
        String toComp = reversdword.toString();
        // Print "true" if the string is a palindrome, and "false" otherwise

        if(user.equals(toComp)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



        // Step 2: Create a Scanner object to read input from the console



    }
}
