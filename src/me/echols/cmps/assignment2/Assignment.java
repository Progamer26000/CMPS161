package me.echols.cmps.assignment2;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Assignment {

    enum State {
        FINE, STUNNED
    }

    //To save my pain
    public static void println(String s) {
        System.out.println(s);
    }
    public static void println(int s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

        HashMap bossState = new HashMap<String, State>();

        Random random = new Random();

        int heroHealth = 0;
        int bossHealth = 0;

        int bossAttack = random.nextInt(5, 10);

        int slash = 8;
        int sweep = 5;
        int stab = 10;

        int gameDifficulty;
        String difficultyString = "";

        int moveChoice;

        String bossName = "Mildred The Dominant";
        String heroName = "Gilbert";
        String introduction = "it was a dreary night, battles were raging everywhere,\n" +
                "the bloodshed had reached its peak, the hero, " + heroName + "\nand now stands " +
                "before the ruthless overlord, " + bossName + "...and now the encounter begins..\n";

        String difficultySelection = "Select the difficulty by entering the number" +
                "\n1.Easy \n2.Medium \n3.Hard";

        String movesList = "1.Slash[8 damage] 2.Sweep[5 damage + stun] 3.Stab[10 damage]";

        boolean gameRunning = false;

        Scanner input = new Scanner(System.in);

        println("Enter the letter \"Y\" to begin");

        if (input.next().equalsIgnoreCase("Y")) {
            gameRunning = true;
            bossState.put(bossName, State.FINE);
            if (gameRunning) {
                println(introduction);
                println(difficultySelection);
                gameDifficulty = input.nextInt();

                if (gameDifficulty == 1) {
                    difficultyString = "Easy";
                    heroHealth = 75;
                    bossHealth = 75;
                    String difficultyMessage = "You have chosen difficulty: " + difficultyString +
                            "Your health: " + heroHealth + ". with " + bossName + "\'s health: " + bossHealth;
                    println(difficultyMessage);

                    println("What would you like to do? (input the number of your choice");
                    println(movesList);
                    println(bossHealth);

                } else if (gameDifficulty == 2) {
                    difficultyString = "Medium";
                    heroHealth = 50;
                    bossHealth = 75;
                    String difficultyMessage = "You have chosen difficulty: " + difficultyString +
                            "Your health: " + heroHealth + ". with " + bossName + "\'s health: " + bossHealth;
                    println(difficultyMessage);
                  while (bossHealth > 0 && heroHealth > 0) {
                      println("What would you like to do? (input the number of your choice");
                      println(movesList);
                      moveChoice = input.nextInt();
                      if (moveChoice == 1) {
                          println("You've decided to use Slash. It does " + slash + " damage!");
                          println(bossName + " now has: " + bossHealth + " health left");
                          bossHealth = bossHealth - slash;

                          if (bossState.get(bossName).equals(State.STUNNED)) {
                              println(bossName + " was swept off his feet and is unable to do anything!");
                              bossState.replace(bossName, State.FINE);
                          } else {
                              println(bossName + " has attacked");
                              heroHealth = heroHealth - bossAttack;
                          }
                      }
                      if (moveChoice == 2) {
                          bossHealth = bossHealth - sweep;
                          bossState.replace(bossName, State.STUNNED);
                      }
                      if (moveChoice == 3) {
                          bossHealth = bossHealth - stab;
                      }
                  }
                } else if (gameDifficulty == 3) {
                    difficultyString = "Hard";
                    heroHealth = 50;
                    bossHealth = 75;
                    String difficultyMessage = "You have chosen difficulty: " + difficultyString +
                            " Your health: " + heroHealth + ". with " + bossName + "\'s health: " + bossHealth;
                    println(difficultyMessage);

                    println("What would you like to do? (input the number of your choice");
                    println(movesList);
                }
            }
        }
    }
}

