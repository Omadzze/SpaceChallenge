public class U1 extends Rocket {

    // Default constructor
    U1() {
        cost = 100000000;
        currentWeight = 10000;
        maxWeight = 18000;
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
