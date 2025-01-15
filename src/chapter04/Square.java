package chapter04;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값: ");
        int n = sc.nextInt();

        int square;

        for (int i = 1; i <= n; i++) {
            System.out.println(i + "의 제곱은 " + i * i + "입니다.");
        }


    }
}
