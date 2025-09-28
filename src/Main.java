import Entities.*;
import Helpers.MachineSortHelper;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Machine> machines = new ArrayList<>();
    machines.add(new Machine("Treadmill", new Exercise("Cardio Exercise", 20, "Cardio")));
    machines.add(new Machine("Bike", new Exercise("Bike Exercise", 15, "Cardio")));
    machines.add(new Machine("Rowing Machine", new Exercise("Rowing Exercise", 25, "Strength")));
    machines.add(new Machine("Elliptical", new Exercise("Elliptical Exercise", 30, "Cardio")));

    System.out.println("---- Початковий список машин ----");
    MachineSortHelper.printMachines(machines);

    System.out.println("\n---- Сортування за назвою (Asc) ----");
    MachineSortHelper.sortByNameAsc(machines);
    MachineSortHelper.printMachines(machines);

    System.out.println("\n---- Сортування за тривалістю вправи (Desc) ----");
    MachineSortHelper.sortByDurationDesc(machines);
    MachineSortHelper.printMachines(machines);

    System.out.println("\n---- Сортування за типом вправи (Anonymous) ----");
    MachineSortHelper.sortByTypeAnonymous(machines);
    MachineSortHelper.printMachines(machines);

    System.out.println("\n---- Сортування за назвою (Lambda) ----");
    MachineSortHelper.sortByNameLambda(machines);
    MachineSortHelper.printMachines(machines);
}


