package com.deloitte.ecommerce.service;

import entities.Ewallet;

import java.util.Set;

public interface IEwalletService {
    void addEmployee(Ewallet e);

    Ewallet findEmployeeByphno(String phno);

    Set<Ewallet> allEmployees();
    boolean

}
