package com.deloitte.ecommerce.dao;

import com.deloitte.ecommerce.exceptions.EmployeeNotFoundException;
import entities.Ewallet;
import exceptions.EmployeeNotFoundException;

import java.util.*;

public class EwalletDaoImpl implements IEwalletDao {
    private Map<String, Ewallet> store = new HashMap<>();

    @Override
    public void addEmployee(Ewallet e) {
        store.put(e.getPhno(),e);

    }
    @Override
    public void transferMoney(Ewallet e,double amount)
    {



    }
    @Override
    public Ewallet findEmployeeByphno(String phno) {
        Ewallet e=store.get(phno);
        if(e==null)
        {
            throw new EmployeeNotFoundException("Employee not found for phno:"+phno);
        }
        return e;
    }
    @Override
    boolean credentialsCorrect(String username,String passsword)
    {
        Ewallet obj=
    }

    @Override
    public Set<Ewallet> allEmployees() {
        Collection<Ewallet> wallets=store.values();
        Set<Ewallet> walletSet = new HashSet<>(wallets);
        return walletSet;

    }
}
