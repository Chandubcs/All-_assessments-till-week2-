package com.mycompany.app;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class Canvas {

    private Shape shape;

    public Shape getShape(){
        return shape;
    }

    public void setShape(Shape shape){
        this.shape=shape;
    }

    public Canvas() {
    }

    @Autowired
    public Canvas(Shape shape) {
        System.out.println("inside constructor,shape="+shape);
       this.shape=shape;
    }

    public void draw(){
        double area = shape.area();
        System.out.println("area=" + area);
    }

}






