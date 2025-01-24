package chapter06;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean needRetry;

        do {
            int n = readPlusInt(sc);
            printInverseNumber(n);
            needRetry = shouldRetry(sc);

        }while (needRetry);
    }

    public static int readPlusInt (Scanner sc) {
        int n;

        do {
            System.out.print("양의 정수값: ");
            n = sc.nextInt();
        }while (n <= 0);

        return n;
    }

    public static void printInverseNumber(int n) {
        StringBuilder sb = new StringBuilder();

        sb.append(n);
        sb.reverse();

        System.out.println("반대로 읽으면 " + sb + "입니다.");
    }

    public static boolean shouldRetry(Scanner sc) {
        int input;

        do {
            System.out.print("다시 한 번? <Yes...1/No...0>: ");
            input = sc.nextInt();
        }while (input != 1 && input != 0);

        return input == 1;
    }
}
