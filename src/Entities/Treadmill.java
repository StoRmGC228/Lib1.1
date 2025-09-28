package Entities;

class Treadmill extends Machine {
    private int incline;

    public Treadmill(String name, Exercise exercise, int incline) {
        super(name, exercise);
        this.incline = incline;
    }

    public int getIncline() { return incline; }
}
