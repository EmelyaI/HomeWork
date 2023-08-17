/*Задача 5:
        Пройти по массиву и поменять местами элементы первый и последний, второй и
        предпоследний и т.д.*/
import java.util.Arrays;
import java.util.Scanner;

public class Task_5 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int arrSize;
    System.out.println("Please input array size > 0:");
    if (scanner.hasNextInt()) {
        arrSize = scanner.nextInt();
    } else {
        System.out.println("Incorrect input.");
        return;
    }
    if (arrSize <= 0) {
        System.out.println("Incorrect input.");
        return;

    }
///////////////////////////////////////////////////////////////////////////////////////
    int[] arr = new int[arrSize];
    for (int f = 0; f < arrSize; f++) {
        arr[f] = Math.round((float) (Math.random() * 10));
    }
    System.out.println(Arrays.toString(arr));
    int buff;
    for (int i = 0; i < arr.length / 2; i++) {
            buff = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = buff;
    }
    System.out.println(Arrays.toString(arr));
}
}