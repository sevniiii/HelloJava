package practice;

public class Problem_04_5 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
