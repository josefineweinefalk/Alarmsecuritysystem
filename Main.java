package com.company;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;

        while (true) {
            System.out.println("(0) Cancel, (1) Normal, (2)Break-In, (3) Cancel");
            input = scanner.nextInt();

            switch (input) {
                case 0 :
                    System.out.println("Reset Alarm");
                    break;
                case 1 :
                    System.out.println("Alarm back to normal");
                    break;
                case 2 :
                    System.out.println("Alarm set off");
                    break;
                case 3 :
                    System.out.println("Cancel Alarm");
                    break;
                default:
                    System.out.println("Open selection");




            }

        }
    }
}
