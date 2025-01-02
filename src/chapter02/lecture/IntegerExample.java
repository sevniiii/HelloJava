package chapter02.lecture;

public class IntegerExample {
    public static void main(String[] args) {
        // 정수형 데이터 타입 : byte(1 byte), short(2 byte), int(4 byte), long(8 byte)
        // 8bit, -2^7(-128) ~ +2^7-1(127)
        byte a = 127;
        //a = 128;
        System.out.println(a);

        // 16bit, -32,768 ~ +32,767
        short b = 50;
        // b = -32769;
        System.out.println(b);

        // 32bit, -21억 ~ +21억
        int c = -10;
        c = 2_147_483_647;
        System.out.println(c);

        // 64bit,
        long d = -50;
        d = 9_223_372_036_854_775_807L;
        System.out.println(d);
    }
}
