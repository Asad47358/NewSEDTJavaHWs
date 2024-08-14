package org.example.e63;

import java.util.Scanner;

public class E63ForLoop {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        System.out.print("In: ");
        int user =input.nextInt();

        for(int i=0; i<user; i++){
            System.out.print(i+" ");
        }
    }
}
