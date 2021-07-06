package main.GameClasses;

//Класс игрового персонажа, наследуемый от базового класса
public abstract class CharacterClass implements BaseClass{
    private String name;
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
    public void restoreHealth() {
    }
    @Override
    public void restoreMana() {
    }
    @Override
    public void loseHealth() {
    }
    @Override
    public void loseMana() {
    }
    @Override
    public void info() {
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }
    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }
    public int getMaxManaPoints() {
        return maxManaPoints;
    }
    public void setMaxManaPoints(int maxManaPoints) {
        this.maxManaPoints = maxManaPoints;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
    public int getAttackAmount() {
        return attackAmount;
    }
    public void setAttackAmount(int attackAmount) {
        this.attackAmount = attackAmount;
    }
    //Небольшая логика в значении очков здоровья
    public void setHealthPoints(int healthPoints) {
        //если значение очков здоровья меньше нуля, то не допускаем отрицательного значения
        if (healthPoints < 0) this.healthPoints = 0;
        //если значение очков здоровья больше, чем максимально возможное, то оно равно максимально возможному
        else if (healthPoints > this.healthPoints) this.healthPoints = maxHealthPoints;
        else this.healthPoints = healthPoints;
    }
    //Аналогичная логика для очков маны
    public void setManaPoints(int manaPoints) {
        if (manaPoints < 0) this.manaPoints = 0;
        else if (manaPoints > this.manaPoints) this.manaPoints = maxManaPoints;
        else this.manaPoints = manaPoints;
    }
    public int getHealthPoints() {
        return healthPoints;
    }
    public int getManaPoints() {
        return manaPoints;
    }
}
