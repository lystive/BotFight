package com.trainjpa;

public class Droid extends Weapon {

    public String Droidname ;
    public int DroidHP;



    Droid(String DroidName ,int HP,Weapon weapon){
        this.Droidname = DroidName;
        this.DroidHP = HP;

this.damage = weapon.damage;
this.hitPercentage = weapon.hitPercentage;
    }




}
