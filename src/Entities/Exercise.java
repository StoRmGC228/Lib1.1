package Entities;

public class Exercise {
    private String name;
    private int duration; // хвилини
    private String type;

    public Exercise(String name, int duration, String type) {
        this.name = name;
        this.duration = duration;
        this.type = type;
    }

    public String getName() { return name; }
    public int getDuration() { return duration; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return name + " (" + type + ", " + duration + " min)";
    }
}
