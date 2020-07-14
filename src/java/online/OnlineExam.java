
package online;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class OnlineExam extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>\n" +
"    <head>\n" +
"        <title>Online Examination</title>\n" +
"        <link rel='stylesheet' type='text/css' href='assets/mystyle.css'>\n" +
"    </head>\n" +
"    <body>\n" +
"      <div class='div2'><table cellspacing=0 border='0px' cellpadding='10px'>\n" +
"          <tr width='1510px' height='40px'><th width='1200px' height='40px'></th><th width='70px' height='40px'><h6>NewUser? <h6></th><th width='50px' height='40px'><a href='register'>REGISTER</a></th></tr>\n" +
"      </table></div>  \n" +
"      <div class='div1'><img src='img/img1.png' width='1520px' height='350px'></div>\n" +
"      <div class='div4'><table width='1520px' height='40px' bgcolor='black'><th width='320px'><marquee class='marquee1'>Welcome to Online Examination System</marquee></th><th width='240px'><a href='OnlineExam'>Home</a></th><th width='240px'><a href='rules'>Rules</a></th><th width='240px'><a href='AboutUS'>AboutUS</a></th><th width='240px'><a href='feed'>Feedback</a></th><th width='240px'><a href='Contact'>ContactUs</a></th></table></div>\n" +
"      <br>\n" +
"      <div>\n" +
"      <div class='div3'>\n" +
"      \n" +
"      <table width='350px' height='355px' bgcolor='powderblue'  >\n" +
"          <tr ><th width='330px' height='40px' bgcolor='burlywood'><h1>Login</h1></th></tr>\n" +
"          <tr><td><h3>User ID*</h3></td></tr>\n" +
"          <tr cellpadding='10px'><td><input class='input1' type='text' name='t1'></td></tr>\n" +
"          <tr><td><h3>Password*</h3></td></tr>\n" +
"          <tr cellpadding='10px'><td><input class='input1' type='password' name='t1'></td></tr>\n" +
"          <tr><td><input class='input2' type='button' value='Submit'>&nbsp;&nbsp;<input class='input2' type='button' value='Reset'></td></tr>\n" +
"      </table>\n" +
"      <br>\n" +
"      <table width='350px' height='355px' bgcolor='burlywood'   > \n" +
"        <tr ><th width='330px' height='40px' bgcolor='powderblue'><h1>News</h1></th></tr>\n" +
"        <tr width='330px' heigth='300px'><center><th ><marquee class='marquee2' direction='up'><ul type='disc'>\n" +
"            <li>Result of 3rd year declared</li><br>\n" +
"            <li>Result of 3rd year declared</li><br>\n" +
"            <li>Result of 3rd year declared</li><br>\n" +
"            <li>Result of 3rd year declared</li><br>\n" +
"        </ul></marquee></th></center></tr>\n" +
"    </table>\n" +
"    </div>\n" +
"    <div class='div5'><div class='img1'><img src='img/book.jpg'  width= 1160px height= 220px float=center border='5px doggerblue' ></div>\n" +
"    <br>\n" +
"    <div class='div7'>\n" +
"       <h1>&nbsp;Online Examination System has divided exams in two categries and each &nbsp;category has a sub Category:- \n" +
"        </h1>\n" +
"        <ul type='square'>\n" +
"            <li><h3>Computer Science</h3></li><br>\n" +
"            <ul type='disc'>\n" +
"                <li><h3>C Language Test</h3></li><br>\n" +
"                <li><h3>C++ Language Test</h3></li><br>\n" +
"                <li><h3>Java Test</h3></li><br>\n" +
"            </ul>\n" +
"            <li><h3>Others</h3></li><br>\n" +
"           <ul type='disc'>\n" +
"                <li><h3>General Knowledge Test</h3></li><br>\n" +
"                <li><h3>English Language Test</h3></li><br>\n" +
"    \n" +
"            </ul>\n" +
"        </ul>\n" +
"    </div>\n" +
"    </div>\n" +
"    <div class='div6'><center>&copy;Copyright Reserved To Online Examination System</center></div>\n" +
"</body>    \n" +
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
