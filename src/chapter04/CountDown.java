package chapter04;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) throws InterruptedException{
        Scanner sc = new Scanner(System.in);
        System.out.println("카운트다운 합니다.");

        int x;

        do {
            System.out.print("양의 정수값: ");
            x = sc.nextInt();
        } while(x <= 0);

        while (x >= 0){
            System.out.println(x--);
            //System.out.println("x의 값이 " + x + "이 되었습니다.");
            Thread.sleep(1000);
        }
    }
}
