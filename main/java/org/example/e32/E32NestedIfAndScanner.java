package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your gender: M or F");
        String gender =input.next();

        System.out.println("Please enter your age");
        int age = input.nextInt();

        if(age>25)
        if(gender.equalsIgnoreCase("F")){
            System.out.println("Woman");
        }else{
            System.out.println("Man");
        }
        if(age<25)
            if(gender.equalsIgnoreCase("m")){
                System.out.println("Boy");
            }else{
                System.out.println("Girl");
            }

    }
}
