public class Rocket implements SpaceShip {

    // Fields
    int cost;
    private int currentWeight;
    private static int maxWeight;

    /* Indicates whether a launch was successful */
    @Override
    public boolean launch() {
        return true;
    }

    /* Indicates whether a landing was successful */
    @Override
    public boolean land() {
        return true;
    }

    /* Indicates whether a rocket can carry an Item */
    @Override
    public final boolean canCarry(Item item) {

        return (currentWeight + item.weight) >= maxWeight;
    }

    /* Adds Item weight to a rocket's current weight,
    ie. loads a rocket */
    @Override
    public final void carry(Item item) {

        currentWeight += item.weight;
    }
}
