public class U1 extends Rocket {

    // Fields
    private static int cost = 100000000;
    private int currentWeight;
    private static int maxWeight = 18000;

    // Default constructor
    U1() {
        currentWeight = 10000;
    }

    /* Indicates whether a launch was successful */
    @Override
    public boolean launch() {
        int randNo = (int) Math.floor(Math.random() * 101);

        return (5 * (currentWeight / maxWeight)) < randNo;
    }

    /* Indicates whether a landing was successful */
    @Override
    public boolean land() {
        int randNo = (int) Math.floor(Math.random() * 101);

        return (currentWeight / maxWeight) < randNo;
    }
}
