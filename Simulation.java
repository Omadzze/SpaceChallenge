import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

class Simulation {

    /* Loads all items from phase-1.txt
    and returns an ArrayList of Items.

    Line splitting method from
    https://stackoverflow.com/a/15903334/7041984 */
    @SuppressWarnings("unchecked")
    ArrayList<Item> loadItemsOne() throws Exception {

        ArrayList<Item> loadManifest = new ArrayList();
        Scanner fileScanner = new Scanner(new File("phase-1.txt"));

        while (fileScanner.hasNextLine()) {
            Item newItem = new Item();
            String[] tokens = fileScanner.nextLine().split("=");
            newItem.name = tokens[0];
            newItem.weight = Integer.parseInt(tokens[tokens.length-1]);

            loadManifest.add(newItem);
        }
        return loadManifest;
    }

    /* Loads all items from phase-2.txt
    and returns an ArrayList of Items.

    Line splitting method from
    https://stackoverflow.com/a/15903334/7041984 */
    @SuppressWarnings("unchecked")
    ArrayList<Item> loadItemsTwo() throws Exception {

        ArrayList<Item> loadManifest = new ArrayList();
        Scanner fileScanner = new Scanner(new File("phase-2.txt"));

        while (fileScanner.hasNextLine()) {
            Item newItem = new Item();
            String[] tokens = fileScanner.nextLine().split("=");
            newItem.name = tokens[0];
            newItem.weight = Integer.parseInt(tokens[tokens.length-1]);

            loadManifest.add(newItem);
        }
        return loadManifest;
    }

    /* Takes the ArrayList of Items and starts creating U1 rockets,
    filling them with those items until all items are loaded.
    Returns the ArrayList of those U1 rockets that are fully loaded */
    @SuppressWarnings("unchecked")
    ArrayList<Rocket> loadU1(ArrayList<Item> list) {

        ArrayList<Rocket> rocketsOne = new ArrayList();
        Rocket newOne = new U1();

        for (Item thisItem : list) {
            if (newOne.canCarry(thisItem)) {
                rocketsOne.add(newOne);
            } else {
                newOne = new U1();
                rocketsOne.add(newOne);
            }
        }
        return rocketsOne;
    }

    /* Takes the ArrayList of Items and starts creating U2 rockets,
    filling them with those items until all items are loaded.
    Returns the ArrayList of those U2 rockets that are fully loaded */
    @SuppressWarnings("unchecked")
    ArrayList<Rocket> loadU2(ArrayList<Item> list) {

        ArrayList<Rocket> rocketsTwo = new ArrayList();
        Rocket newTwo = new U2();

        for (Item thisItem : list) {
            if (newTwo.canCarry(thisItem)) {
                rocketsTwo.add(newTwo);
            } else {
                newTwo = new U2();
                rocketsTwo.add(newTwo);
            }
        }
        return rocketsTwo;
    }

    /* Takes an ArrayList of Rockets and calls launch and land methods
    for each of the rockets in the ArrayList. Every time a rocket explodes
    or crashes (i.e if launch or land return false) it will have to send
    that rocket again. All while keeping track of the total budget required
    to send each rocket safely to Mars.

    Returns the total budget required to send all rockets
    (including the crashed ones) */
    int runSimulation(ArrayList<Rocket> rockets) {

        int totalCost = 0;

        for (Rocket currentRocket : rockets) {
            totalCost += currentRocket.getCost();

            while (!currentRocket.launch() || !currentRocket.land()) {
                totalCost += currentRocket.getCost();
            }
        }
        return totalCost;
    }
}
