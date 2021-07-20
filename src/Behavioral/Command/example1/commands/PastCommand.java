package Behavioral.Command.example1.commands;

import Behavioral.Command.example1.editor.Editor;

public class PastCommand extends Command {
    public PastCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.clipboard == null || editor.clipboard.isEmpty()) return false;

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}