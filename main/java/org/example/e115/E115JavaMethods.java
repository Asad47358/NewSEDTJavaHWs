package org.example.e115;

public class E115JavaMethods {
    public static void main(String[] args) {
        E115JavaMethods user = new E115JavaMethods();
        // Call the convertToUpper method and print the result
        System.out.println(user.converToUpper("test"));
    }

    // Create method convertToUpper with a string parameter
    String converToUpper(String a){
        return a.toUpperCase();
    }
    // Inside the method, convert the string to uppercase using toUpperCase method
    // Return the new uppercase string
}
