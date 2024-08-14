package org.example.e39;

import java.util.Scanner;

public class E39LogicalOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your mark");
         int mark = input.nextInt();

        if(mark>=1 && mark<=25){
            System.out.println("Your grade is F");
        }else if(mark>25 && mark<45){
            System.out.println("Your grade is E");
        }else if(mark>=46 && mark<=50){
            System.out.println("Your grade is D");
        }else if(mark>=51 && mark<=60){
            System.out.println("Your grade is C");
        }else if(mark>=61 && mark<=80){
            System.out.println("Your grade is B");
        }else if(mark>80){
            System.out.println("Your grade is A");
        }else if(mark<0){
            System.out.println("Please enter valid mark");
        }

    }
}
