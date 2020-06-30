package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int lottery;
        String menu = "1.Odbądź podróż\n2.Sprawdź ekwipunek\n3.Sprawdź zaklęcia\n4.Sprawdź statystyki";
        String menu1 = "1.Kontynuuj podróż\n2.Sprawdź ekwipunek\n3.Sprawdź zaklęcia\n4.Sprawdź statystyki";
        String path = "Wybierz kierunek(koniecznie wielkimi literami):\nN - północ\nS - Południe" +
                "\nE - Wschód\nW - Zachód";
        String option = "\nLub jeśli chcesz wrócić do menu, wybierz opcję -1.";
        int number = 0;
        ArrayList<Character> hero = new ArrayList<>();
        System.out.println("Podaj imię bohatera: ");
        String name = input.nextLine();
        System.out.println("Podaj atak bohatera:");
        double dmg = input.nextDouble();
        System.out.println("Podaj życie bohatera:");
        double hp = input.nextDouble();
        System.out.println("Podaj manę bohatera:");
        double mana = input.nextDouble();
        hero.add(new Character(name, hp, dmg, mana));
        ArrayList<Character> enemy = new ArrayList<>();
        enemy.add(new Character("Goblin", 25.0, 5.0, 0.0));
        enemy.add(new Character("Orc", 50.5, 15.0, 0.0));
        enemy.add(new Character("Troll", 100.0, 25.0, 0.0));
        ArrayList<Abilities> skills = new ArrayList<>();
        skills.add(new Abilities(15.0, hero.get(0).getDmg(), hero.get(0).getMana()));
        ArrayList<Items> equipment = new ArrayList<>();
        equipment.add(new Items());
        ArrayList<String> eq = new ArrayList<>();
        eq.add("");
        System.out.println(menu);
        int answer = input.nextInt();
        int numbers = 0;
        while (number != 1)
        {
            switch (answer)
            {
                case 1:
                    if (numbers != 1)
                    {
                        System.out.println(path);
                        numbers ++;
                    }
                    String road = input.next();
                    switch (road)
                    {
                        case "N":
                            lottery = random.nextInt(3);
                            switch (lottery)
                            {
                                case 0:
                                    System.out.println("Spotykasz na swej drodze Goblina! Przygotuj się do walki!");
                                    number = Action.fight(0, hero, enemy, skills);
                                    System.out.println(path+"\n"+option);
                                    break;
                                case 1:
                                    System.out.println("Nie możesz dalej iść, mroźne góry północy blokują Ci drogę." +
                                            " Wybierz proszę inny kierunek");
                                    System.out.println("\nS - Południe\nE - Wschód\nW - Zachód");
                                    System.out.println(option);
                                    break;
                                case 2:
                                    System.out.println("Na swej drodze spotkałeś magiczny miecz wbity w skałę.\n" +
                                            "Próbujesz go wyciągnąć, co oczywiście kończy się Twoim sukcesem" +
                                            " i dzierżysz go w swej dłoni.\nWyruszasz dalej");
                                    System.out.println(path+"\n"+option);
                                    break;
                                default:
                                    System.out.println("Default w N");
                                    break;
                            }
                            break;
                        case "S":
                            lottery = random.nextInt(4);
                            switch (lottery)
                            {
                                case 0:
                                    System.out.println("Na swej drodze spotkałeś trolla! Przygotuj się do walki!");
                                    Action.fight(2, hero, enemy, skills);
                                    System.out.println(path);
                                    System.out.println(option);
                                    break;
                                case 1:
                                    System.out.println("Na swej drodze spotkałeś Orka! Przygotuj się do walki!");
                                    Action.fight(1, hero, enemy, skills);
                                    System.out.println(path);
                                    System.out.println(option);
                                    break;
                                case 2:
                                    System.out.println("Widzisz jak z ziemi wyrasta zioło. Schylasz się by je wyrwać");
                                    eq.add("Zioło");
                                    System.out.println(path);
                                    System.out.println(option);
                                    break;
                                case 3:
                                    System.out.println("Na ziemi leży mikstura many. Szybko ją podnosisz i chowasz do torby");
                                    eq.add("Mikstura many");
                                    break;
                                default:
                                    System.out.println("Bład");
                                    break;
                            }
                            break;
                        case "E":
                            lottery = random.nextInt(3);
                            switch (lottery)
                            {
                                case 0:
                                    System.out.println("Na swej drodze spotkałeś Orka! Przygotuj się do walki!");
                                    Action.fight(1, hero, enemy, skills);
                                    System.out.println(path);
                                    System.out.println(option);
                                    break;
                                case 1:
                                    System.out.println("Na ziemi leży mikstura życia. Szybko ją podnosisz i chowasz do torby");
                                    eq.add("Mikstura życia");
                                    break;
                                case 2:
                                    System.out.println("Niestety, bagna stały się zbyt gęste byś był w stanie je przejść" +
                                            "Musisz wybrać inną drogę");
                                    System.out.println("Wybierz kierunek(koniecznie wielkimi literami):\nN - północ\nS - Południe" +
                                            "\nW - Zachód");
                                    System.out.println(option);
                            }
                            break;
                        case "W":
                            lottery = random.nextInt(2);
                            switch (lottery)
                            {
                                case 0:
                                    System.out.println("Na swej drodze spotkałeś trolla! Przygotuj się do walki!");
                                    Action.fight(2, hero, enemy, skills);
                                    System.out.println(path);
                                    System.out.println(option);
                                    break;
                                case 1:
                                    System.out.println();
                                    System.out.println("Widzisz jak z ziemi wyrasta zioło. Schylasz się by je wyrwać");
                                    eq.add("Zioło");
                                    System.out.println(path);
                                    System.out.println(option);
                                    break;
                            }
                            break;
                        case "-1":
                            numbers = 0;
                            System.out.println(menu1);
                            answer = input.nextInt();
                            break;
                        default:
                            System.out.println("Default w roadzie");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Lista Twoich przedmiotów. Jeśli chcesz któregoś użyć, wpisz jego nazwę.");
                    for (String s : eq)
                    {
                        System.out.println(s);
                    }
                    String item = input.nextLine();
                    switch (item)
                    {
                        case "Mikstura życia":
                            if (Action.checkEq("Mikstura życia", eq))
                            {
                                equipment.get(0).hpPotion();
                            }
                            else
                            {
                                System.out.println("Brak takiego przedmiotu.");
                            }
                            break;
                        case "Mikstura many":
                            if (Action.checkEq("Mikstura many", eq))
                            {
                                equipment.get(0).manaPotion();
                            }
                            else
                            {
                                System.out.println("Brak takiego przedmiotu.");
                            }
                            break;
                        case "Zioło":
                            if (Action.checkEq("Zioło", eq))
                            {
                                equipment.get(0).Herb();
                            }
                            else
                            {
                                System.out.println("Brak takiego przedmiotu.");
                            }
                            break;
                        default:
                            System.out.println("Brak takiego przedmiotu");
                            break;
                    }
                    System.out.println(menu);
                    answer = input.nextInt();
                    break;
                case 3:
                    System.out.println("Twoje zaklęcia:\nFireball\nHeal\nDouble attack\nShout");
                    System.out.println("Wywołujesz je, wpisując ich nazwę");
                    System.out.println(menu);
                    answer = input.nextInt();
                    break;
                case 4:
                    System.out.println("Imię: "+hero.get(0).getHp()+"HP:"+ hero.get(0).getHp()+"\nMP:"+ hero.get(0).getMana()
                            +"\nAtak:"+ hero.get(0).getDmg());
                    System.out.println("1.Odbądź podróż\n2.Sprawdź ekwipunek\n3.Sprawdź zaklęcia\n4.Statystyki postaci");
                    answer = input.nextInt();
                    break;
                default:
                    System.out.println("Default");
                    System.out.println("Błąd");
                    break;
            }
        }
    }

}