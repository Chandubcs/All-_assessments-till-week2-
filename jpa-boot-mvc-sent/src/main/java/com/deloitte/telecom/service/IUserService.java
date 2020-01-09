package com.deloitte.telecom.service;

import com.deloitte.telecom.entities.AppUser;

import java.util.List;

public interface IUserService {
    boolean checkCredentialsById(int id, String password);

    boolean checkCredentialsByMobileNo(String mobileNo, String password);

    AppUser findUserById(int id);

    AppUser save(AppUser user);

    AppUser findByMobileNo(String mobileNo);

    List<AppUser> fetchUsers(int blockSize);
}
