package chapter04;

import java.util.Scanner;

// 입력을 받고 해당 숫자가 5로 나누어지는지 판별
public class GoInto5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수값 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 5 == 0) {
                System.out.println("이 값은 5로 나누어집니다.");
            } else {
                System.out.println("이 값은 5로 나누어지지 않습니다.");
            }
        } else{
            System.out.println("음의 정수를 입력했습니다.");
        }
    }
}
