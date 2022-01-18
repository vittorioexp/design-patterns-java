package AbstractFactoryPattern.Ex2;

public interface AbstractFactory<T> {

    T create(String name);

}
