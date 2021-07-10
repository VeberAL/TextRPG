package main.Monsters;

import main.GameClasses.AttackType;
import main.GameClasses.BaseClass;

public class MonsterClass implements BaseClass {
    private String name;
    private AttackType attackType;
    private int maxHealthPoints;
    private int maxManaPoints;
    private int level;
    private int attackAmount;
    private int healthPoints;
    private int manaPoints;

    @Override
    public void levelUp() {
    }
    @Override
    public void attack() {
    }
    @Override
    public void restoreHealth(int amount) {
    }
    @Override
    public void restoreMana(int amount) {
    }
    @Override
    public void loseHealth(int amount) {
    }
    @Override
    public void loseMana(int amount) {
    }
    @Override
    public void info() {
    }
}
