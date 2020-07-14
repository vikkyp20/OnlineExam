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
public class rules extends HttpServlet {

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
"        <title>Rules</title>\n" +
"       <link rel='stylesheet' type='text/css' href='assets/mystyle.css'>\n" +
"       <style>\n" +
"           .left{\n" +
"               width: 1200px;\n" +
"               float: left;\n" +
"               padding-left: 120px;\n" +
"           }\n" +
"           .right{\n" +
"               width: 520px;\n" +
"               float: right;\n" +
"           }\n" +
"           fieldset{\n" +
"               border: 2px dashed black;\n" +
"               font-family: Century Gothic;\n" +
"               font-size: 50px;\n" +
"               color: brown;\n" +
"               \n" +
"           }\n" +
"           li{\n" +
"               font-size: 30px;\n" +
"               color:black;\n" +
"           }\n" +
"       </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class='div2'></div>\n" +
"        <div class='div1'><img src='img/rules.jpg' width='1520px' height='350px'></div>\n" +
"        <div class='div2'><table width='1520px' height='40px' bgcolor='black'><th width='320px'><marquee class='marquee1'>Online Examination System</marquee></th><th width='240px'><a href='OnlineExam'>Home</a></th><th width='240px'><a href='rules'>Rules</a></th><th width='240px'><a href='AboutUs'>AboutUS</a></th><th width='240px'><a href='feed'>Feedback</a></th><th width='240px'><a href='Contact'>ContactUs</a></th></table></div> \n" +
"        <br>\n" +
"        <br>\n" +
"        <br>\n" +
"        <br>\n" +
"        <br>\n" +
"        <div>\n" +
"            <div class='left'><fieldset><legend><b>Rules And Regulations that must be followed....</b></legend>\n" +
"            <ul type='disc'>\n" +
"            <li>In this exam panel, there are 20 questions in each exam. Each question carry 1 marks and No negative marking.</li><br>\n" +
"            <li>A quick question table is given in the lright side of the exam panel through which students can directly reach to the specific question.</li><br>\n" +
"            <li>Regarding login security, if user enter wrong password 3 times then that user will be block for 10 Hours. In each test 60%(means 12 question out of 20) will be passing criteria.</li><br>\n" +
"            <li>After exam, please share exam experience.</li><br>\n" +
"            </ul>\n" +
"            </fieldset></div>\n" +
"            \n" +
"        </div>\n" +
"    </body>\n" +
"</html>");
            
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
