package Ex2;

import Ex2.Shape.Rectangle;

public class Client {
    public static void main(String[] args) {

        AbstractFactory factory = FactoryProvider.getFactory("shape");

        Rectangle r = (Rectangle) factory.create("rectangle");

        r.draw();

    }
}
