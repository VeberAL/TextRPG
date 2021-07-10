package main.Dungeons;
import main.Party;

public interface BasicDungeon {
    //Подземелье имеет свойство "открываться"
   boolean open(Party party);
}
