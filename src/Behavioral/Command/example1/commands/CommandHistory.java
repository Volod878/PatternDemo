package Behavioral.Command.example1.commands;

import java.util.Stack;

public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    //добавляем команду в конец истории
    public void push(Command command) {
        history.push(command);
    }

    //удаляем последнюю команду из истории и возвращаем ее
    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
