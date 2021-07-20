package Behavioral.Command;

import Behavioral.Command.example1.editor.Editor;
import Behavioral.Command.example2.Director;

public class CommandDemo {
    public static void main(String[] args) {
        /*
         Example 1
        */
//        Editor editor = new Editor();
//        editor.init();



        /*
         Example 2
        */
        Director director = new Director();
        director.newIdea("создать ИИ чтобы поработить весь мир. Чтобы завтра было готово!");

        director.newIdea("создать Minecraft");
    }
}
