public class U2 extends Rocket {
    // Fields
    private static int cost = 120000000;
    private int currentWeight;
    private static int maxWeight = 29000;

    // Default constructor
    U2() {
        currentWeight = 18000;
    }

    // Methods
    @Override
    public boolean launchSuccess() {

        int randNo = (int) Math.floor(Math.random() * 101);

        return (4 * (currentWeight / maxWeight) < randNo);
    }

    @Override
    public boolean landSuccess() {

        int randNo = (int) Math.floor(Math.random() * 101);

        return (8 * (currentWeight / maxWeight) < randNo);

    }
}
