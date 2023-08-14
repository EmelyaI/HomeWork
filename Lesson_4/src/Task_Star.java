import java.util.Arrays;

/*Задача *:
        Имеется массив из неотрицательных чисел(любой). Представьте что массив
        представляет целое число (Например массив {1,2,3} -> 123, {9,9,9} -> 999). Задача
        добавить единицу к этому “числу” и на выходе получить исправленный массив. Массив не
        содержит нуля в начале, кроме самого числа 0.
        Пример:
        Input: [1,4,0,5,6,3]
        Output: [1,4,0,5,6,4]
        Input: [9,9,9]
        Output: [1,0,0,0]*/
public class Task_Star {
    public static void main(String[] args) {
        int[] arr1 = {1,4,0,5,6,4};
        System.out.println(Arrays.toString(arr1));
        int x = 0;
        int y = 0;
        for(int i = 0; i < arr1.length; i++){
            x = (int) (arr1[i] * Math.pow(10, arr1.length - i-1));
            y += x;
        }
        y++;
        int z = String.valueOf(y).length();
        int[] arr2 = new int[z];
        int m;
        for (int j = 0; j < z; j++){
            m = (int) Math.pow(10, arr2.length - 1 - j);
            arr2[j] = (int) (y / m);
            y = (int) (y % Math.pow(10, arr2.length - 1 - j));
        }
        System.out.println(Arrays.toString(arr2));
    }
}