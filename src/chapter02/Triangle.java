package chapter02;

import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("밑변을 입력하세요 : ");
        double width = sc.nextDouble();

        System.out.print("높이를 입력하세요 : ");
        double height = sc.nextDouble();

        double area = width * height / 2.0;

        //넓이를 구해서 표시
        System.out.println("넓이는 " + area + "입니다.");
        System.out.printf("넓이는 %.2f입니다.", area);
    }
}
