//November 7 2021, Samuel Echols, w0463146
package me.echols.cmps.assignment3;

import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) {

        int x = 7;
        int y = 4;
        Scanner input = new Scanner(System.in);

        System.out.println("What is 7 + 4 ?");

        while (input.nextInt() != 7 + 4) {
            System.out.println("What is 7 + 4 ?");
        }

        System.out.println("Good Job! The answer was 11!");
    }
}
