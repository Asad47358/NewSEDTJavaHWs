package org.example.e102;

import java.util.Scanner;

public class E102StringManipulations {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("In:");
        String user= input.nextLine();

        // Use a for loop to iterate through the string and print each character on a separate line
        for (int i = 0; i < user.length(); i++) {
            System.out.println(user.charAt(i));
        }

    }
}
