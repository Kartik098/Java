package com.practice;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
        


/**
 *
 * @author ADMIN
 */
public class RegisterServlet extends HttpServlet {

    private Object request;

    /**
     *
     * @param Req
     * @param res
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
       res.setContentType("text/html");
       PrintWriter out = res.getWriter();
       out.println("<h2>Welcome to Register Servlet</h2>");
       String name = req.getParameter("user_name");
       String pwd = req.getParameter("pwd");
       String email = req.getParameter("email");
       String Gender = req.getParameter("Gender");
       String Course = req.getParameter("user_course");
       String Terms = req.getParameter("terms");
       if(Terms!=null{
       if(Terms.equals("checked")){
           out.println("<h1>Name:"+name+"</h1>");
           out.println("<h1>Password:"+pwd+"</h1>");
           out.println("<h1>email:"+email+"</h1>");
           out.println("<h1>Gender:"+Gender+"</h1>");
           out.println("<h1>Course:"+Course+"</h1>");
           
       } else{
           out.println("You havn't checked the terms and conditions");
       }
       } else{
           out.println("<h1>You havn't checked the terms and conditions</h1>");
       }
    }
}
