package ch8.pub;

import ch8.sub.SubListener;

import java.util.ArrayList;
import java.util.List;

public class Pub {

    public String value = null;

    public void inCome() {
        value = "바나나";
    }

    public List<SubListener> subList = new ArrayList<>();

    public void add(SubListener sub) {
        subList.add(sub);
    }

    public void notifyChange(String msg) {
        for (SubListener sub : subList) {
            sub.update(msg);
        }
    }
}
