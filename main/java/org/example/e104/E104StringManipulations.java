package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("In:");
        String[] name = new String[5];


        for (int i = 0; i < name.length; i++) {
            name[i] = input.nextLine();
        }
               for(String namees : name){
            if(namees.length()>=3){
                System.out.println(namees.substring(0,3));
            }else {
                System.out.println(namees);
            }
        }
    }
}



