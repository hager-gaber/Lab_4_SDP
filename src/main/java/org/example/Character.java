
package org.example;

public abstract class Character implements CharacterStats {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int defense;
    protected iAttack attackStrategy;

    public Character(String name, int health, int attackPower, int defense,
                     iAttack attackStrategy) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.attackStrategy = attackStrategy;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public void takeDamage(int damage) {
        health -= damage;

        if (health < 0) {
            health = 0;
        }
    }

    public void attack(CharacterStats self,Character target) {
        attackStrategy.attack(self, target);
    }

    public void setAttackStrategy(iAttack strategy) {
        attackStrategy = strategy;
    }
}
