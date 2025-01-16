package org.example.rpg;

public class Werewolf extends Monster{

    public Werewolf(String name, int hitPoints, double damage)
    {
        super(name,hitPoints,damage);
    }

    @Override
    public double bleed()
    {
        return getDamage()*0.5;
    }

    @Override
    public double poison()
    {
        return getDamage()*0.6;
    }
}
