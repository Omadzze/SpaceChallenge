interface SpaceShip {

    /* Indicates whether a launch was successful. */
    boolean launch();

    /* Indicates whether a landing was successful. */
    boolean land();

    /* Indicates whether a rocket can carry an Item. */
    boolean canCarry(Item item);

    /* Adds Item weight to a rocket's current weight,
    ie. loads a rocket. */
    void carry(Item item);
}
