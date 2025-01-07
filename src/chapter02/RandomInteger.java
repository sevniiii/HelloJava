package chapter02;

import java.util.Random;

public class RandomInteger {
    public static void main(String[] args) {
        Random rand = new Random();

        // 난수를 생성한다. 0부터 n-1까지 n개의 난수를 생성
        // 0부터 시작하므로 인간 사고로는 직관적이지 않다.
        int n1 = rand.nextInt(9); // 0 ~ n-1

        System.out.println("임의의 정수 값은 " + n1);

        // 한 자리의 양의 정수 (1 ~ 9)
        int n2 = 1 + rand.nextInt(9);
        System.out.println("한 자리의 양의 정수 : " + n2);

        // 두 자리의 양의 정수 (10 ~ 99), (0 + offset ~ N-1 + offset)
        int n3 = 10 + rand.nextInt(90);
        System.out.println("두 자리의 양의 정수 : " + n3);

        // 문제 : 한 자리의 음의 정수 (-1 ~ -9), (-9 ~ -1)
        int n4 = 1 + rand.nextInt(9);
        System.out.println("한 자리의 음의 정수 : " + (n4 * (-1)));

        int n5 = -1 - rand.nextInt(9);
        System.out.println("한 자리의 음의 정수 : " + n5);

        int n6 = -(1 + rand.nextInt(9));
        System.out.println("한 자리의 음의 정수 : " + n6);
    }
}
