public class Rocket implements SpaceShip {

    // Methods
    @Override
    public boolean launchSuccess() {
        return true;
    }

    @Override
    public boolean landSuccess() {
        return true;
    }

    @Override
    public final boolean canCarry(Item item) {

        return (currentWeight + item.weight) > maxWeight;
    }

    @Override
    public final void carry(Item item) {

        currentWeight += item.weight;
    }
}
