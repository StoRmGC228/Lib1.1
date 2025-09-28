package Entities;
import java.util.*;

public class TrainingProgram {
    private List<Exercise> exercises = new ArrayList<>();

    public void addExercise(Exercise e) {
        exercises.add(e);
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    @Override
    public String toString() {
        return exercises.toString();
    }
}
