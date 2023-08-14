/*Задача 2:
        Найти минимальный-максимальный элементы и вывести в консоль.*/
import java.util.Arrays;
import java.util.Scanner;

public class Task_2_and_3 {
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
        int[] arr = new int[arrSize];
        for (int f = 0; f < arrSize; f++) {
            arr[f] = Math.round((float) (Math.random() * 10));
        }
        int maxind = 0;
        int mxi;
        int mni;
        int minind = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
                maxind = i;
            }
        }
        mxi = maxind;
        int min = max;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min){
                min = arr[j];
                minind = j;
            }
        }
        mni = minind;// Я никак не могу понять, почему оно мне min и max возвращает из цикла, а minind и maxind нет
        System.out.println(Arrays.toString(arr));
        System.out.println("maxind = " + mxi);
        System.out.println("minind = " + mni);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}