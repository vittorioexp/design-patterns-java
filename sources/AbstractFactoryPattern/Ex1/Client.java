package AbstractFactoryPattern.Ex1;

import AbstractFactoryPattern.Ex1.Animal.Duck;

public class Client{
    public static void main(String[] args) {

        // Use the factory provider to get the animal factory
        AbstractFactory factory = FactoryProvider.getFactory("animal");

        // Use the factory to instantiate an object
        Duck d = (Duck) factory.create("duck");

        System.out.println(d.makeSound());


    }
}