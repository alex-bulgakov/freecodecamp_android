package org.alebul.medicalChallange;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Eye leftEye = new Eye("Left Eye", false, "normal");
        Eye rightEye = new Eye("Right Eye", false, "normal");
        Heart heart = new Heart("Heart", "normal", 60);
        Skin skin = new Skin("Skin", "normal");
        Stomach stomach = new Stomach("Stomach", "normal", false);

        String choose = """
                Choose an Organ:
                    1. Left Eye
                    2. Right Eye
                    3. Heart
                    4. Stomach
                    5. Skin
                    6. Quit
                """;
        Scanner scanner = new Scanner(System.in);

        int number = 0;

        do {
            System.out.println(choose);
            number = scanner.nextInt();

            if (number == 1) {
                System.out.println("Name: " + leftEye.getName());
                System.out.println("Condition: " + leftEye.getName());
                System.out.println("\t 1. Close the Eye");

                if (scanner.nextInt() == 1) {
                    System.out.println("Left Eye Closed");
                    leftEye.setClosedEye(true);
                }
            } else if (number == 2) {
                System.out.println("Name: " + rightEye.getName());
                System.out.println("Condition: " + rightEye.getName());
                System.out.println("\t 1. Close the Eye");

                if (scanner.nextInt() == 1) {
                    System.out.println("Right Eye Closed");
                    rightEye.setClosedEye(true);
                }
            }  else if (number == 3) {
                System.out.println("Name: " + heart.getName());
                System.out.println("Condition: " + heart.getName());
                System.out.println("Heart rate: " + heart.getHeart_rate());
                System.out.println("\t1.Set heartrate: ");
                if (scanner.nextInt() == 1){
                    System.out.println("Enter heart rate number: ");
                    heart.setHeart_rate(scanner.nextInt());
                    System.out.println("Heart rate: " + heart.getHeart_rate());
                }
            } else if (number == 4) {
                System.out.println("Name: " + stomach.getName());
                System.out.println("Condition: " + stomach.getName());
                if (stomach.isDigest()) {
                    System.out.println("Digesting");
                } else {
                    System.out.println("No digesting");
                }
                System.out.println("\t1. Start digest");
                System.out.println("\t2. Stop digest");
                int check = scanner.nextInt();
                if (check == 1) {
                    stomach.setDigest(true);
                    System.out.println("Start digest");
                } else if (check == 2){
                    stomach.setDigest(false);
                    System.out.println("Stop digest");
                }
            } else if (number == 5) {
                System.out.println("Name: " + skin.getName());
                System.out.println("Condition: " + skin.getName());
            }
        } while (number != 6);
    }
}
