package chapter07.lecture;

public class SportsCar extends Car {

    public boolean isCoupe;

    public int speed;

    public SportsCar() {
        // 맨 위에 컴파일러가 super() 자동 추가
        super(); // 상위 클래스의 기본 생성자 호출
        this.isCoupe = true;
    }

    public SportsCar(boolean isCoupe) {
        super(isCoupe? 2 : 4);
        super.speed = 0;
        this.speed = 0;
        this.isCoupe = isCoupe;
    }

    @Override
    public void speedUp() {
        speed += 10;
        System.out.println("speed = " + speed);
    }

    /*@Override
    public void stop() {
        speed = 0;
        System.out.println("차를 멈춤");
    }*/
}
