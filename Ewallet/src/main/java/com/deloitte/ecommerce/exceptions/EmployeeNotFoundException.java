package com.deloitte.ecommerce.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(String msg)
    {
super(msg);
    }

}
