package org.example.e73;

import java.util.Scanner;

public class E73Arrays {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        String user1 = input.nextLine();
        String user2 = input.nextLine();
        String user3 = input.nextLine();
        String user4 = input.nextLine();
        String user5 = input.nextLine();

        int[] num={5,4,3,2,1};

        for(int i=0; i<5; i++){
            System.out.println(num[i]);
        }

    }
}
