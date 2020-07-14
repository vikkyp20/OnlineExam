/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class Contact extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>\n" +
"    <head>\n" +
"        <title>ContactUs</title>\n" +
"       <link rel='stylesheet' type='text/css' href='assets/mystyle.css'>\n" +
"       <style>\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class='div2'></div>\n" +
"        <div class='div1' style='background-color:grey;'><center><img src='img/img1.png' width='1520px' height='350px'></center></div>\n" +
"        <div class='div2'><table width='1520px' height='40px' bgcolor='black'><th width='320px'><marquee class='marquee1'>Online Examination System</marquee></th><th width='240px'><a href='OnlineExam'>Home</a></th><th width='240px'><a href='rules'>Rules</a></th><th width='240px'><a href='AboutUS'>AboutUS</a></th><th width='240px'><a href='feed'>Feedback</a></th><th width='240px'><a href='Contact'>ContactUs</a></th></table></div>     \n" +
"    \n" +
"        <div  ><div style='padding-left:150px ;padding-top: 100px;float: left;'><fieldset style='width: 550px;height: 450px; border: 30px solid blue;'>\n" +
"            <br><br><br><br>\n" +
"        <center>\n" +
"           <h1>Online Examination System </h1> <br><br><br><br>\n" +
"                <h3>Developed By:</h3 ><br>\n" +
"            <h3>Online Examination Team <br>\n" +
"                Contact Detail: <br>\n" +
"                Mobile No :8989898989<br> \n" +
"                Email: admin@exam.com </h3>\n" +
"        </center>\n" +
"        </fieldset></div>\n" +
"        <div style='padding-right: 50px;padding-top: 190px;'><center><img src='img/contact.png' style='width: 450px;height: 150px; float: right; padding-right: 90px;'></center></div></div> \n" +
"    </body>\n" +
"</html>    ");
           
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
