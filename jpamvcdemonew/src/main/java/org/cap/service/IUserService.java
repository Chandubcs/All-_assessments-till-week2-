package org.cap.service;

import org.cap.entities.AppUser;

import java.util.List;

public interface IUserService {
    boolean checkCredentialsById(int id, String password);

    boolean checkCredentialsByMobileNo(String mobileNo, String password);

    AppUser findUserById(int id);

    AppUser save(AppUser user);

    AppUser findByMobileNo(String mobileNo);

    List<AppUser> fetchUsers(int blockSize);
}
