package Entities;

class ExerciseBike extends Machine {
    private int resistance;

    public ExerciseBike(String name, Exercise exercise, int resistance) {
        super(name, exercise);
        this.resistance = resistance;
    }

    public int getResistance() { return resistance; }
}

