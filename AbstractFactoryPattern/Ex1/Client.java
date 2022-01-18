package Ex1;

import Ex1.Animal.Animal;
import Ex1.Animal.AnimalFactory;
import Ex1.Animal.Duck;
import Ex1.Color.Color;
import Ex1.Color.ColorFactory;

public class Client{
    public static void main(String[] args) {

        // Use the factory provider to get the animal factory
        AbstractFactory factory = FactoryProvider.getFactory("animal");

        // Use the factory to instantiate an object
        Duck d = (Duck) factory.create("duck");

        System.out.println(d.makeSound());


    }
}