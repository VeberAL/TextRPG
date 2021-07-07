package main;

import main.GameClasses.CharacterClass;

public class Party {
    private CharacterClass[] partyMembers;
    //Неизвестное количество элементов массива (персонажей) для группы
    public Party(CharacterClass... members){
        partyMembers = new CharacterClass[members.length];
        for (int i = 0; i < partyMembers.length; i++){
            partyMembers[i] = members[i];
        }
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
    }

