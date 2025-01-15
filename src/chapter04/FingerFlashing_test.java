package chapter04;

import java.util.Random;
import java.util.Scanner;

public class FingerFlashing_test {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int player, computer;

        System.out.println("[가위 바위 보 게임]");
        System.out.println("0. 가위 | 1. 바위 | 2. 보");


        System.out.print("입력> ");
        player = sc.nextInt();
        computer = rand.nextInt(3);


        if (computer == 0) {
            System.out.println("컴퓨터가 낸 것 : 가위");
        } else if (computer == 1) {
            System.out.println("컴퓨터가 낸 것 : 바위");
        }else if (computer == 2){
            System.out.println("컴퓨터가 낸 것 : 보");
        }

        if (player == 0){
            System.out.println("플레이어가 낸 것 : 가위");
            if (computer == 0)
                System.out.println("비겼습니다.");
            else if (computer == 1)
                System.out.println("졌습니다.");
            else
                System.out.println("이겼습니다.");
        } else if (player == 1){
            System.out.println("플레이어가 낸 것 : 바위");
            if (computer == 1)
                System.out.println("비겼습니다.");
            else if (computer == 2)
                System.out.println("졌습니다.");
            else
                System.out.println("이겼습니다.");
        } else if (player == 2){
            System.out.println("플레이어가 낸 것 : 보");
            if (computer == 2)
                System.out.println("비겼습니다.");
            else if (computer == 0)
                System.out.println("졌습니다.");
            else
                System.out.println("이겼습니다.");
        } else
            System.out.println("잘못 입력하셨습니다.");

    }
}