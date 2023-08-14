/*Задача 4:
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет - вывести
        сообщение, что их нет.*/
import java.util.Arrays;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
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
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                counter++;
            }
        }
        if(counter == 0){
            System.out.println("array has no 0");
        } else {
            System.out.println("0 in array - " + counter);
        }
        System.out.println(Arrays.toString(arr));
    }
}