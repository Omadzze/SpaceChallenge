public class U2 extends Rocket {

    // Fields
    private static int cost = 120000000;
    private int currentWeight;
    private static int maxWeight = 29000;

    // Default constructor
    U2() {
        currentWeight = 18000;
    }

    /* Indicates whether a launch was successful. */
    @Override
    public boolean launch() {

        int randNo = (int) Math.floor(Math.random() * 101);

        return (4 * (currentWeight / maxWeight) < randNo);
    }

    /* Indicates whether a launch was successful. */
    @Override
    public boolean land() {

        int randNo = (int) Math.floor(Math.random() * 101);

        return (8 * (currentWeight / maxWeight) < randNo);

    }
}
