package com.deloitte.telcom.service;

import com.deloitte.telcom.dao.CustomerAccountDaoImpl;
import com.deloitte.telcom.dao.ICustomerAccountDao;
import com.deloitte.telcom.entities.CustomerAccount;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class AccountServiceImplTest {

    @Test
    public void testCreateAccount_1() {
        CustomerAccountServiceImpl service = new CustomerAccountServiceImpl(new CustomerAccountDaoImpl());
        String mobileNo = "1234567890";
        double balance = 1000.5;
        String name = "satya";
        String accountType = "prepaid";
        CustomerAccount account = service.addCustomerDetails(mobileNo, name, accountType, balance);
        Assert.assertNotNull(account);
        double resultBalance = account.getBalance();
        Assert.assertEquals(balance, resultBalance, 0);
        Assert.assertEquals(name, account.getName());
        ICustomerAccountDao dao =service.getDao();
        Map<String, CustomerAccount> store = dao.getStore();
        CustomerAccount expected = store.get(mobileNo);
        Assert.assertNotNull(expected);
        Assert.assertEquals(expected, account);
    }
    /*
    @Test
    public void testFindByMobileNo_1()
    {
        CustomerAccountServiceImpl service = new CustomerAccountServiceImpl(new CustomerAccountDaoImpl());
        String mobileNo = "1234567890";
        double balance = 1000.5;
        String name = "satya";
        String accountType = "prepaid";
        CustomerAccount account = service.addCustomerDetails(mobileNo, name, accountType, balance);
        Map<String, CustomerAccount> store = service.getDao().getStore();
        store.put(mobileNo,account);
        CustomerAccount result=service


    }

     */
}
