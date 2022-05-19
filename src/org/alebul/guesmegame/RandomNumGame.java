package org.alebul.guesmegame;

import java.util.Random;
import java.util.Scanner;

public class RandomNumGame {
    public static void main(String[] args) {
        System.out.println("Welcome to The Game");
        int bound = 10;
        int num = getRandom(bound);
        Boolean win = false;
        System.out.print("Do you want to start game? Type yes/no: ");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equals("yes")) {
            System.out.println("Try to guess the number between 0 and " + bound + ": ");
            int checkNum = scanner.nextInt();
            for (int i = 0; i < 5; i++) {

                if (checkNum == num) {
                    win = true;
                    break;
                } else if (checkNum > num) {
                    System.out.print("smaller <<< ");
                    checkNum = scanner.nextInt();
                } else {
                    System.out.println("bigger >>> ");
                    checkNum = scanner.nextInt();
                }
            }
        }

        if (win) {
            System.out.println("You Win!!!");
        } else {
            System.out.println("Game over");
        }
    }

    public static int getRandom(int bound) {
        Random random = new Random();
        int num = random.nextInt(bound);
        return num;
    }
}
