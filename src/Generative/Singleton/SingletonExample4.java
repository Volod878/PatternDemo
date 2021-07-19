package Generative.Singleton;

// Class holder singleton
// Потокобезопасна, высокая производительность в многопоточной среде
public class SingletonExample4 {

    private SingletonExample4() {}

    private static class SingletonHolder {
        public static final SingletonExample4 HOLDER_INSTANCE = new SingletonExample4();
    }

    public static SingletonExample4 getINSTANCE() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
