package service;

import dao.IGuestDao;
import entities.Guest;

import java.util.Set;

public class GuestServiceImpl implements IGuestService {
    private IGuestDao dao;
    public GuestServiceImpl( IGuestDao dao)
    {
        this.dao=dao;
    }
    @Override
    public void addGuest(Guest g) {

    }

    @Override
    public Set<Guest> allGuests() {
        return null;
    }
}
