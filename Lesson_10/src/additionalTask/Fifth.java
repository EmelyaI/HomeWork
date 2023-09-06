package additionalTask;

public class Fifth {
    private String[] arr;

    public Fifth(String[] arr) {
        this.arr = arr;
    }

    public void duplication(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            String str = "";
            for (int j = 0; j < arr[i].length(); j++) {
                String x = String.valueOf(arr[i].charAt(j));
                x = x.concat(x);

                str = str.concat(x);
            }
            System.out.println(str);
        }

    }

    public String[] getArr() {
        return arr;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }
}
