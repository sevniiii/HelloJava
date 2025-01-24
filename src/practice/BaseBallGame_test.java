package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame_test {
    public static void main(String[] args) {
        System.out.println("==================== BaseBallGame ====================");
        System.out.println("Rule. 0 ~ 9까지의 숫자 중 랜덤 3자리 숫자 맞추기 게임");
        System.out.println("      자리와 숫자가 같으면 strike");
        System.out.println("      숫자만 같으면 ball");
        System.out.println("      다 다르면 out");
        System.out.println("      10번 안에 맞추기");
        System.out.println("=======================================================");
        game();
    }

    public static int[] rand() {
        int[] computerNum = new int[3];

        for (int i = 0; i < computerNum.length; i++) {
            computerNum[i] = (int) (Math.random() * 9);
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

        int[] computerNum = rand();

        int strike;
        int ball;
        int count = 1;

        int[] userNum = new int[3];


        while (count <= 10) {
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
                for (int j = 0; j < computerNum.length; j++) {
                    if (userNum[i] == computerNum[j]) {
                        if (i == j)
                            strike++;
                        else
                            ball++;

                    }
                }
            }

            if (strike == 0 && ball == 0)
                System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", out" + ", 입력 횟수: " + count);
            else {
                System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", strike: " + strike + ", ball: " + ball + ", 입력 횟수: " + count);
                System.out.println();
            }

            count++;

            if (strike == 3) {
                System.out.println("정답입니다.");
                break;
            }

            if (count == 11) {
                System.out.println("Game Over! 정답은: " + Arrays.toString(computerNum) + "입니다.");
                break;
            }
        }
    }
}
