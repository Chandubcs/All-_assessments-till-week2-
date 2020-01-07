package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CanvasMain {

    public static void main(String[] args) {
        //
        //ApplicationContext is the specification
        // implementation we are using is AnnotationConfigApplicationContext
        //
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //
        //registering configuration class in which configuratins are kept
        //
        Class configurationClass=JavaConfig.class;
        context.register(configurationClass);
        context.refresh();
        context.registerShutdownHook();
      //  context.registerShutdownHook();
        //
        //fetching bean by type
        //
        Canvas canvas = context.getBean(Canvas.class);
        System.out.println(canvas.getClass());
        Shape shape1=context.getBean(Shape.class);
        System.out.println(shape1.getClass());
      //  Shape shape2=canvas.getShape();
        Shape shape2=context.getBean(Shape.class);
        System.out.println(shape1==shape2);
    }
}