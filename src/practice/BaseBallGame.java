package practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BaseBallGame {
    public static void main(String[] args) {
        System.out.println("==================== BaseBallGame ====================");
        System.out.println("Rule. 0 ~ 9까지의 숫자 중 랜덤 3자리 숫자 맞추기 게임");
        System.out.println("      자리와 숫자가 같으면 strike");
        System.out.println("      숫자만 같으면 ball");
        System.out.println("      다 다르면 out");
        System.out.println("=======================================================");
        game();
    }

    public static int[] rand() {
        Random rand = new Random();

        int[] computerNum = new int[3];

        for (int i = 0; i < computerNum.length; i++) {
            computerNum[i] = rand.nextInt(9);
            for (int j = 0; j < i; j++) {
                if (computerNum[i] == computerNum[j]) {
                    i--;
                }
            }
        }
        return computerNum;
    }

    public static void game() {
        Scanner sc = new Scanner(System.in);

            int[] computer = rand();

            int strike;
            int ball;

            int[] userNum = new int[3];



            while (true) {
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

                strike = 0;
                ball = 0;

                for (int i = 0; i < userNum.length; i++) {
                    for (int j = 0; j < computer.length; j++) {
                        if (userNum[i] == computer[j]) {
                            if (i == j)
                                strike++;
                            else
                                ball++;

                        }
                    }
                }

                if (strike == 0 && ball == 0)
                    System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", out");
                else {
                    System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", strike: " + strike + ", ball: " + ball );
                    System.out.println();
                }

                if (strike != 3)
                    continue;
                else {
                    System.out.println("정답입니다.");
                    break;
                }
            }

    }

}
