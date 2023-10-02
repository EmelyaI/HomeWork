package Second;

import java.util.function.Predicate;

/*Задача 2:
        Используя Predicate среди массива чисел вывести только те, которые являются
        положительными*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -6, -8, 2, 5, 10};
        System.out.print("Positive numbers: ");
        for (int j : arr) {
            Predicate<Integer> positive = z -> z > 0;
            if (positive.test(j)) {
                System.out.print(j + ", ");
            }
        }
    }
}
