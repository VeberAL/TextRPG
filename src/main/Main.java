package main;

import main.GameClasses.Characters.Archer;
import main.GameClasses.Characters.Healer;
import main.GameClasses.Characters.Mage;
import main.GameClasses.Characters.Warrior;

public class Main {
    public static void main(String[] args) {
        Party party = new Party(new Mage("Merlin"),
                                new Warrior("Top"),
                                new Archer("GreenArrow"),
                                new Healer("Support"));
        party.info();


    }
}
