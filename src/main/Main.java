package main;

import main.Dungeons.Dungeon;
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
        Dungeon dungeon = new Dungeon();
        if(party.enterDungeon(dungeon)) {
            party.setDungeon(dungeon);
            party.runDungeon();
        } else System.out.println("Не удается войти.");

    }
}
