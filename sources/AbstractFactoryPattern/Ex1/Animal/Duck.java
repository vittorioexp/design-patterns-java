
package AbstractFactoryPattern.Ex1.Animal;

public class Duck implements Animal {

    @Override
    public String getType() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Squeks";
    }
}