package org.example.e72;

import java.util.Scanner;

public class E72Arrays {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter day 1 of the week");
        String user=input.nextLine();

        System.out.println("Please enter day 2 of the week");
        String user2=input.nextLine();

        System.out.println("Please enter day 3 of the week");
        String user3=input.nextLine();

        System.out.println("Please enter day 4 of the week");
        String user4=input.nextLine();

        System.out.println("Please enter day 5 of the week");
        String user5=input.nextLine();

        System.out.println("Please enter day 6 of the week");
        String user6=input.nextLine();

        System.out.println("Please enter day 7 of the week");
        String user7=input.nextLine();

        // Create an array of strings with size 7

        String[] days={"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};

        for(int i=0; i<7;i++){
            System.out.println(days[i]);
        }



    }
}
