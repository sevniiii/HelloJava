package practice.homework.entity;

import java.util.Scanner;

public class Player {
    private final Scanner sc = new Scanner(System.in);

    public int[] getUserInput() {
        int[] userNum = new int[3];
        System.out.print("숫자를 입력하세요: ");
        for (int i = 0; i < userNum.length; i++) {
            userNum[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (userNum[j] == userNum[i]) {
                    System.out.print("중복된 숫자 입니다. 다시 입력하세요>> ");
                    i--;
                }
            }
        }
        return userNum;
    }

    public boolean playAgain() {
        System.out.print("다시 하시겠습니까? (Yes - 1 | No - 0) >> ");
        while (true) {
            int input = sc.nextInt();
            if (input == 1) {
                return true;
            } else if (input == 0) {
                return false;
            } else {
                System.out.print("다시 입력하세요. (Yes - 1 | No - 0) >> ");
            }
        }
    }
}
