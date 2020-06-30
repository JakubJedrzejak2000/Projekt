package com.company;

public class Items extends Abilities
{
    public double Heal(int heal)
    {
        return super.getMagic_dmg()+heal;
    }

    public void hpPotion()
    {
        super.setHp(super.getHp()+Heal(10));
    }
    public void manaPotion()
    {
        super.setMana(super.getMana()+Heal(15));
    }
    public void magicSword()
    {
        super.setHand(super.getRight_Hand(),"Magic sword");
        super.setDmg(super.getDmg()+super.getMagic_dmg());
    }
    public double Herb()
    {
        return Heal(5);
    }
}
