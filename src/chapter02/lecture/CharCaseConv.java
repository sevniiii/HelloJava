package chapter02.lecture;

public class CharCaseConv {
    public static void main(String[] args) {

        char ch1 = 'a';

        System.out.println("ch1 출력 : " + ch1);
        System.out.println("'a' -> int형 형변환 후 출력 : " + (int) ch1);
        System.out.println("Acscii code 97 -> char형 형변환 : " + (char) 97);
        System.out.println();

        System.out.println("'A' -> int형 형변환 후 출력 : " + (int)'A');
        System.out.println("Acscii code 65 -> char형 형변환 : " + (char) 65);
        System.out.println();

        char ch2 = (char) (ch1 - 32); // A

        System.out.println("ch2 출력 : " + ch2);
        System.out.println("ch2 -> int형 형변환 후 출력 : " + (int) ch2);
        System.out.println("Acscii code 65 -> char형 형변환 : " + (char) (ch1-32));
        System.out.println();

        // char은 음수 대입 불가
        // char ch3 = -1;

        char ch4 = '한';
        char ch5 = '\uD55C';

        System.out.println(ch4);
        System.out.println(ch5);
    }
}
