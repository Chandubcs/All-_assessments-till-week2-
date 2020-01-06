package service;

import entities.Guest;

import java.util.Set;

public interface IGuestService {
 void addGuest(Guest g);
 public Set<Guest> allGuests();
}
