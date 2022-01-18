package Singleton.Ex1;

/*

The most popular approach is to implement a Singleton by creating a regular class and making sure it has:

- A private constructor
- A static field containing its only instance
- A static factory method for obtaining the instance

 */

public final class ClassSingleton {

    private static ClassSingleton INSTANCE;
    private String info = "Initial info class";

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }

        return INSTANCE;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

}
