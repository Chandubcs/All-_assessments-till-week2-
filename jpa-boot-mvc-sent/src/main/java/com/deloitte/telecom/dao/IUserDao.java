package com.deloitte.telecom.dao;

import com.deloitte.telecom.entities.AppUser;

import java.util.List;

public interface IUserDao {
    boolean checkCredentialsById(int id, String password);

    boolean checkCredentialsByMobileNo(String mobileNo, String password);

    AppUser findUserById(int id);

    AppUser save(AppUser user);

    AppUser findByMobileNo(String mobileNo);

    List<AppUser> fetchUsers(int blockSize);
}
