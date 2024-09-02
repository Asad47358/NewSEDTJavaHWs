package org.example.e116;

public class E116JavaMethods {
    public static void main(String[] args) {
        // Call the bothEven method with various arguments to test the method
        E116JavaMethods user = new E116JavaMethods();
       boolean result = user.bothEven(3,9);
        System.out.println(result);
    }

    // Create method bothEven with two integer parameters
    boolean bothEven (int a,int b){
        if (a%2==0 && b%2==0){
            return true;
        }else{
            return false;
        }
    }
    // Inside the method, check if both numbers are even
    // Return true if both numbers are even, otherwise return false
}
