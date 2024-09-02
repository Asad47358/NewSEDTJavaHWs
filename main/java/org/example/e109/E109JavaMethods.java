package org.example.e109;

public class E109JavaMethods {
    public static void main(String[] args) {
        E109JavaMethods user = new E109JavaMethods();
        // Call newLine method three times
        user.newline("newLine method implementation",3);


    }

    // Create method newLine with print statement
    void newline(String word,int num){
        for (int i = 0; i <num; i++) {
            System.out.println(word);
        }
    }


}
