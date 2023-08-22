/*Задача 1:
        Создать класс CreditCard c полями номер счета, текущая сумма на счету. Добавьте
        метод, который позволяет начислять сумму на кредитную карточку. Добавьте метод,
        который позволяет снимать с карточки некоторую сумму. Добавьте метод, который
        выводит текущую информацию о карточке. Напишите программу, которая создает три
        объекта класса CreditCard у которых заданы номер счета и начальная сумма.
        Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        третьей. Выведите на экран текущее состояние всех трех карточек.*/
package Task_1;

import java.util.Scanner;

public class Task_1 extends CreditCard{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        CreditCard cC = new CreditCard();
        for (int i= 0; i<100; i++) {
            System.out.println("What you wanna do?");
            System.out.println("1 - info about card");
            System.out.println("2 - add money");
            System.out.println("3 - withdraw money");
            System.out.println("4 - info about all cards");
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    cC.info();
                    break;
                case 2:

                    cC.add();
                    break;
                case 3:
                    cC.withdraw();
                    break;
                case 4:
                    cC.allinfo();
                    break;
            }
        }
    }
}
