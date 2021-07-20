package Behavioral.Command.example2;

// Client
public class Director {
    private final TeamLeader teamLeader = new TeamLeader();

    public void newIdea(String idea) {
        Command command = teamLeader::task;
        teamLeader.giveTask(idea, command);
    }
}
