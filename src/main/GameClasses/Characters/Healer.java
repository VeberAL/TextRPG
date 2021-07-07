package main.GameClasses.Characters;

import main.GameClasses.AttackType;
import main.GameClasses.CharacterClass;
//Класс лекарь
public class Healer extends CharacterClass {
    public Healer(String name) {
        this.setLevel(1);
        this.setHealthPoints(100);
        this.setManaPoints(150);
        this.setMaxHealthPoints(100);
        this.setMaxManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(2);
    }
}
