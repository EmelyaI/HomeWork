package First;

import java.util.List;
/*Задача 1:
        Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        Stream'ов:
        - Удалить дубликаты
        - Оставить только четные элементы
        - Вывести сумму оставшихся элементов в стриме*/
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 3, 4);
        numbers = numbers.stream()
                .distinct()
                .filter(n -> n % 2 == 0)
                .reduce((x,y) -> x*y)
                .stream().toList();
        System.out.println(numbers);

    }
}
