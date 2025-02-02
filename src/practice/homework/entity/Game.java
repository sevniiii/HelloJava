package practice.homework.entity;

import java.util.Arrays;

public class Game {
    private int[] computerNum = generateRandomNumbers();
    private final int attempts;
    private final Player player;

    public Game() {
        this.computerNum = generateRandomNumbers();
        this.attempts = 10;
        this.player = new Player();
    }

    public void displayRule() {
        System.out.println("==================== BaseBallGame ====================");
        System.out.println("Rule. 0 ~ 9까지의 숫자 중 랜덤 3자리 숫자 맞추기 게임");
        System.out.println("      자리와 숫자가 같으면 strike");
        System.out.println("      숫자만 같으면 ball");
        System.out.println("      다 다르면 out");
        System.out.println("      10번 안에 맞추기");
        System.out.println("      입력 e.g., 1 2 3");
        System.out.println("=======================================================");
    }

    private int[] generateRandomNumbers() {
        int[] computerNum = new int[3];

        for (int i = 0; i < computerNum.length; i++) {
            computerNum[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (computerNum[i] == computerNum[j]) {
                    i--;
                }
            }
        }
        return computerNum;
    }

    private int[] checkStrikeAndBall(int[] userNum, int[] computerNum) {
        int strike = 0;
        int ball = 0;

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
        return new int[] { strike, ball };
    }

    public boolean gameStart() {
        int count = 0;

        displayRule();

        while (count < attempts) {
            int[] userNum = player.getUserInput();

            int[] checkResult = checkStrikeAndBall(userNum, computerNum);
            int strike = checkResult[0];
            int ball = checkResult[1];

            if (strike == 0 && ball == 0) {
                System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", out" + ", 입력 횟수: " + (count + 1));
                System.out.println();
            } else {
                System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", strike: " + strike + ", ball: " + ball + ", 입력 횟수: " + (count + 1));
                System.out.println();
            }

            count++;

            if (strike == 3) {
                System.out.println("정답입니다.");
                System.out.println();
                break;
            }

            if (count == attempts) {
                System.out.println("Game Over! 정답은: " + Arrays.toString(computerNum) + "입니다.");
                System.out.println();
                break;
            }
        }
        return player.playAgain();
    }
}