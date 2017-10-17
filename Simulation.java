import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Simulation {

    //

    /* Loads all items from a text file
    and returns an ArrayList of Items */
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

    /* Takes the ArrayList of Items and starts creating U1 rockets,
    filling them with those items until all items are loaded.
    Returns the ArrayList of those U1 rockets that are fully loaded */
    @SuppressWarnings("unchecked")
    public ArrayList loadU1(ArrayList list) {
        // ArrayList to hold rockets
        ArrayList rocketsOne = new ArrayList();

        // New rocket
        Rocket newOne = new U1();

        for (int i = 0; i < list.size(); i++) {
            if (newOne.canCarry((Item) list.get(i))) {
                rocketsOne.add(newOne);
            } else {
                newOne = new U1;
                rocketsOne.add(newOne);
            }
        }
        return rocketsOne;
    }

    /* Takes the ArrayList of Items and starts creating U2 rockets,
    filling them with those items until all items are loaded.
    Returns the ArrayList of those U2 rockets that are fully loaded */
    public ArrayList loadU2(ArrayList list) {

    }

    /* Takes an ArrayList of Rockets and calls launch and land methods
    for each of the rockets in the ArrayList. Every time a rocket explodes
    or crashes (i.e if launch or land return false) it will have to send
    that rocket again. All while keeping track of the total budget required
    to send each rocket safely to Mars.

    Returns the total budget required to send all rockets
    (including the crashed ones) */
    public int runSimulation(ArrayList rockets) {

    }
}
