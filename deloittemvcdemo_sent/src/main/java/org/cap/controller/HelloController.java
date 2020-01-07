package org.cap.controller;

import org.cap.entities.Employee;
import org.cap.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import sun.reflect.generics.scope.Scope;

@Controller
public class HelloController {
    private IUserService service;
    private  Employee employee;

    public Employee getEmployee() {
        return employee;
    }
   @Autowired
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }




    public IUserService getService() {
        return service;
    }
@Autowired
    public void setService(IUserService service) {
        this.service = service;
    }
    @GetMapping("/userinput")
    public ModelAndView userinput()
    {
        return  new ModelAndView("userinput");

    }

    @GetMapping("/hello")
    //@RequestMapping(method = {RequestMethod.GET}, value = "/hello")
    public ModelAndView sayHello() {
        return new ModelAndView("hellopage",
                "message", "Welcome to Deloitte");
    }
   /* @GetMapping("/userdetails")
    public ModelAndView userdetails(@RequestParam("id") int id,@RequestParam("name") String name)
    {
        Employee user =new Employee(id,name);
        ModelAndView mv=new ModelAndView("userdetails","user",user);
        return mv;

    }

    */
    @GetMapping("/logincheck")
    public ModelAndView processUserdetails(@RequestParam("username") String username,@RequestParam("password") String password)
    {
        boolean credentialCorrect=service.credentialsCorrect(username,password);
        if(credentialCorrect)
        {
            Employee user=service.getUserByUsername(username);
            ModelAndView mv=new ModelAndView("userdetails","user",user);
            return mv;
        }
        else
        {
             ModelAndView mv=new ModelAndView("employeeinput");
             return mv;
        }
    }
    /*
    @GetMapping("/logincheck2")
    public RedirectView loginCheck(@RequestParam("username") String username,@RequestParam("password") String password)
    {
        employee.setUsername(username);
        employee.setPassword(password);
        if(employee.credentialsCorrect(username,password))
        {
            System.out.println("username:"+username+"Password"+password);
            return new RedirectView("/home");

        }else{
            return  new RedirectView("/userinput");
        }
    }

     */
    @GetMapping("/home")
    public Object home(){
        if(employee.getId() ==0)
        {
            return new RedirectView("/userinput");
        }
        ModelAndView mv=new ModelAndView("home","user",employee);
        return mv;
    }





}
