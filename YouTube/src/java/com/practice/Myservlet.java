package com.practice;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


/**
 *
 * @author ADMIN
 */
public class Myservlet extends HttpServlet{

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        System.out.println("this is get methods....");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>This is my first HTTPServlet</h1>");
        out.println("<h1>Todays date"+new Date().toString()+"</h1>");
    } 
}
