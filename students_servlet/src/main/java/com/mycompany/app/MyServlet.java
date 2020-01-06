package com.mycompany.app;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value="/first",initParams={@WebInitParam(name="visits",value="10"),})

public class MyServlet extends HttpServlet {
    private int visitsCounter;

    /**
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void init() throws ServletException{
        ServletConfig servletConfig=getServletConfig();
        String counterStr=servletConfig.getInitParameter("visits");
        visitsCounter=Integer.parseInt(counterStr);
        System.out.println("countervalue:"+visitsCounter);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("inside first servlet");
        visitsCounter++;
        Util util=new Util();
        ServletContext context=getServletContext();
        util.incrementTotalVisits(context);
        PrintWriter writer=resp.getWriter();
        writer.println("visits to servlet:"+visitsCounter);
        int total=util.getTotalVisitsCount(context);
        writer.println("visits to applicaton:"+total);
      //  RequestDispatcher dispatcher=req.getRequestDispatcher("/second");
       // dispatcher.forward(req,resp);
       /* String user1=req.getParameter("username1");
        String  pass1=req.getParameter("password1");
        String url="/second?username1="+user1+"&password1="+pass1;
        resp.sendRedirect(url);//why not req//what if dopost()

        */
    }
/*
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

    }*/
}







