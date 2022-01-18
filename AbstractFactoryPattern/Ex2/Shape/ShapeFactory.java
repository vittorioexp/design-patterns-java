package Ex2.Shape;

import Ex2.AbstractFactory;

public class ShapeFactory implements AbstractFactory {

    @Override
    public Object create(String name) {
        if (name.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        } else if (name.equalsIgnoreCase("square")) {
            return new Square();
        }
        return null;
    }
}
