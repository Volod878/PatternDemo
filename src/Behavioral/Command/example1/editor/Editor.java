package Behavioral.Command.example1.editor;

import Behavioral.Command.example1.commands.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Invoker and Receiver
public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();

    public void init() {
        JFrame frame = new JFrame("Редактор текста");
        JPanel content = new JPanel();
        frame.setContentPane(content);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content,BoxLayout.X_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton ctrlX = new JButton("Ctrl+X");
        JButton ctrlV = new JButton("Ctrl+V");
        JButton ctrlC = new JButton("Ctrl+C");
        JButton ctrlZ = new JButton("Ctrl+Z");
        Editor editor = this;
        ctrlX.addActionListener(actionEvent -> executeCommand(new CutCommand(editor)));
        ctrlV.addActionListener(actionEvent -> executeCommand(new PastCommand(editor)));
        ctrlC.addActionListener(actionEvent -> executeCommand(new CopyCommand(editor)));
        ctrlZ.addActionListener(actionEvent -> undo());
        buttons.add(ctrlC);
        buttons.add(ctrlX);
        buttons.add(ctrlV);
        buttons.add(ctrlZ);
        content.add(buttons);
        frame.setSize(450, 200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }

    private void undo() {
        if (history.isEmpty()) return;

        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
