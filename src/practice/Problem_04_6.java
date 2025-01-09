package practice;

public class Problem_04_6 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            for(int j = 5; j > 0; j--) {
                if(i < j) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
