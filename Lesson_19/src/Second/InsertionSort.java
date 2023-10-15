package Second;

import java.util.Arrays;

public class InsertionSort extends Thread {
    private int[] arr;

    public InsertionSort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int left = 0; left < arr.length; left++) {
            int value = arr[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < arr[i]) {
                    arr[i + 1] = arr[i];
                } else {
                    break;
                }
            }
            arr[i + 1] = value;
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
