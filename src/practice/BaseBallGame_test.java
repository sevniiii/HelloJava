package practice;

import java.util.Arrays;
import java.util.Scanner;

class Player {
    private final Scanner sc = new Scanner(System.in);

    public int[] inputNumbers() {
        int[] userNum = new int[3];
        System.out.print("숫자를 입력하세요: ");
        for (int i = 0; i < userNum.length; i++) {
            userNum[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (userNum[j] == userNum[i]) {
                    System.out.print("중복된 숫자 입니다. 다시 입력하세요>> ");
                    i--;
                    break;
                }
            }
        }
        return userNum;
    }

    public int askContinueOrExit() {
        System.out.print("게임을 계속하려면 1, 종료하려면 0을 입력하세요: ");
        while (true) {
            int choice = sc.nextInt();
            if (choice == 1 || choice == 0) {
                return choice;
            } else {
                System.out.print("다시 입력하세요 (1: 계속, 0: 종료): ");
            }
        }
    }
}

class Game {
    private final int[] computerNum;
    private final Player player;
    private static final int MAX_ATTEMPTS = 10;

    public Game() {
        this.computerNum = generateRandomNumbers();
        this.player = new Player();
    }

    private int[] generateRandomNumbers() {
        int[] computerNum = new int[3];
        for (int i = 0; i < computerNum.length; i++) {
            computerNum[i] = (int) (Math.random() * 9);
            for (int j = 0; j < i; j++) {
                if (computerNum[i] == computerNum[j]) {
                    i--;
                    break;
                }
            }
        }
        return computerNum;
    }

    public boolean start() {
        System.out.println("==================== BaseBallGame ====================");
        System.out.println("Rule. 0 ~ 9까지의 숫자 중 랜덤 3자리 숫자 맞추기 게임");
        System.out.println("      자리와 숫자가 같으면 strike");
        System.out.println("      숫자만 같으면 ball");
        System.out.println("      다 다르면 out");
        System.out.println("=======================================================");

        int attempts = 0;

        while (attempts < MAX_ATTEMPTS) {
            int[] userNum = player.inputNumbers();
            int strike = 0;
            int ball = 0;

            for (int i = 0; i < userNum.length; i++) {
                for (int j = 0; j < computerNum.length; j++) {
                    if (userNum[i] == computerNum[j]) {
                        if (i == j) strike++;
                        else ball++;
                    }
                }
            }

            if (strike == 0 && ball == 0) {
                System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", out" + ", 입력 횟수: " +(attempts+1));
            } else {
                System.out.println("입력한 숫자: " + Arrays.toString(userNum) + ", strike: " + strike + ", ball: " + ball+ ", 입력 횟수: " +(attempts+1));
            }

            attempts++;

            if (strike == 3) {
                System.out.println("정답입니다!");
                break;
            }

            if (attempts == MAX_ATTEMPTS) {
                System.out.println("Game Over! 정답은: " + Arrays.toString(computerNum) + "입니다.");
                break;
            }
        }

        return player.askContinueOrExit() == 1; // 1이면 true (계속), 0이면 false (종료)
    }
}

public class BaseBallGame_test {
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            Game game = new Game();
            playAgain = game.start();
        }
        System.out.println("게임을 종료합니다.");
    }
}

