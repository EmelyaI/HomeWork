package Second;

import java.util.Arrays;

import static java.util.Collections.swap;

public class BubbleSort extends Thread {
    private int[] arr;

    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
