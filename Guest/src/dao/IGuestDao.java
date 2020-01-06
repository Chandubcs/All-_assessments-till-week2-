package dao;

import entities.Guest;

import java.util.Set;

public interface IGuestDao {
void addGuest(Guest obj);
Set<Guest> allGuests();



}
