package org.cap.dao;

import org.cap.entities.AppUser;
import org.cap.exceptions.MobileNoAlreadyExistsException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl implements IUserDao {

    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public boolean checkCredentialsById(int id, String password) {
        AppUser user = entityManager.find(AppUser.class, id);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }


    @Override
    public boolean checkCredentialsByMobileNo(String mobileNo, String password) {
        AppUser user = findByMobileNo(mobileNo);
        if (user == null) {
            return false;
        }
        return user.getPassword().equals(password);
    }


    @Override
    public AppUser findUserById(int id) {
        AppUser user = entityManager.find(AppUser.class, id);
        return user;
    }

    @Override
    public AppUser findByMobileNo(String mobileNo) {
        try {
            String jql = "from AppUser where mobileNo=:mob";
            TypedQuery<AppUser> query = entityManager.createQuery(jql, AppUser.class);
            query.setParameter("mob", mobileNo);
            AppUser result = query.getSingleResult();
            return result;
        }catch (NoResultException e){
            return null;
        }
    }


    @Override
    public List<AppUser> fetchUsers(int blockSize) {
        String jql = "from AppUser";
        TypedQuery<AppUser> query = entityManager.createQuery(jql, AppUser.class);
        query.setMaxResults(blockSize);
        List<AppUser> list = query.getResultList();
        return list;
    }


    public boolean mobileNumberExists(String mobileNo) {
        AppUser user = findByMobileNo(mobileNo);
        return user != null;
    }

    @Override
    public AppUser save(AppUser user) {
        System.out.println("inside save,user=" + user);
        String phone = user.getMobileNo();
        boolean exists = mobileNumberExists(phone);
        if (exists) {
            throw new MobileNoAlreadyExistsException("mobile no exists");
        }
        user = getEntityManager().merge(user);
        return user;
    }
}
