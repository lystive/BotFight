package com.trainjpa;

public class Lists {

public Weapon[] listOfWeapons(){

    Weapon [] weapons = new Weapon[5];

    Weapon EB43 = new Weapon();
    weapons[0]=EB43;
    EB43.WeaponName = "Electric Burn 43 (EB43)";
    EB43.damage =25;
    EB43.hitPercentage = 0.9;
    weapons[0]=EB43;

    Weapon TL118 = new Weapon();
    TL118.WeaponName = "Tinter Light 118 (TL118)";
    TL118.damage = 120;
    TL118.hitPercentage = 0.2;
    weapons[1]=TL118;

    Weapon KG = new Weapon();
    KG.WeaponName = "Killer Genius (KG)";
    KG.damage = 40;
    KG.hitPercentage = 0.6;
    weapons[2]=KG;

    Weapon WB54 = new Weapon();
    WB54.WeaponName = "Wrong Bit 54 (WB54)";
    WB54.damage = 190;
    WB54.hitPercentage = 0.1;
    weapons[3]=WB54;

    Weapon HR12 = new Weapon();
    HR12.WeaponName = "HellRaiser 12 (HR12)";
    HR12.damage = 60;
    HR12.hitPercentage = 0.6;
    weapons[4] = HR12;

    System.out.println("Here weapon list : \n");
    for(int i=0;i<weapons.length;i++){
        weapons[i].id=i;
       weapons[i].PrintWeaponSettings();}



   return weapons;


}

    public static Weapon[] listOfWeaponReturn(){

        Weapon [] weapons = new Weapon[5];

        Weapon EB43 = new Weapon();
        weapons[0]=EB43;

        EB43.damage =25;
        EB43.hitPercentage = 0.9;
        weapons[0]=EB43;

        Weapon TL118 = new Weapon();

        TL118.damage = 120;
        TL118.hitPercentage = 0.2;
        weapons[1]=TL118;

        Weapon KG = new Weapon();

        KG.damage = 40;
        KG.hitPercentage = 0.6;
        weapons[2]=KG;

        Weapon WB54 = new Weapon();

        WB54.damage = 190;
        WB54.hitPercentage = 0.1;
        weapons[3]=WB54;

        Weapon HR12 = new Weapon();

        HR12.damage = 60;
        HR12.hitPercentage = 0.6;
        weapons[4] = HR12;


        for(int i=0;i<weapons.length;i++){
            weapons[i].id=i;
          }



        return weapons;


    }


    public static Weapon returnWeaponWithId(int id){

        Weapon [] weapons ;
    weapons = listOfWeaponReturn();
        for(int i=0;i<weapons.length;i++) {
           if(weapons[i].id==id)
               return weapons[i];
        }
        return null;
    }
}
