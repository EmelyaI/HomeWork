/*Задача 2:
        Создать класс, который будет хранить в себе коллекцию с названиями животных.
        Реализовать методы удаления и добавления животных по следующим правилам:
        добавляется всегда в начало коллекции, а удаляется всегда из конца. Показать работу
        объекта этого класса в main методе другого класса.*/
package Second;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String animal;
        Scanner scanner = new Scanner(System.in);
        Fmain fmain = new Fmain();
        for(int i = 0; i<10; i++)
        {
            int z = scanner.nextInt();
            switch (z) {
                case 1:
                    animal = scanner.next();
                    fmain.putt(animal);
                    break;
                case 2:
                    fmain.del();
                    break;
            }
            System.out.println(fmain.getList());
        }
    }
}
