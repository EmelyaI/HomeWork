package additionalTask;

public class Third {
    private String[] arr;

    public Third(String[] arr) {
        this.arr = arr;
    }

    public void averagelength(String[] arr)
    {
        int totallength =0;
        for (String s : arr)
        {
            totallength += s.length();
        }
        int averageLength = totallength/ arr.length;
        for (int i = 0; i< arr.length;i++)
        {
            if (arr[i].length()<averageLength)
            {
                System.out.println("String "+ i+1 + ": " + arr[i] + ". Length - " + arr[i].length());
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
