package chapter05;

import java.util.Scanner;

public class ScanStringRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열: ");
        String str = sc.nextLine();

        System.out.println("반대로 읽으면 ");

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

        System.out.println("입니다.");
    }
}
