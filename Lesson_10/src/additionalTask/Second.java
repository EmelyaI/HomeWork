package additionalTask;

public class Second {
    private String[] arr;

    public Second(String[] arr) {
        this.arr = arr;
    }

    public void sort(String[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    String buff = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = buff;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("1: " + arr[i] + ". Length - " + arr[i].length());
        }
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
