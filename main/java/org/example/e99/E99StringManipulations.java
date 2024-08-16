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
       String a= user.toLowerCase();
       String b=a.replaceAll(" ","");
        // Check if the string is a palindrome

        // Print "true" if the string is a palindrome, and "false" otherwise
        if(user==b){
            System.out.println("true");
        }else{
            System.out.println(false);
        }
    }
}
