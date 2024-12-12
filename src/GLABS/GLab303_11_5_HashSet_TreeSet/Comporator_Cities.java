package GLABS.GLab303_11_5_HashSet_TreeSet;

import java.util.Comparator;

public class Comporator_Cities implements Comparator<String> {
    @Override
    public int compare(String city1, String city2) {
        int value = city1.compareTo(city2);

        //sorting elements in reverse order
        if(value > 0){
            return -1;
        }else if (value < 0){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public Comparator<String> reversed() {
        return Comparator.super.reversed();
    }
}
