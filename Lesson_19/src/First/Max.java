package First;

import java.util.Collections;
import java.util.List;

public class Max extends Thread{
    private List<Integer> arrl;

    public Max(List<Integer> arrl) {
        this.arrl = arrl;
    }

    @Override
    public void run() {
        List<Integer> arrll= getArrl();
        int maxx = Collections.max(arrll);
        System.out.println("Max - " + maxx);
    }

    public List<Integer> getArrl() {
        return arrl;
    }

    public void setArrl(List<Integer> arrl) {
        this.arrl = arrl;
    }
}
