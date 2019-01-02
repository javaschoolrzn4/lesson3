package ru.rzn.sbt.javaschool.lesson3.army;

/**
 * Воин
 */
final public class Warrior {
    /**
     * Оружие
     */
    private Weapon weapon;

    /**
     * Сила
     */
    private final int strength;

    public Warrior(int strength) {
        this(null, strength);
    }

    public Warrior(Weapon weapon, int strength) {
        this.weapon = weapon;
        this.strength = strength;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getStrength() {
        return strength;
    }
}
