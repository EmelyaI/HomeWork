package First;
/*Задача 1:
        Пользователь вводит в консоль дату своего рождения. Программа должна вернуть дату,
        когда пользователю исполнится 100 лет. Использовать Date/Time API.*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Enter the date in the format 'dd/mm/yyyy'");
        String birthDay = scanner.next();
        LocalDate rightFormatDate = LocalDate.parse(birthDay, formatter);
        LocalDate birthDay100 = rightFormatDate.plusYears(100);
        System.out.println(birthDay100);
    }
}
