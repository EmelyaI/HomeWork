/*Задача 6:
        Проверить, является ли массив возрастающей последовательностью (каждое следующее
        число больше предыдущего).*/
import java.util.Arrays;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
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
        int[] arr = new int[arrSize];
        for (int f = 0; f < arrSize; f++) {
            arr[f] = Math.round((float) (Math.random() * 10));
        }*/
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int counter = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i+1]) {
                counter++;
            }
        }
        if(counter < arr.length - 1){
            System.out.println("Массив не возрастающий");
        } else {
            System.out.println("Массив возрастающий");
        }
    }
}
