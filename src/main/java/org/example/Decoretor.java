package org.example;

public abstract class Decoretor implements CharacterStats {
     CharacterStats character;
    public Decoretor(CharacterStats character){
        this.character = character;
    }

    public String getName(){
        return character.getName();
    }

    public int getHealth() {
        return character.getHealth();
    }

    public int getAttackPower(){
        return character.getAttackPower();
    }

    public int getDefense(){
        return character.getDefense();
    }

}
