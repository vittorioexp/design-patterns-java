package AbstractFactoryPattern.Ex1;

public interface AbstractFactory<T> {

    T create(String name);

}