package practice.homework;

import practice.homework.entity.Game;

public class BaseBallGame {
    public static void main(String[] args) {
        boolean playAgain = true;
        while (playAgain) {
            Game game = new Game();
            playAgain = game.gameStart();
        }

        System.out.println();
        System.out.println("게임을 종료합니다.");
    }
}
