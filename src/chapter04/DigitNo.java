package chapter04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("양의 정수값 자리수를 표시합니다.");
        int x;

        do {
            System.out.print("양의 정수값 : ");
            x = sc.nextInt();
        } while(x <= 0);

        int digit = 0;

        while (x > 0) {
            x = x/10;
            digit ++;
        }

        System.out.println("입력한 숫자는 " + digit + "자리입니다.");
    }
}
