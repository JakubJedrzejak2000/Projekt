package com.company;

public class Abilities extends Character
{
    private double magic_dmg;
    public Abilities()
    {}
    public Abilities(double magic_dmg, double dmg, double mana)
    {
        super(dmg, mana);
        this.magic_dmg = magic_dmg;
    }

    public void setMagic_dmg(double magic_dmg)
    {
        this.magic_dmg = magic_dmg;
    }

    public double getMagic_dmg()
    {
        return magic_dmg;
    }

    public double Fireball()
    {
        super.setMana(super.getMana()-10);
        return getMagic_dmg()+10;
    }
    public double Heal()
    {
        super.setMana(super.getMana()-15);
        return getMagic_dmg()+5;
    }
    public double DoubleAttack()
    {
        super.setMana(super.getMana()-5);
        return super.getDmg()*2;
    }
    public double Shout()
    {
        super.setMana(super.getMana()-10);
        return getMagic_dmg()/2;
    }
    public void Regeneration()
    {
        super.setHp(super.getHp()+5.0);
    }
}
