package org.example.e104;

import java.util.Scanner;

public class E104StringManipulations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Example:");
        String a =input.nextLine();
        String b =input.nextLine();
        String c =input.nextLine();
        String d =input.nextLine();
        String e =input.nextLine();
        String[] arr = new String[5];
        System.out.println();

       arr [0] = "John";
        arr [1] = "Jane";
       arr [2] = "Jimmy";
        arr [3] = "Mike";
       arr [4] = "Emily";


        for (int i = 0; i < a.length(); i++) {
                System.out.println(a+b+c+d+e.substring(0,3));
                break;
            }

        }

    }



