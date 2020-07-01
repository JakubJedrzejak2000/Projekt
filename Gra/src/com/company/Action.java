package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Action
{
    public static int fight(int level, ArrayList<Character> hero, ArrayList<Character> enemies, ArrayList<Abilities> skill)
    {
        Scanner input = new Scanner(System.in);
        while ((hero.get(0).getHp() != 0) && (enemies.get(level).getHp() != 0)) {
        System.out.println("Wybierz działanie:\n1.Atak\n2.Użycie zaklęcia");
        String att = input.nextLine();
        switch (att) {
            case "1":
                hero.get(0).setHp(hero.get(0).getHp() - enemies.get(level).getDmg());
                enemies.get(level).setHp(enemies.get(level).getHp() - hero.get(0).getDmg());
                System.out.println("Twoje życie: " + hero.get(0).getHp() + "\nŻycie przeciwnika: "
                        + enemies.get(level).getHp());
                break;
            case "2":
                System.out.println("Wpisz nazwę zaklęcia");
                String spell = input.nextLine();
                switch (spell) {
                    case "Fireball":
                        hero.get(0).setHp(hero.get(0).getHp() - enemies.get(level).getDmg());
                        enemies.get(level).setHp(enemies.get(level).getHp() - skill.get(0).Fireball());
                        System.out.println("Twoje życie: " + hero.get(0).getHp() + "\nŻycie przeciwnika: "
                                + enemies.get(level).getHp());
                        break;
                    case "Heal":
                        hero.get(0).setHp(hero.get(0).getHp() - enemies.get(level).getDmg());
                        hero.get(0).setHp(hero.get(0).getHp() + skill.get(0).Heal());
                        System.out.println("Twoje życie: " + hero.get(0).getHp() + "\nŻycie przeciwnika: "
                                + enemies.get(level).getHp());
                        break;
                    case "Dobule attack":
                        hero.get(0).setHp(hero.get(0).getHp() - enemies.get(level).getDmg());
                        enemies.get(level).setHp(enemies.get(level).getHp() - skill.get(0).DoubleAttack());
                        System.out.println("Twoje życie: " + hero.get(0).getHp() + "\nŻycie przeciwnika: "
                                + enemies.get(level).getHp());
                        break;
                    case "Shout":
                        hero.get(0).setHp(hero.get(0).getHp() - enemies.get(0).getDmg());
                        enemies.get(level).setHp(enemies.get(level).getHp() - skill.get(0).Shout());
                        System.out.println("Twoje życie: " + hero.get(0).getHp() + "\nŻycie przeciwnika: "
                                + enemies.get(level).getHp());
                        break;
                    default:
                        System.out.println("Niepoprawne działanie");
                }
        }
        if (hero.get(0).getHp() <=0 )
        {
            System.out.println("Zginąłeś");
            return 1;
        }
        else if (enemies.get(level).getHp() <= 0)
        {
            System.out.println("Brawo! Zabiłeś przeciwnika!");
            break;
        }

    }
        return 0;
    }
    public static boolean checkEq(String word, ArrayList<String> eq)
    {
        boolean answers = false;
        for (String o : eq) {
            if (o.equals(word)) {
                answers = true;
                break;
            }
        }
        return answers;

    }
}
