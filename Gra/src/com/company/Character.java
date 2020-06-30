package com.company;

public class Character
{
    private double hp;
    private double dmg;
    private double mana;
    private String name;
    private String left_Hand;
    private String right_Hand;
    public Character()
    {}
    public Character(String name, double hp, double dmg, double mana)
    {
        this.name = name;
        this.hp = hp;
        this.dmg = dmg;
        this.mana = mana;
    }

    public Character(double dmg, double mana)
    {
    }

    public void setHp(double hp)
    {
        this.hp = hp;
    }
    public void setDmg(double dmg)
    {
        this.dmg = dmg;
    }
    public void setMana(double mana)
    {
        this.mana = mana;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public void setHand(String left_Hand, String right_Hand)
    {
        this.left_Hand = left_Hand;
        this.right_Hand = right_Hand;
    }

    public double getHp()
    {
        return hp;
    }
    public double getDmg()
    {
        return dmg;
    }
    public String getName()
    {
        return name;
    }
    public double getMana()
    {
        return mana;
    }

    public String getLeft_Hand()
    {
        return left_Hand;
    }
    public String getRight_Hand()
    {
        return right_Hand;
    }
}
