package org.example.e55;

import javax.xml.transform.Source;
import java.util.Scanner;

public class E55DoWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your favorite number:");
        int user1 = input.nextInt();

        do{
            System.out.println("You entered: "+user1);
            user1++;

        }while (user1>7);{

            System.out.println("Enter your favorite number:");
            int user2 = input.nextInt();
            System.out.println("You entered: "+user2);
            System.out.println("Enter your favorite number:");
            int user3 = input.nextInt();
            System.out.println("You entered: "+user3);

            System.out.println("You've entered 7! Loop ends.");
        }

    }
}
