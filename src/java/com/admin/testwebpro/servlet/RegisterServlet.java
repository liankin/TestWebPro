/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.testwebpro.servlet;

import com.admin.testwebpro.entity.User;
import com.admin.testwebpro.dao.UserDao;
import com.admin.testwebpro.dao.UserDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class RegisterServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name"); //获取jsp页面传过来的参数  
        String pwd = request.getParameter("pwd");  
        String sex = request.getParameter("sex");  
        String home = request.getParameter("home");  
        String info = request.getParameter("info");  
          
        User user = new User(); //实例化一个对象，组装属性  
        user.setName(name);  
        user.setPwd(pwd);  
        user.setSex(sex);  
        user.setHome(home);  
        user.setInfo(info);  
          
        UserDao ud = new UserDaoImpl();  
          
        if(ud.register(user)){  
            request.setAttribute("username", name);  //向request域中放置参数   
            request.getRequestDispatcher("/login.jsp").forward(request, response);  //转发到登录页面  
        }else{  
              
            response.sendRedirect("home.jsp");//重定向到首页  
        }  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
