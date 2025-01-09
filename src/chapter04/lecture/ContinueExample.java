package chapter04.lecture;

public class ContinueExample {
    public static void main(String[] args) {
        // 짝수만 출력
        for (int i = 1; i < 10; i++) {
            if(i %2 == 1){
                continue;
            }
            System.out.println(i);
        }
    }
}
