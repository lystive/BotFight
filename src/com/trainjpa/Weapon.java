package com.trainjpa;
import static java.lang.System.out;

public class Weapon {

    String WeaponName;
    int id;
    int damage;
    double hitPercentage;

public void PrintWeaponSettings(){
    System.out.println("Weapon name : "+this.WeaponName + " with ID = "+this.id);
    System.out.println("Weapon damage : "+this.damage + " HP");
    System.out.println("Weapon hit percentage: "+this.hitPercentage*100 + " %");
}
}
