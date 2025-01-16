package org.example.rpg;

public abstract class Monster implements Bleedable, Poisonable {
    private String name;
    private int hitPoints;
    private double damage;
    private double health;

    public Monster(String name, int hitPoints, double damage)
    {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName()
    {
        return name;
    }

    public int getHitPoints()
    {
        return hitPoints;
    }

    public double getDamage()
    {
        return damage;
    }

    public double getHealth()
    {
        return health;
    }

    public void setHealth(int health)
    {
        this.health = health;
    }

    public double attack()
    {
        return getDamage() + bleed() + poison();
    }
}
