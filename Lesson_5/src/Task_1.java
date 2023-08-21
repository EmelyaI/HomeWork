/*Задача 1:
        1.1 Создать двумерный массив, заполнить его случайными числами.
        1.2 Добавить к каждому значению число, которое пользователь будет вводить с консоли.
        1.3 Найти сумму всех получившихся элементов и вывести в консоль.*/
import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number wich will be added");
        int a = scanner.nextInt();
        int sum = 0;
        int[][] arr = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(100);
                arr[i][j] += a;
                sum += arr[i][j];
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Sum of numbers = " + sum);
    }
}
