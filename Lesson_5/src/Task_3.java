/*Задача *:
        Даны числа n и m. Создайте массив A[n][m] и заполните его змейкой (см. пример).
        Формат входных данных:
        Программа получает на вход два числа n и m.
        Формат выходных данных:
        Программа должна вывести полученный массив, отводя на вывод каждого числа ровно 3
        символа.*/

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int c = 0;
        int[][] arr = new int[n][m];
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            if (i % 2 == 0) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = +c;
                    c++;
                    System.out.print(" " + arr[i][j]);
                }
            } else {
                for (int j = arr[i].length - 1; j >= 0; j--) {
                    arr[i][j] = c;
                    c++;
                }
                for (int g = 0; g < arr[i].length; g++) {
                    System.out.print(" " + arr[i][g]);
                }
            }
        }
    }
}