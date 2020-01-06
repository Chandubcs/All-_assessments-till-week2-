package com.deloitte.telcom.service;


import com.deloitte.telcom.entities.CustomerAccount;

import java.util.Map;

public interface ICustomerAccountService {
    CustomerAccount findByMobileNo(String mobileNo);
    void rechargeAccount(CustomerAccount cust , double amt);
    CustomerAccount addCustomerDetails(String mobileNo, String name, String accountType, double balance);


}
