package com.mz.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException{
//        req.getRequestDispatcher("index.jsp").forward(req, resp);
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().println("hello servlet 你大爷的!");
    }

    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse resp) throws ServletException , IOException{
        doGet(req, resp);
    }
}
