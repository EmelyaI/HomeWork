package First;

import java.util.Collections;
import java.util.List;

public class Min extends Thread{
    private List<Integer> arrl;

    public Min(List<Integer> arrl) {
        this.arrl = arrl;
    }

    @Override
    public void run() {
        List<Integer> arrll= getArrl();
        int minn = Collections.min(arrll);
        System.out.println("Min - " + minn);

    }

    public List<Integer> getArrl() {
        return arrl;
    }

    public void setArrl(List<Integer> arrl) {
        this.arrl = arrl;
    }
}
