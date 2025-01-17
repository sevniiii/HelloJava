package chapter05;

import java.util.Scanner;

public class AryIns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: ");
        int num = sc.nextInt();
        int[] inputArray= new int[num];


        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a[" + i + "] = ");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삽입할 요소의 인덱스: ");
        int idx = sc.nextInt();

        System.out.print("삽입할 값: ");
        int value = sc.nextInt();

        aryIns(inputArray, idx, value);

        PrintArray.printIntArray(inputArray);
    }

    public static void aryIns(int[] inputArray, int idx, int value) {
        if(0 <= idx && idx <inputArray.length) {
            for (int i = inputArray.length - 1; i > idx; i--) {
                inputArray[i] = inputArray[i-1];
            }
            inputArray[idx] = value;
        }
    }
}
