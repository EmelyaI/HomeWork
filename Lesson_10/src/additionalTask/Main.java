/*1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
        найденные строки и их длину.
        2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
        значений их длины.
        3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
        средней, а также их длину.
        teachmeskills.by
        4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
        Если таких слов несколько, найти первое из них.
        5. Вывести на консоль новую строку, которой задублирована каждая буква из
        начальной строки. Например, "Hello" -> "HHeelllloo".*/
package additionalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[3];
        System.out.println("Strings");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }
        System.out.println("Task");
        int z = scanner.nextInt();
        switch (z) {
            case 1:
                First first = new First(arr);
                first.longAndShort(arr);
            case 2:
                Second second = new Second(arr);
                second.sort(arr);
            case 3:
                Third third = new Third(arr);
                third.averagelength(arr);
            case 4:
                Fouth fouth = new Fouth(arr);
                fouth.samesymbols(arr);
            case 5:
                Fifth fifth = new Fifth(arr);
                fifth.duplication(arr);
        }
    }
}
