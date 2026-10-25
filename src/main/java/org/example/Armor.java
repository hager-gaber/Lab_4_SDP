
package org.example;

public class Armor extends Decoretor {

    public Armor(CharacterStats character) {
        super(character);
    }
    @Override
    public int getDefense() {
        return character.getDefense() + 10;
    }
}
