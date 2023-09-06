/*Задача 1:
        Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
        Переопределить методы voice(), eat(String food) чтобы они выводили верную
        информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
        Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
        туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
        или другую строку то он будет недоволен.*/
package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Animal you want to feed");
            System.out.println("Dog/Rabbit/Tiger");
            String animal = scanner.next();
            System.out.println("Food?");
            String food = scanner.next();
            switch (animal) {
                case ("Dog") -> {
                    Dog dog = new Dog(food);
                    dog.Eat(food);
                    dog.Voice();
                }
                case ("Rabbit") -> {
                    Rabbit rabbit = new Rabbit(food);
                    rabbit.Eat(food);
                    rabbit.Voice();
                }
                case ("Tiger") -> {
                    Tiger tiger = new Tiger(food);
                    tiger.Eat(food);
                    tiger.Voice();
                }
                default -> System.out.println("We dont have animal");
            }
        }
    }
}