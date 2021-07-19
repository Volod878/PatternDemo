package Generative.Singleton;

// Synchronized Accessor
// Потокобезопасна, но низкая производительность в многопоточной среде
public class SingletonExample2 {
    private static SingletonExample2 INSTANCE;

    private SingletonExample2() {}

    public static synchronized SingletonExample2 getINSTANCE() {
        if (INSTANCE == null) INSTANCE = new SingletonExample2();

        return INSTANCE;
    }
}
