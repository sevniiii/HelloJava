package chapter07;

import chapter06.Day;

public class ExCarTester2 {
    public static void main(String[] args) {
        Car car1 = new Car("W140",
                1850, 1490, 5200,80.0,
                new Day(2018,10,13));

        ExCar car2 = new ExCar("W221",
                1845, 1490, 5205, 90.0,
                new Day(2015, 12, 24));

        // 오버라이딩, 메시지를 받은 인스턴스는 자신의 자료향이 무엇인지 알고 있으며 적절한 동작을 한다
        car1.putSpec(); // 사양 표시

        System.out.println();

        car2.putSpec(); // 사양 표시
    }
}
