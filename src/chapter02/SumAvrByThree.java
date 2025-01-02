package chapter02;

public class SumAvrByThree {
    public static void main(String[] args) {
        int x =63, y = 18, z = 52;

        //합계 계산
        int sum = x + y + z;
        int avg = (x + y + z)/3;

        // x, y, z의 값을 각각 한 줄에 출력
        System.out.println("x값은 " + x + "입니다.");
        System.out.println("y값은 " + y + "입니다.");
        System.out.println("z값은 " + z + "입니다.");

        // 합계와 평균 각각 한 줄에 출력
        System.out.println("합계는 " + sum + "입니다.");
        System.out.println("평균은 " + avg + "입니다.");
    }
}
