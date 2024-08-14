package org.example.e88;

public class E88ClassAndObject {

    public static void main(String[] args) {
        // Create a class named 'Dog'

        // Declare String variables named 'breed', 'name', and 'color'

        // Declare methods named 'bark()', 'run()', and 'play()' that print messages in the specified format

        // Create the first object of the class 'Dog' with breed = "Husky", name = "AnyName", color = "AnyColor"
        Dog dog1 = new Dog();
        dog1.breed="Husky";
        dog1.name="Jumy";
        dog1.color="black";
        System.out.print(dog1.breed);
        dog1.bark();
        System.out.print(dog1.breed);
        dog1.run();
        System.out.print(dog1.breed);
        dog1.play();
        // Create the second object of the class 'Dog' with breed = "Bulldog", name = "AnyName", color = "AnyColor"
        Dog dog2 = new Dog();
        dog2.breed="Bulldog";
        dog2.name="lopi";
        dog2.color="orange";
        System.out.print(dog2.breed);
        dog2.bark();
        System.out.print(dog2.breed);
        dog2.run();
        System.out.print(dog2.breed);
        dog2.play();
        // Create the third object of the class 'Dog' with breed = "Labrador", name = "AnyName", color = "AnyColor"
        Dog dog3 =new Dog();
        dog3.breed="Labrador";
        dog3.name="mesho";
        dog3.color="gray";
        // Call the methods 'bark()', 'run()', and 'play()' for each object
        System.out.print(dog3.breed);
        dog3.bark();
        System.out.print(dog3.breed);
        dog3.run();
        System.out.print(dog3.breed);
        dog3.play();



    }
}
