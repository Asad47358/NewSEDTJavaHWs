package org.example.e105;

import java.util.Scanner;

public class E105StringManipulations {
    public static void main(String[] args) {

Scanner inp=new Scanner(System.in);
        // Prompt the user to input a string
        System.out.println("In:");
        String user = inp.nextLine();

        // Use a for loop to iterate through the string and print only the vowels

        for (int i = 0; i < user.length(); i++) {
            if(user.charAt(i)=='o'){
                System.out.print(user.charAt(i));
            }else if(user.charAt(i)=='e'){
                System.out.print(user.charAt(i));
            }else if(user.charAt(i)=='i') {
                System.out.print(user.charAt(i));
            }else if(user.charAt(i)=='a') {
                System.out.print(user.charAt(i));
            }else if(user.charAt(i)=='u') {
                System.out.print(user.charAt(i));
            }
        }

        // (Your code goes here)
       // System.out.println(user);
        System.out.println();

    }
}
