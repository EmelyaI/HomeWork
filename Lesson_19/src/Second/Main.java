package Second;

/*Задача 2:
       Сортировка массива цифр в нескольких потоках различными алгоритмами:
         сортировка вставками;
         сортировка выбором;
         сортировка пузырьком.
        Каждый вид сортировки должен запускаться в отдельном потоке. После вывести
        результат отсортированных массивов в консоль.*/
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 2, 1};
        BubbleSort bubbleSort = new BubbleSort(arr);
        SelectionSort selectionSort = new SelectionSort(arr);
        InsertionSort insertionSort = new InsertionSort(arr);
        bubbleSort.start();
        selectionSort.start();
        insertionSort.start();
    }
}