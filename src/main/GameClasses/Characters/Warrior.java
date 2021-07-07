package main.GameClasses.Characters;
import main.GameClasses.AttackType;
import main.GameClasses.CharacterClass;

//Класс воин с конструктором начальных показателей характеристик
public class Warrior extends CharacterClass {
    public Warrior(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(50);
        this.setHealthPoints(100);
        this.setManaPoints(50);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL);
        this.setAttackAmount(5);
    }
}
