package org.example.e117;

public class E117JavaMethods {
    public static void main(String[] args) {
        E117JavaMethods user = new E117JavaMethods();
        // Call the sumEvenToX method with various arguments to test the method
       int result1= user.sumEvenToX(5);
       int result2= user.sumEvenToX(10);
        System.out.println("sumEvenToX(5) ==> "+result1);
        System.out.println("sumEvenToX(8) ==> "+result2);

    }

    // Create method sumEvenToX with an integer parameter (
    int sumEvenToX(int x){
       int sum=0;
        for (int i = 1; i < x; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
    }
    // Inside the method, calculate the sum of even integers from 1 to x
    // Return the calculated sum
}
