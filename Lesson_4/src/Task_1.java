/*Задача 1:
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке*/
import java.util.Arrays;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrSize;
        System.out.println("Please input array size > 0:");
        if (scanner.hasNextInt())
        {
            arrSize = scanner.nextInt();
        }
        else
        {
            System.out.println("Incorrect input.");
            return;
        }
        if (arrSize <= 0)
        {
            System.out.println("Incorrect input.");
            return;
        }
        ///////////////////////////////////////////////////////////////////////////////////////
        int buf;
        int[] arr = new int[arrSize];
        for(int f = 0; f < arrSize; f++){
            arr[f] = Math.round((float) (Math.random() * 10));
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    buf = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buf;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                if (arr[j] < arr[j + 1]) {
                    buf = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = buf;
                }

            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
