package First;

import java.util.*;

/*Задача 1:
        Пользователь вводит с клавиатуры значение в массив. После чего запускаются два
        потока. Первый поток находит максимум в массиве, второй — минимум. Результаты
        вычислений возвращаются в метод main().*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> arrl= new ArrayList<>();
        arrl.add(0);
        arrl.add(1);
        arrl.add(2);
        arrl.add(3);
        arrl.add(4);
        Max max = new Max(arrl);
        max.start();
        max.join();
        Min min = new Min(arrl);
        min.start();

    }

}