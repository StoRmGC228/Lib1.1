package Entities;

public class Machine {
    private String machineName;
    private Exercise exercise;

    public Machine(String machineName, Exercise exercise) {
        this.machineName = machineName;
        this.exercise = exercise;
    }

    public String getMachineName() { return machineName; }
    public Exercise getExercise() { return exercise; }

    @Override
    public String toString() {
        return machineName + " -> " + exercise;
    }
}
