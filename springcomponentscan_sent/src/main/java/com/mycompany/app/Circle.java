package com.mycompany.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Circle implements Shape {

    private int radius;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    @Override
    public double area(){
        return 3.14*radius*radius;
    }
    @PostConstruct
    public void init()
    { radius=4;
        System.out.println("INSIDE Init of circle");
    }
    @PreDestroy
    public void onDestroy(){
        System.out.println("inside onDestroy() ");
    }


}
