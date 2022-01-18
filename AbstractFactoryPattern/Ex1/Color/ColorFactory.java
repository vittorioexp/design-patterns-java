package Ex1.Color;

import Ex1.AbstractFactory;

public class ColorFactory implements AbstractFactory {

    @Override
    public Object create(String name) {
        if (name.equalsIgnoreCase("yellow")) {
            Color c = new Yellow();
            return c;
        }
        return null;
    }
}
