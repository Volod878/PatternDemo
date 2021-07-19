package Generative.Singleton;

// Lazy Initialization
// Не подходит для многопоточной среды
public class SingletonExample1 {
    private static SingletonExample1 INSTANCE;

    private SingletonExample1() {}

    public static SingletonExample1 getINSTANCE() {
        if (INSTANCE == null) INSTANCE = new SingletonExample1();

        return INSTANCE;
    }
}
