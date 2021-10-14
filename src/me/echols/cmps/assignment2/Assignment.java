package me.echols.cmps.assignment2;

import java.util.Random;
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        int heroHealth;
        int bossHealth;

        Random heroAttackRand = new Random();
        Random bossAttackRand = new Random();

        int heroAttack = heroAttackRand.nextInt(15, 25);
        int bossAttack = bossAttackRand.nextInt(15, 35);

        int gameDifficulty;

        String bossName = "Mildred The Dominant";
        String heroName = "Gilbert";
        String introduction = "it was a dreary night, battles were raging everywhere,\n" +
                "the bloodshed had reached its peak, the hero, " + heroName + "\nand now stands " +
                "before the ruthless overlord, " + bossName + "...and now the encounter begins..\n";
        String difficultyMessage = "Select the difficulty by entering the number" +
                "\n1.Easy \n2.Medium \n3.Hard";
        boolean gameRunning = false;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the letter \"Y\" to begin");

        if (input.next().equalsIgnoreCase("Y")) {
            gameRunning = true;

        } else {
            System.out.println("Enter the letter \"Y\" to begin");
        }
        if (gameRunning) {
            System.out.println(difficultyMessage);
            gameDifficulty = input.nextInt();

            if (gameDifficulty == 1) {

            } else if (gameDifficulty == 2) {

            } else if (gameDifficulty == 3) {

            } else {
                System.out.println(difficultyMessage);
                gameDifficulty = input.nextInt();
            }
        }
    }
}
