package chapter04;

import java.util.Scanner;

public class Sort3Ascending {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.print("정수 a : ");
        int a = sc.nextInt();

        System.out.print("정수 b : ");
        int b = sc.nextInt();

        System.out.print("정수 c : ");
        int c = sc.nextInt();

        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp;
            temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }


        System.out.println("a <= b <= c가 되도록 정렬했습니다.");
        System.out.println("변수 a는 " + a + "입니다.");
        System.out.println("변수 b는 " + b + " 입니다.");
        System.out.println("변수 c는 " + c + " 입니다.");

    }
}
