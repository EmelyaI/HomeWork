package First;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unique {
    private ArrayList arr;

    public Unique(ArrayList arr) {
        this.arr = arr;
    }

    public ArrayList FindUnique(List<String> list) {
        Set<String> set = new HashSet<>(list);
        list.clear();
        list.addAll(set);
        return (ArrayList) list;
    }

    public ArrayList getArr() {
        return arr;
    }

    public void setArr(ArrayList arr) {
        this.arr = arr;
    }
}