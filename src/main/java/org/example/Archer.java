package org.example;

public class Archer extends Character{
    Archer(String name)
    {
      super(name , 80 ,25,10,new BowAttack());
    }
}
