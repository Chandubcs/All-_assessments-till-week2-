package comparing;

import entities.Guest;

import java.util.Comparator;

public class Compares implements Comparator<Guest> {
    @Override
    public int compareTo(Object obj1, Object obj2) {
        if (obj1.getId() > obj2.getId()) {
            return 1;
        }
        if (obj2.getId() > obj1.getId()) {
            return -1;
        } else
            return 0;
    }
}
