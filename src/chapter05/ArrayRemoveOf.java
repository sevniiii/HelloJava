package chapter05;

import java.util.Scanner;

public class ArrayRemoveOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소 수: ");
        int num = sc.nextInt();
        int[] inputArray= new int[num];


        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("a[" + i + "] = ");
            inputArray[i] = sc.nextInt();
        }

        System.out.print("삭제할 요소의 인덱스: ");
        int idx = sc.nextInt();

        int[] outputArray = arrayRmvOf(inputArray, idx);

        PrintArray.printIntArray(outputArray);
    }

    private static int[] arrayRmvOf(int[] array, int idx) {
        if (0 > idx || idx >= array.length)
            return array.clone();
        else {
            int[] newArray = new int[array.length - 1];
            int i = 0;

            for (; i < idx; i++)
                newArray[i] = array[i];


            for(; i < array.length - 1; i++)
                newArray[i] = array[i+1];

            return newArray;
        }
    }
}
