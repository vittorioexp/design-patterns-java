package Ex1;

import Ex1.Animal.AnimalFactory;
import Ex1.Color.ColorFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("animal")) {
            return new AnimalFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }

        return null;
    }

}