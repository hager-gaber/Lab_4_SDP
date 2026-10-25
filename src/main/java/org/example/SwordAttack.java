package org.example;

public class SwordAttack implements iAttack{
    @Override
    public void attack(CharacterStats attacker , Character target){

        int damage = Math.round(attacker.getAttackPower() * 1.0f);
        target.takeDamage(damage);

        System.out.println(attacker.getName() + " attacks with Sword!");
        System.out.println("Damage: " + damage);
    }
}
