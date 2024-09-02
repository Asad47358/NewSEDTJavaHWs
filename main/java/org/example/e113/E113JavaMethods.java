package org.example.e113;

public class E113JavaMethods {
    public static void main(String[] args) {
        E113JavaMethods user = new E113JavaMethods();
        // Call method printTime with arguments 11 and 30
        user.printTime(11,30);
    }

    // Create method printTime with two integer parameters (hours and minutes)
    void printTime(int hour, int minutes){
        System.out.println(hour+":"+minutes);
    }
    // and a print statement to display the time

}
