package Ex1.Animal;

import Ex1.AbstractFactory;

public class AnimalFactory implements AbstractFactory<Animal> {

    @Override
    public Animal create(String name) {
        if (name.equalsIgnoreCase("duck")) {
            Animal a = new Duck();
            return a;
        }
        return null;
    }


}