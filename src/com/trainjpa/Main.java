package com.trainjpa;

import java.util.List;
import java.util.Scanner;

public class Main {



    public static void PrintStartOfGame(){
        System.out.println("------------Welcome to 'DROIDS ARENA' fight club-----------");
        System.out.println("\n\nMenu : ");
        System.out.println("1 - Start new Droid battle\n2 - Exit Game ");
        System.out.println("Enter your choise : ");
    }





    public static void main(String[] args) {

        int choose;
        int weapons[] = new int[2];
        int hp[] = new int[2];
        String droid1,droid2;
        Scanner scanner = new Scanner(System.in);
        PrintStartOfGame();

      choose = scanner.nextInt();

            if(choose==1){
                Battle battle = new Battle();
                System.out.println("\nEnter Droid name for the first player : ");
                droid1 = scanner.next();
                System.out.println("Enter Droid name for the second player : ");
                droid2 = scanner.next();
                System.out.println("Enter Weapon id  *(click Enter)* and enter HP for the first Droid --> "+droid1);
                weapons[0] = scanner.nextInt();
                hp[0] = scanner.nextInt();
                System.out.println("Enter Weapon id  *(click Enter)* and enter HP for the second Droid --> "+droid2);
                weapons[1] = scanner.nextInt();
                hp[1] = scanner.nextInt();
               battle.BattleStart(droid1,droid2,weapons,hp);
            }

            else System.exit(1);




    }
}
