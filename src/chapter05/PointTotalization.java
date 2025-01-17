package chapter05;

import java.util.Scanner;

// 1. 6명의 두 과목(국어, 수학) 점수로부터 과목별/학생별 평균
// 2. 위 주석의 코드가 완성되면 6명 고정이 아니라 Scanner로 동적으로 n을 입력받아 학생수 결정
// 학생수 : n * 과목 2개 = 2n만큼 입력 반복 필요
public class PointTotalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //final int number = 6; // 학생수

        System.out.print("학생수를 입력하세요: ");
        final int number = sc.nextInt();

        // x = 학생 번호, y = [0] 국어점수, [1] 수학점수
        int[][] point = new int[number][2]; // new int[number][2]
        int[] sumIndividual = new int[number];  // new int[number]
        int[] sumSubject = new int[2]; // [0] 국어 합계, [1] 수학 합계

        for (int i = 0; i < number; i++) {
            System.out.printf("%2d번 국어:", i + 1);
            point[i][0] = sc.nextInt();
            System.out.printf("     수학:");
            point[i][1] = sc.nextInt();

            sumIndividual[i] = point[i][0] + point[i][1];

            sumSubject[0] += point[i][0];
            sumSubject[1] += point[i][1];
        }

        System.out.println("No.  국어   수학   평균");
        for (int i = 0; i < number; i++) {
            System.out.printf("%2d %5d %5d %6.1f\n",i + 1, point[i][0], point[i][1], (double)sumIndividual[i]/2);
        }
        System.out.printf("평균 %5.1f %5.1f", sumSubject[0]/(double) number, sumSubject[1]/(double) number);
    }
}
