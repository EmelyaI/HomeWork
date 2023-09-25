package Second;


import java.util.ArrayList;
import java.util.List;

public class Fmain {
    private String animal;
    private List<String> list = new ArrayList<>();

    public void putt(String animal)
 {
     list.add(0, animal);
     setList(list);
 }
 public void del()
 {
     list.remove(list.size()-1);
     setList(list);
 }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
