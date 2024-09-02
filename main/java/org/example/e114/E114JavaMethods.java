package org.example.e114;

public class E114JavaMethods {
    public static void main(String[] args) {
        E114JavaMethods user = new E114JavaMethods();
        // Call the add method with arguments that add up to 30

        System.out.println("Addition "+user.add(15,15));
        // Call the multiply method with arguments that multiply to 30
        System.out.println("Multiplication "+user.multiply(6,5));
        // Call the subtract method with arguments that subtract to 20
        System.out.println("Subtraction "+user.subtract(30,10));
    }

    // Create method multiply with two integer parameters and a print statement to display the result
        int multiply (int a,int b){
        return a*b;
        }
    // Create method add with two integer parameters and a print statement to display the result
        int add(int a,int b){
        return a+b;
        }
    // Create method subtract with two integer parameters and a print statement to display the result
        int subtract(int a, int b){
        return a-b;
        }

}
