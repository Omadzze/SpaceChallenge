public interface SpaceShip {

    public boolean launchSuccess();
    public boolean landSuccess();
    public boolean canCarry(Item item);
    public void carry(Item item);
}
