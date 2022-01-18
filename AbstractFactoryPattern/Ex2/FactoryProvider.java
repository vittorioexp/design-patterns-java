package Ex2;

import Ex2.Shape.ShapeFactory;

public class FactoryProvider {

    public static AbstractFactory getFactory(String name) {
        if (name.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }
        return null;
    }

}
