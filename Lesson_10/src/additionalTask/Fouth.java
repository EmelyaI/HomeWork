package additionalTask;

public class Fouth {
    private String[] arr;

    public Fouth(String[] arr) {
        this.arr = arr;
    }

    public void samesymbols(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean same = false;
            for (int j = 1; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) != arr[i].charAt(j - 1)) {
                    same = false;
                } else {
                    same = true;
                    break;
                }
            }
            if (same == false) {
                System.out.println(arr[i] + ". Has no same symbols");
                break;
            }
        }

    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
