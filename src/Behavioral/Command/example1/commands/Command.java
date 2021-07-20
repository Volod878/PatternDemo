package Behavioral.Command.example1.commands;

import Behavioral.Command.example1.editor.Editor;

public abstract class Command {
    public Editor editor;
    private String backup; //резервное копирование

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.textField.getText();
    }

    public void undo(){
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
