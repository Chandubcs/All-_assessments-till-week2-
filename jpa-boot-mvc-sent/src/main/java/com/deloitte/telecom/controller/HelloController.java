package com.deloitte.telecom.controller;

import com.deloitte.telecom.dto.SessionData;
import com.deloitte.telecom.entities.AppUser;
import com.deloitte.telecom.exceptions.MobileNoAlreadyExistsException;
import com.deloitte.telecom.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HelloController {
    private static Logger Log= LoggerFactory.getLogger(HelloController.class);

    private IUserService service;

    public IUserService getService() {
        return service;
    }

    @Autowired
    public void setService(IUserService service) {
        this.service = service;
    }

    private SessionData sessionData;

    @Autowired
    public void setSessionData(SessionData data) {
        this.sessionData = data;

    }

    public SessionData getSessionData() {
        return sessionData;
    }


    @GetMapping("/userinput")
    public ModelAndView userInput() {
        return new ModelAndView("userinput");
    }

    @GetMapping("/logincheck")
    public RedirectView loginCheck(@RequestParam("phone") String phone,
                                   @RequestParam("password") String password) {
        boolean correct = service.checkCredentialsByMobileNo(phone, password);
        if (!correct) {
            return new RedirectView("/userinput");
        }
        AppUser user = service.findByMobileNo(phone);
        sessionData.setUser(user);
        return new RedirectView("/home");
    }


    @GetMapping("/home")
    public Object home() {
        if (sessionData.getUser() == null) {
            return new RedirectView("/userinput");
        }
        AppUser appUser = sessionData.getUser();
        ModelAndView mv = new ModelAndView("home", "user", appUser);
        return mv;
    }


    @GetMapping("/processregister")
    public RedirectView processRegister(@RequestParam("name") String name,
                                        @RequestParam("phone")String phone,
                                        @RequestParam("password") String password) {
        AppUser user = new AppUser(name, password);
        user.setMobileNo(phone);
        user = service.save(user);
        sessionData.setUser(user);
        return new RedirectView("/home");
    }

    @GetMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("/register");

    }

    @GetMapping("/signout")
    public RedirectView signout() {
        sessionData.setUser(null);
        return new RedirectView("/userinput");
    }

    @GetMapping("/error")
    public ModelAndView error(){
        return new ModelAndView("error","message","something went wrong");
    }

    @ExceptionHandler(MobileNoAlreadyExistsException.class)
    public ModelAndView handleIfMobileNumberAlreadyExists(MobileNoAlreadyExistsException e){
      return new ModelAndView("error","message","mobilenumber already exists");
    }

    @ExceptionHandler(value = Throwable.class)
    public ModelAndView catchAll(Throwable e){
        e.printStackTrace();
      return new ModelAndView("error","message","Something went wrong");
    }


}
