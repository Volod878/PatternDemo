package Behavioral.Command.example2;

// Receiver
public class TeamLeader {

    // Метод будет вызван командой
    public void task() {
        checkExecution();
    }

    public void giveTask(String task, Command command) {
        Developer developer = new Developer();
        System.out.println("Team Leader: - Тебе нужно " + task);
        developer.execute(command);
    }

    private void checkExecution() {
        System.out.println("Team Leader:");
        for (int i = 0; i < 10; i++) {
            System.out.println("- Ты все закончил? Давай быстрее!!!");
        }
        System.out.println();
    }
}
