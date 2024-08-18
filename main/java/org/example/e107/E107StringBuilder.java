package org.example.e107;

public class E107StringBuilder {
    public static void main(String[] args) {
        // Given string
        String given = "Hello Friends";

        // Instantiate an object of the StringBuffer class with the given string
        StringBuilder user = new StringBuilder(given);
        // Use the reverse() method to reverse the string
            user.reverse();
        // Print the reversed string
        System.out.println(user);

    }
}
