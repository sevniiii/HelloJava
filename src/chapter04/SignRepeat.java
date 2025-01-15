package chapter04;

import java.util.Scanner;

public class SignRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int retry;

        do {
            System.out.print("정수값 : ");
            int n = sc.nextInt();

            if (n > 0)
                System.out.println("이 값은 양수입니다.");
            else if (n < 0)
                System.out.println("이 값은 음수입니다.");
            else
                System.out.println("이 값은 0입니다.");

            System.out.println("다시 한 번? 1-yes / 0-No");
            retry = sc.nextInt();

        } while (retry == 1);

        System.out.println("종료합니다.");
    }
}
