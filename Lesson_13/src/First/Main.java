/*Задача 1:
        Пользователь вводит набор чисел в виде одной строки с клавиатуры. Например: "1, 2, 3,
        4, 4, 5". Избавиться от повторяющихся элементов в строке. Вывести результат на экран.
        При решении использовать коллекции.*/
package First;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size");
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            String z = scanner.next();
            list.add(z);
        }
        Unique unique = new Unique((ArrayList) list);
        unique.FindUnique(list);
        System.out.println(list);
    }
}
