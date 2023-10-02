package Fifth;
/*Задача 5:
        Используя Supplier написать метод, который будет возвращать введенную с консоли
        строку задом наперед.*/

import java.util.Scanner;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        StringBuilder aa = new StringBuilder(a);
        Supplier<String> supplierRevers = () -> aa.reverse().toString();
        System.out.println(supplierRevers.get());
    }
}
