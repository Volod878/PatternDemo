package Behavioral.Command.example2;

// Invoker
public class Developer {

    void execute(Command command) {
        System.out.println("Developer: - Сейчас, только докурю");
        command.execute();
    }
}
