package chapter05;

import java.util.Scanner;

// 배열 삽입 및 리턴
public class ArrayInsOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: ");
        int num = sc.nextInt();
        int[] inputArray= new int[num];


        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("x[" + i + "]: ");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삽입할 인덱스: ");
        int idx = sc.nextInt();

        System.out.print("삽입할 값: ");
        int value = sc.nextInt();

        inputArray = arrayInsOf(inputArray, idx, value);

        PrintArray.printIntArray(inputArray);
    }

    private static int[] arrayInsOf(int[] inputArray, int idx, int value) {
        int[] newArray = new int[inputArray.length + 1];

        for (int i = 0; i < idx; i++) {
            newArray[i] = inputArray[i];
        }

        newArray[idx] = value;

        for (int i = idx; i < inputArray.length; i++) {
            newArray[i + 1] = inputArray[i];
        }

        return newArray;
    }
}
