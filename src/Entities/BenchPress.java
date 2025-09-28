package Entities;

class BenchPress extends Machine {
    private int weight;

    public BenchPress(String name, Exercise exercise, int weight) {
        super(name, exercise);
        this.weight = weight;
    }

    public int getWeight() { return weight; }
}