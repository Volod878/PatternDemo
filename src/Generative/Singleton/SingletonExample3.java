package Generative.Singleton;

// Double checked locking
// Потокобезопасна, высокая производительность в многопоточной среде
// Работает начиная с Java 5
public class SingletonExample3 {
    private static volatile SingletonExample3 INSTANCE;

    private SingletonExample3() {}

    public static synchronized SingletonExample3 getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (SingletonExample3.class) {
                if (INSTANCE == null) INSTANCE = new SingletonExample3();
            }
        }
        return INSTANCE;
    }
}
