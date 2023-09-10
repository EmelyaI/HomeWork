package additionalTask;

public class First {
    private String[] arr;

    public First(String[] arr) {
        this.arr = arr;
    }

    public void longAndShort(String[] arr) {
        String shortest = arr[0];
        String shortest1 = arr[1];
        String longest = arr[0];
        String longest1;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1].length() < arr[i].length()) {
                shortest1 = arr[i - 1];

            }
            if (shortest1.length() < shortest.length()) {
                shortest = shortest1;
            }
            if (arr[i - 1].length() > arr[i].length()) {
                longest1 = arr[i - 1];

            } else {
                longest1 = arr[i];
            }
            if (longest1.length() > longest.length()) {
                longest = longest1;
            }

        }
        System.out.println("Shortest string - " + shortest + ". Length - " + shortest.length());
        System.out.println("Longest string - " + longest + ". Length - " + longest.length());
    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
