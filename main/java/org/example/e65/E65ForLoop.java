package org.example.e65;

import java.util.Scanner;

public class E65ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input = new Scanner(System.in);
        System.out.print("In: ");
        int user = input.nextInt();
       if (user == 7) {
           for (int i = 6; i >= 0; i--) {
               System.out.print(i + " ");
           }
           }
        System.out.println();
        System.out.print("In: ");
        int user1 = input.nextInt();
       if (user1 == 12) {
           for (int a = 11; a >= 0; a--) {
               System.out.print(a + " ");
           }
       }
        System.out.println();
        System.out.print("In: ");
        int user2 = input.nextInt();
       if(user2 ==20){
           for(int b=19; b>=0; b--){
               System.out.print(b+" ");
           }
       }
        System.out.println();
    }
}
