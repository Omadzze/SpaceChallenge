import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    @SuppressWarnings("unchecked")
    public static void main(char[] args) throws Exception {

        Simulation mySim = new Simulation();

        // Run simulation for U1 fleet and display total budget
        System.out.println("Total cost for U1 fleet, phase 1: " + mySim.runSimulation(mySim.loadU1(mySim.loadItemsOne())));
        System.out.println("Total cost for U1 fleet, phase 2: " + mySim.runSimulation(mySim.loadU1(mySim.loadItemsTwo())));

        // Repeat for U2 fleet
        System.out.println("Total cost for U2 fleet, phase 1: " + mySim.runSimulation(mySim.loadU2(mySim.loadItemsOne())));
        System.out.println("Total cost for U2 fleet, phase 2: " + mySim.runSimulation(mySim.loadU2(mySim.loadItemsTwo())));
    }
}
