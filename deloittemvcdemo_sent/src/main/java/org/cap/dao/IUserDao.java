package org.cap.dao;

import org.cap.entities.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserDao {


Employee getUserByUsername(String username);
boolean credentialsCorrect(String username, String password);



}
