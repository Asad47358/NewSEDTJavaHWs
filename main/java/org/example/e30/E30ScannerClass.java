package org.example.e30;

import java.util.Scanner;

public class E30ScannerClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the month number");
        int monthNumber = input.nextInt();

        if(monthNumber==monthNumber){
            if (monthNumber==1){
                System.out.println("January");
            } if (monthNumber==2){
                System.out.println("February");
            } if(monthNumber==3){
                System.out.println("March");
            } if (monthNumber==4){
                System.out.println("April");
            } if (monthNumber==5){
                System.out.println("May");
            } if (monthNumber==6){
                System.out.println("June");
            } if (monthNumber==7){
                System.out.println("July");
            } if (monthNumber==8){
                System.out.println("August");
            }if (monthNumber==9){
                System.out.println("September");
            }if (monthNumber==10){
                System.out.println("October");
            } if (monthNumber==11){
                System.out.println("November");
            } if (monthNumber==12){
                System.out.println("December");
            }else{
                if(monthNumber>=12){
                    System.out.println("Invalid");
                }
            }
        }
        }

    }

