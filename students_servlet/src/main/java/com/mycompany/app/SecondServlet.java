package com.mycompany.app;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {
     private int  count2;

    @Override
    public  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        count2++;
        Util util=new Util();
        ServletContext context=getServletContext();
        util.incrementTotalVisits(context);
        String username=req.getParameter("username1");
        String password=req.getParameter("password1");
        PrintWriter writer=resp.getWriter();
        String html="<h1>username:"+ username+" <br> "+"<password:</h1>"+password;
        writer.println(html);
        writer.println("visits to servlet2:"+count2);
      int total=util.getTotalVisitsCount(context);
        writer.println("visits to the application:"+total);


    }
}
