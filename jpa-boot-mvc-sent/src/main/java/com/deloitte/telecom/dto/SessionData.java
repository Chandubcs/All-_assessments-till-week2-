package com.deloitte.telecom.dto;

import com.deloitte.telecom.entities.AppUser;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class SessionData {

    private AppUser user;

    public void setUser(AppUser user){
        this.user=user;
    }

    public AppUser getUser(){
        return user;
    }




}
