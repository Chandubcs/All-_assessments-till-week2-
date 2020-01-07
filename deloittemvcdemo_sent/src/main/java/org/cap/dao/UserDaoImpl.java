package org.cap.dao;

import org.cap.entities.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Repository
public class UserDaoImpl implements IUserDao {
  private Map<String, Employee> store=new HashMap<>();

public UserDaoImpl()
{
    Employee e1=new Employee(1,"chandu","chandu","password1");
    Employee e2=new Employee(2,"abhinav","abhinav","password2");
    store.put("chandu",e1);
    store.put("abhinav",e2);


}

@Override
    public boolean credentialsCorrect(String username,String password)
{
    Employee obj=store.get(username);
       return obj.getPassword().equals(password);
}

@Override
    public Employee getUserByUsername(String username)
{
    Employee user=store.get(username);
    return user;
}
}
