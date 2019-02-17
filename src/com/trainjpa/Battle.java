package com.trainjpa;

import java.util.Random;

public class Battle {

    public Weapon[] weapons;

    Battle() {
        this.weapons = new Weapon[4];
        Lists weaponslist = new Lists();
        this.weapons = weaponslist.listOfWeapons();
    }

    public void BattleStart(String Droid1, String Droid2, int droidweapons[], int hp[]) {

        int winner=0;
        Droid droid1 = new Droid(Droid1, hp[0], Lists.returnWeaponWithId(droidweapons[0]));

        Droid droid2 = new Droid(Droid1, hp[1], Lists.returnWeaponWithId(droidweapons[1]));
        System.out.println(droid1.hitPercentage);
        System.out.println(droid2.hitPercentage);
        int i = 0;
        while (hp[0] != 0 || hp[1] != 0) {

            int hitted1 = 0, hitted2 = 0;
            i++;
            System.out.println("--------------ROUND " + i + " ----------------------");
            if (Math.random() < droid1.hitPercentage) {
                hitted1 = droid1.damage;
                droid2.DroidHP = droid2.DroidHP - hitted1;
            }
            System.out.println("\n\nDroid --> " + Droid1 + " HIT Droid --> " + Droid2 + " for " + hitted1 + " HP");

            if (Math.random() < droid2.hitPercentage) {
                hitted2 = droid2.damage;
                droid1.DroidHP = droid1.DroidHP - hitted2;
            }
            System.out.println("\n\nDroid--> " + Droid2 + " HIT Droid --> " + Droid1 + " for " + hitted2 + " HP");

            System.out.println("Droid HP ---> " + Droid1 +" "+ droid1.DroidHP + " HP");
            System.out.println("Droid HP ---> " + Droid2+ " " + droid2.DroidHP + " HP");
            if (droid1.DroidHP < 0 || droid2.DroidHP < 0){
                if(droid1.DroidHP<0)
                    winner =2;
                else
                    winner =1;

                    break;
            }


        }
        if(winner == 1){
        System.out.println("Winner is Droid with name : --->>>"+Droid1 + " CONGRATULATIOONNNSSSS");
        System.out.println("Copyright, created by Kucher Ivan");

        }
        else{
            System.out.println("Winner is Droid with name : --->>>"+Droid2 + " CONGRATULATIOONNNSSSS");
            System.out.println("Copyright, created by Kucher Ivan");}

    }
}
