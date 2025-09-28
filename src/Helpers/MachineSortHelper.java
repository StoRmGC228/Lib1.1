package Helpers;

import java.util.*;
import Entities.*;
// ---------------- MachineSortHelper ----------------
public final class MachineSortHelper {

    private MachineSortHelper() { } // приватний конструктор, щоб заборонити створення об'єктів

    // ---------------- Static inner class: за назвою ----------------
    public static class NameComparator implements Comparator<Machine> {
        public int compare(Machine m1, Machine m2) {
            return m1.getMachineName().compareToIgnoreCase(m2.getMachineName());
        }
    }

    public static void sortByNameAsc(List<Machine> machines) {
        machines.sort(new NameComparator());
    }

    // ---------------- Inner class: за тривалістю вправи ----------------
    public static class DurationComparator implements Comparator<Machine> {
        public int compare(Machine m1, Machine m2) {
            return Integer.compare(m1.getExercise().getDuration(), m2.getExercise().getDuration());
        }
    }

    public static void sortByDurationDesc(List<Machine> machines) {
        machines.sort(Collections.reverseOrder(new DurationComparator()));
    }

    // ---------------- Anonymous inner class: за типом вправи ----------------
    public static void sortByTypeAnonymous(List<Machine> machines) {
        machines.sort(new Comparator<Machine>() {
            @Override
            public int compare(Machine m1, Machine m2) {
                return m1.getExercise().getType().compareToIgnoreCase(m2.getExercise().getType());
            }
        });
    }

    // ---------------- Lambda: за назвою машини ----------------
    public static void sortByNameLambda(List<Machine> machines) {
        machines.sort((m1, m2) -> m1.getMachineName().compareToIgnoreCase(m2.getMachineName()));
    }

    // ---------------- Вивід списку машин ----------------
    public static void printMachines(List<Machine> machines) {
        for (Machine m : machines) {
            System.out.println(m);
        }
    }
}
