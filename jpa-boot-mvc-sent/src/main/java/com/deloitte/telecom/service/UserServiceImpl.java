package com.deloitte.telecom.service;

import com.deloitte.telecom.dao.IUserDao;
import com.deloitte.telecom.entities.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class UserServiceImpl implements IUserService {

    private IUserDao userDao;

    public IUserDao getUserDao() {
        return userDao;
    }

    @Autowired
    public void setUserDao(IUserDao dao) {
        this.userDao = dao;
    }

    @Override
    public boolean checkCredentialsById(int id, String password) {
        return userDao.checkCredentialsById(id, password);
    }


    @Override
    public boolean checkCredentialsByMobileNo(String mobileNo, String password) {
        return userDao.checkCredentialsByMobileNo(mobileNo, password);
    }

    @Override
    public AppUser findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public AppUser save(AppUser user) {
        return userDao.save(user);
    }

    @Override
    public AppUser findByMobileNo(String mobileNo) {
        AppUser user = userDao.findByMobileNo(mobileNo);
        return user;
    }

    @Override
    public List<AppUser> fetchUsers(int blockSize) {
        List<AppUser> users = userDao.fetchUsers(blockSize);
        return users;
    }

    /*
    @PostConstruct
    public void init(){
       AppUser user1=new AppUser("satya","satya");
       userDao.save(user1);
       AppUser user2=new AppUser("pranav","pranav");
       userDao.save(user2);
    }*/
}
