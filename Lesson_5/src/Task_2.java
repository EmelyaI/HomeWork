/*Задача 2:
        Создать программу для раскраски шахматной доски с помощью цикла. Создать
        двумерный массив String 8х8. С помощью циклов задать элементам массива значения
        B(Black) или W(White). При выводе результат работы программы должен быть
        teachmeskills.by
        следующим:
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W
        W B W B W B W B
        B W B W B W B W*/
public class Task_2 {
    public static void main(String[] args) {
        String[][] arr = new String[8][8];
        String W = "W";
        String B = "B";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0)
                {
                    arr[i][j] = W;
                    System.out.print(" " + arr[i][j]);
                } else
                {
                    if (j % 2 != 0 && i % 2 != 0)
                    {
                        arr[i][j] = W;
                        System.out.print(" " + arr[i][j]);
                    }else {
                        arr[i][j] = B;
                        System.out.print(" " + arr[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
