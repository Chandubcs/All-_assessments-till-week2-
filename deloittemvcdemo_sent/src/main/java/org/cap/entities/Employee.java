package org.cap.entities;

public class Employee {

    private int id;

    private String name;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String  username;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(){

    }

    public Employee(int id,String name,String username,String passsword){
        this.id=id;
        this.name=name;
        this.password=passsword;
        this.username=username;
    }

}
