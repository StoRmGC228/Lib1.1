package Entities;
import java.util.*;

public class MachineManager {
    private List<Machine> machines;

    public MachineManager(List<Machine> machines) {
        this.machines = machines;
    }

    public List<Machine> findMachines(Exercise e) {
        List<Machine> result = new ArrayList<>();
        for (Machine m : machines) {
            if (m.getExercise().getType().equalsIgnoreCase(e.getType())) {
                result.add(m);
            }
        }
        return result;
    }
}
