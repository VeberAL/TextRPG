package main.GameClasses;

//Класс игрового персонажа, наследуемый от базового класса
public abstract class CharacterClass implements BaseClass{
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
    //Восстановление очков жизни или маны = текущее значение + переданное количество
    @Override
    public void restoreHealth(int amount) {
        setHealthPoints(this.healthPoints + amount);
    }
    @Override
    public void restoreMana(int amount) {
        setManaPoints(this.manaPoints + amount);
    }
    //Потеря очков жизни или маны = текущее значение - переданное количество
    @Override
    public void loseHealth(int amount) {
        setHealthPoints(this.healthPoints - amount);
    }
    @Override
    public void loseMana(int amount) {
        setManaPoints(this.manaPoints - amount);
    }
    //Информация о персонаже
    @Override
    public void info() {
        System.out.println("Имя: " + this.name +
                          "\nУровень: " + this.level +
                          "\nHP: " + this.healthPoints +"/" + this.maxHealthPoints +
                          "\nMP: "+ this.manaPoints + "/"+ this.maxManaPoints);
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
        if (level < 0) System.out.println("Вы достигли минимального уровня!");
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
    public AttackType getAttackType() {
        return attackType;
    }
    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }
}
