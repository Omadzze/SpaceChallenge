public class U1 extends Rocket {
    // Fields
    private static int cost = 100000000;
    private int currentWeight;
    private static int maxWeight = 18000;

    // Default constructor
    U1() {
        currentWeight = 10000;
    }

    // Methods
    @Override
    public boolean launchSuccess() {
        int randNo = (int) Math.floor(Math.random() * 101);

        return (5 * (currentWeight / maxWeight)) < randNo;
    }

    @Override
    public boolean landSuccess() {
        int randNo = (int) Math.floor(Math.random() * 101);

        return (currentWeight / maxWeight) < randNo;
    }
}
