package chapter06;

import java.util.Scanner;

public class Min6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a: ");
        int a = sc.nextInt();
        System.out.print("정수 b: ");
        int b = sc.nextInt();
        System.out.print("정수 c: ");
        int c = sc.nextInt();

        System.out.println("최소값은 " + min(a, b, c) + "입니다.");
    }

    public static int min (int a, int b, int c) {
        int min = a;

        if(min > b)
            min = b;

        if(min > c)
            min = c;

        return min;
    }
}
