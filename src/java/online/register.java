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
public class register extends HttpServlet {

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
            out.println("<Html>\n" +
"<head>\n" +
"<style>\n" +
"   body{\n" +
"      font-family: Century Gothic;\n" +
"      \n" +
"   }\n" +
"  \n" +
".div1{\n" +
"   width: 600px;\n" +
"   height: 890px;\n" +
"   box-shadow:0px 30px 30px rgb(170, 170, 218);\n" +
"   border: 1px solid grey;\n" +
"   align-content: initial;\n" +
"   background-color: burlywood;\n" +
"}\n" +
".button\n" +
"{\n" +
"   width:180px;\n" +
"   height: 50px;\n" +
"   font-family: Century Gothic;\n" +
"   border: 1px solid grey;\n" +
"   background-color: grey;\n" +
"   color: khaki;\n" +
"\n" +
"\n" +
"}\n" +
".input1{\n" +
"   width:180px;\n" +
"   height: 50px;\n" +
"   font-family: Century Gothic;\n" +
"   border: 1px solid grey;\n" +
"\n" +
"}\n" +
".input{\n" +
"   width:580px;\n" +
"   height: 50px;\n" +
"   font-family: Century Gothic;\n" +
"   border: 1px solid grey;\n" +
"}\n" +
"select{\n" +
"   width:580px;\n" +
"   height: 50px;\n" +
"   font-family: Century Gothic;\n" +
"   border: 1px solid grey;\n" +
"}\n" +
"select:focus{\n" +
"   background-color: grey;\n" +
"   color: white;\n" +
"   border:2px solid black;\n" +
"   box-shadow:0px 10px 20px grey;\n" +
"   transition:0.6s ease;\n" +
"}\n" +
"input:focus\n" +
"{\n" +
"   background-color: grey;\n" +
"   color: white;\n" +
"   border:2px solid black;\n" +
"   box-shadow:0px 10px 20px grey;\n" +
"   transition:0.6s ease;\n" +
"}\n" +
"\n" +
"h2{\n" +
"   background-color: black;\n" +
"   color: white;\n" +
"   padding:10px;\n" +
"}\n" +
"</style>\n" +
"</head>\n" +
"<body>\n" +
"<center>\n" +
"<div class='div1'>\n" +
"   <table width='600' height='1200' border='0' cellpadding='10'>\n" +
"      <tr class='v' ><center><h2>REGISTRATION PAGE</h2></center></tr>\n" +
"      <tr>*UserID</tr>\n" +
"      <tr><input class='input' type='text' name='t1'></tr>\n" +
"      <tr>*First Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *Middle Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; *Last Name</tr>\n" +
"      <br>\n" +
"      <tr><input class='input1' type='text' name='t1'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class='input1' type='text' name='t1'>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input class='input1' type='text' name='t1'></tr>\n" +
"      <tr>&nbsp;*E-Mail</tr>\n" +
"      <tr><input class='input' type='text' name='t1'></tr>\n" +
"      <tr>Password</tr>\n" +
"      <tr><input class='input' type='password' name='t1'></tr>\n" +
"      <tr>Address</tr>\n" +
"      <tr><input class='input' type='text' name='t1'></tr>\n" +
"      <tr>City</tr>\n" +
"      <tr><input class='input' type='text' name='t1'></tr>\n" +
"      <tr>State</tr>\n" +
"      <tr><select name='State'>\n" +
"         <option value='Uttar Pradesh'>Uttar Pradesh</option>\n" +
"         <option value='Uttarakhand'>Uttarakhand</option>\n" +
"         <option value='Maharastra'>Maharastra</option>\n" +
"         <option value='Bihar'>Bihar</option>\n" +
"      </select></tr>\n" +
"      <tr>ZIP/Portal</tr>\n" +
"      <tr><input class='input' type='text' name='t1'></tr>\n" +
"      <tr>Country</tr>\n" +
"      <tr><input class='input' type='text' name='t1'></tr>\n" +
"      <tr>Phone</tr>\n" +
"      <tr><input class='input' type='number' name='t1'></tr>\n" +
"      <br>\n" +
"      <br>\n" +
"      <tr><input class='button' type='button' value='SUBMIT'></tr>\n" +
"   </table>\n" +
"</div>\n" +
"</center>\n" +
"</body>\n" +
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
