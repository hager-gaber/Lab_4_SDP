package org.example;

public class PowerRing extends Decoretor{

    public PowerRing(CharacterStats character) {
        super(character);
    }

    public int getAttackPower() {
        return character.getAttackPower() + 15;
    }
}
