package practice;

import java.util.Scanner;

public class Problem_04_7 {
    public static void main(String[] args) {
        boolean needRun = true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while(needRun) {
            System.out.println("------------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료" );
            System.out.println("------------------------------------------");
            System.out.print("선택> ");

            int cmd = sc.nextInt();


            switch (cmd) {
                case 1:
                    System.out.print("예금액> ");
                    int deposit = sc.nextInt();
                    balance += deposit;
                    System.out.println();
                    break;

                case 2:
                    System.out.print("출금액> ");
                    int withdrawal = sc.nextInt();
                    if (balance >= withdrawal){
                        balance -= withdrawal;
                    } else {
                        System.out.println("잔고가 부족합니다.");
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("잔고> ");
                    System.out.println(balance);
                    System.out.println();
                    break;

                case 4:
                    needRun = false;
                    System.out.println();
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
            }

        }
        System.out.println("프로그램 종료");
    }
}
