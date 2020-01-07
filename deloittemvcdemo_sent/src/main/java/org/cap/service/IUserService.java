package org.cap.service;

import org.cap.entities.Employee;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {

    Employee getUserByUsername(String username);
    boolean credentialsCorrect(String username,String password);




}
