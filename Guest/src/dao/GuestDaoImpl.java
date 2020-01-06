package dao;

import entities.Guest;

import java.util.*;

public class GuestDaoImpl implements IGuestDao {
    private Map<Integer, Guest> store = new TreeMap(compares);

    @Override
    public void addGuest(Guest obj) {
        store.put(obj.getId(), obj);
    }
    @Override


    @Override
    public Set<Guest> allGuests() {
        Collection<Guest> guests = store.values();
        Set<Guest> guestSet = new TreeSet<>(guests);
        return guestSet;
    }



}
