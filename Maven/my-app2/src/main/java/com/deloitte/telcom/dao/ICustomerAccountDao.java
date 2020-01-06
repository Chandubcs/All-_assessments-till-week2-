package com.deloitte.telcom.dao;


import com.deloitte.telcom.entities.CustomerAccount;

import java.util.Map;

public interface ICustomerAccountDao {
    CustomerAccount findByMobileNo(String mobileNo);
    void rechargeAccount(CustomerAccount cust , double amt);
    void addCustomerDetails(CustomerAccount c);
    public Map<String,CustomerAccount> getStore();


}
