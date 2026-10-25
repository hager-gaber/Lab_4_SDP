package org.example;

public class MagicAttack implements iAttack{
    @Override
    public void attack(CharacterStats attacker, Character target) {
        int damage = Math.round(attacker.getAttackPower() * 1.25f);
        target.takeDamage(damage);

        System.out.println(attacker.getName() + " attacks with Magic!");
        System.out.println("Damage: " + damage);
    }
}