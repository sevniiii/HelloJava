package chapter04;

import java.util.Random;
import java.util.Scanner;

public class FingerFlashing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("0. 가위 | 1. 바위 | 2. 보");
        System.out.println("------------------------------------------");
        System.out.print("입력> ");

        int userHand = sc.nextInt();
        int computerHand = rand.nextInt(3);

        System.out.print("컴퓨터가 낸 것 : ");
        displayHand(computerHand);

        System.out.print("내가 낸 것 : ");
        displayHand(userHand);

        displayResult(userHand, computerHand);

    }

    public static void displayHand(int hand) {
        switch (hand) {
            case 0:
                System.out.println("가위");
                break;
            case 1:
                System.out.println("바위");
                break;
            case 2:
                System.out.println("보");
                break;
        }
    }

    public static void displayResult(int userHand, int computerHand) {
        if (userHand == computerHand) {
            System.out.println("비겼습니다.");
        } else if (userHand - computerHand == -2 || userHand - computerHand == 1){
            // (userHand == 0 && computerHand == 2) || (userHand == 1 && computerHand == 0) || (userHand == 2 && computerHand == 1)
            System.out.println("당신이 이겼습니다.");
        } else {
            System.out.println("당신이 졌습니다.");
        }
    }
}



