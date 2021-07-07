package main.GameClasses.Characters;

import main.GameClasses.AttackType;
import main.GameClasses.CharacterClass;
//Класс маг
public class Mage extends CharacterClass {
    public Mage(String name) {
        this.setLevel(1);
        this.setHealthPoints(50);
        this.setManaPoints(150);
        this.setMaxHealthPoints(50);
        this.setMaxManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.MAGICAL_RANGED);
        this.setAttackAmount(9);
    }
}
