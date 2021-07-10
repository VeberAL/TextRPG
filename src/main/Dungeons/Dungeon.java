package main.Dungeons;

import main.Monsters.MonsterClass;
import main.Party;

public class Dungeon implements BasicDungeon{
    private boolean isOpened = false;
    private MonsterClass[] monsters;
    @Override
    public boolean open(Party party)
    {
        //Проверка на текущее кол-во участников группы для открытия подземелья
        if(party.getPartyMembers().length < 3) {
            System.out.println("Недостаточно участников в группе (необходимо больше 3).");
            isOpened = false;
        }
        else{
            System.out.println("Добро пожаловать, герои!");
            isOpened = true;
        }
        return isOpened;
    }
}
