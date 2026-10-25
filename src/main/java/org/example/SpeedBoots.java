package org.example;

public class SpeedBoots extends Decoretor {
    public SpeedBoots(CharacterStats character) {
        super(character);
    }

    public int getAttackPower() {
        return character.getAttackPower() + 5;
    }

    public int getDefense() {
        return character.getDefense() + 5;
    }
}
