import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Simulation {

    // Methods
    public ArrayList loadItems() throws Exception {
        ArrayList loadManifest = new ArrayList();
        Scanner fileScannerOne = new Scanner(new File("phase-1.txt"));
        fileScannerOne.useDelimiter("=");

        while (fileScannerOne.hasNextLine()) {
            Item newItem = new Item();
            newItem.name = fileScannerOne.nextLine();
            newItem.weight = fileScannerOne.nextInt();
            loadManifest.add(newItem);
        }

        Scanner fileScannerTwo = new Scanner(new File("phase-2.txt"));
        fileScannerTwo.useDelimiter("=");

        while (fileScannerTwo.hasNextLine()) {
            Item newItem = new Item();
            newItem.name = fileScannerTwo.nextLine();
            newItem.weight = fileScannerTwo.nextInt();
            loadManifest.add(newItem);
        }

        return loadManifest;
    }

    public ArrayList loadU1(ArrayList list) {

    }

    public ArrayList loadU2(ArrayList list) {

    }

    public int runSimulation(ArrayList rockets) {

    }
}
