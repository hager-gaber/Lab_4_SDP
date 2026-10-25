package org.example;

public class Warrior extends Character{
    public Warrior(String name)
    {
       super(name,100,20,15,new SwordAttack());
    }
}
