package ru.rzn.sbt.javaschool.lesson3.army;

import java.util.Objects;

/**
 * Оружие
 */
final public class Weapon {

    /**
     * Тип оружия
     */
    private final WeaponType weaponType;

    /**
     * Урон
     */
    private final int damage;

    /**
     * Стоимость
     */
    private final int cost;

    public Weapon(WeaponType weaponType, int damage, int cost) {
        this.weaponType = weaponType;
        this.damage = damage;
        this.cost = cost;
    }

    public WeaponType getWeaponType() {
        return weaponType;
    }

    public int getDamage() {
        return damage;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Weapon.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Weapon other = (Weapon) obj;
        if (!Objects.equals(this.weaponType, other.weaponType)) {
            return false;
        }
        if (this.cost != other.cost) {
            return false;
        }
        if (this.damage != other.damage) {
            return false;
        }
        return true;
    }
}
