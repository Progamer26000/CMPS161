package me.echols.cmps.assignment2;

public class Player implements LivingEntity {

    private int health ;
    private String name;

    public Player(String name) {
    this.name = name;
    }

    @Override
    public int getHealth() {

        return health;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void getInventory() {

    }
}
