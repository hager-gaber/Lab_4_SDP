package org.example;

public class BowAttack implements iAttack{
    @Override
    public void attack(CharacterStats attacker, Character target) {
        int damage = Math.round(attacker.getAttackPower() * 0.75f);
        target.takeDamage(damage);

        System.out.println(attacker.getName() + " attacks with Bow!");
        System.out.println("Damage: " + damage);
    }
}