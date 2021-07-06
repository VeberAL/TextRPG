package main.GameClasses;

//Интерфейс базового класса
public interface BaseClass {
    void levelUp();
    void attack();
    void restoreHealth(int amount);
    void restoreMana(int amount);
    void loseHealth(int amount);
    void loseMana(int amount);
    void info();
}
