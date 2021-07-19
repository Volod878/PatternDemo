package Generative.Singleton;

// Паттерн проектирования Singleton
// Служит для того, чтобы у класса Singleton
// была возможность создан не более одного объекта
// Гарантирует, что у класса есть только один экземпляр,
// и предоставляет к нему глобальную точку доступа.

public class SingletonDemo {
    SingletonExample1 example1;
    SingletonExample2 example2;
    SingletonExample3 example3;
    SingletonExample4 example4;

    public static void main(String[] args) {
        SingletonDemo demo = new SingletonDemo();
        System.out.println(demo);

        System.out.println("\nInitialization");
        // Первое создание
        demo.example1 = SingletonExample1.getINSTANCE();
        demo.example2 = SingletonExample2.getINSTANCE();
        demo.example3 = SingletonExample3.getINSTANCE();
        demo.example4 = SingletonExample4.getINSTANCE();

        System.out.println(demo);

        SingletonDemo newDemo = new SingletonDemo();
        System.out.println("\nRepeat initialization");
        // Метод getINSTANCE должен вернуть ранее созданные объекты
        newDemo.example1 = SingletonExample1.getINSTANCE();
        newDemo.example2 = SingletonExample2.getINSTANCE();
        newDemo.example3 = SingletonExample3.getINSTANCE();
        newDemo.example4 = SingletonExample4.getINSTANCE();

        System.out.println(newDemo);
    }

    @Override
    public String toString() {
        return "example1 = " + example1 +
                ",\nexample2 = " + example2 +
                ",\nexample3 = " + example3 +
                ",\nexample4 = " + example4;
    }
}
