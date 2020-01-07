package org.cap.service;

import org.cap.dao.IUserDao;
import org.cap.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    private IUserDao userDao;
    public IUserDao getUserDao() {
        return userDao;
    }
@Autowired
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }


    @Override
    public Employee getUserByUsername(String username)
    {
        Employee user=userDao.getUserByUsername(username);
        return user;
    }
    @Override
    public boolean credentialsCorrect(String username,String password)
    {
        boolean correct=userDao.credentialsCorrect(username,password);
        return correct;

    }
}
