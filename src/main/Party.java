package main;

import main.Dungeons.Dungeon;
import main.GameClasses.CharacterClass;

public class Party {
    private CharacterClass[] partyMembers;
    private Dungeon dungeon;
    //Неизвестное количество элементов массива (персонажей) для группы
    public Party(CharacterClass... members){
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++){
            partyMembers[i] = members[i];
        }
    }
    //Метод для входа группы в подземелье
    public boolean enterDungeon(Dungeon dungeon){
        return dungeon.open(this);
    }
    public void runDungeon(){
    //Здесь участники группы атакуют монстров подземелья
    }
    public CharacterClass[] getPartyMembers() {
        return partyMembers;
    }
    public void setPartyMembers(CharacterClass[] partyMembers) {
        this.partyMembers = partyMembers;
    }
    //Выводим информацию обо всех членах группы (кол-во неизвестно) через foreach
    public void info(){
        for (CharacterClass partyMembers: partyMembers){
            partyMembers.info();
            }
        }

    public Dungeon getDungeon() {
        return dungeon;
    }
    public void setDungeon(Dungeon dungeon) {
        this.dungeon = dungeon;
    }
}

