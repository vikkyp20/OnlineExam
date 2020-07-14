
package online;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AboutUs extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<!DOCTYPE html>");
            out.println("<html>\n" +
"    <head>\n" +
"        <title>AboutUS</title>\n" +
"       <link rel='stylesheet' type='text/css' href='assets/mystyle.css'>\n" +
"       <style>\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class='div2'></div>\n" +
"        <div class='div1' style='background-color:grey;'><center><img src='img/about-us.jpg' width='750px' height='350px'></center></div>\n" +
"        <div class='div2'><table width='1520px' height='40px' bgcolor='black'><th width='320px'><marquee class='marquee1'>Online Examination System</marquee></th><th width='240px'><a href='OnlineExam'>Home</a></th><th width='240px'><a href='rules'>Rules</a></th><th width='240px'><a href='AboutUS'>AboutUS</a></th><th width='240px'><a href='feed'>Feedback</a></th><th width='240px'><a href='Contact'>ContactUs</a></th></table></div>     \n" +
"    \n" +
"        <div style='padding-left:350px ;padding-top: 100px;padding-right: 350px;' ><fieldset style='width: 550px;height: 600px; border: 3px dashed blue;'>\n" +
"        <ul type='disc'>\n" +
"           <br><h1>Online Examination System</h1> &nbsp;&nbsp; <h3>is the MCQ(Multiple choice question) based examination system which is buil using JAVA abd MySql.It provide an easy to use interface for both Test Conductor and Student appearingfor examination </h3>\n" +
"           <br>\n" +
"           <h1>Missions</h1><br>\n" +
"           <li><h3>Responses by the candidates will be checked automatically and instantly.</h3></li><br>\n" +
"           <li><h3>Online examination will reduce the hectic job of assessing the answers given by the candidates.</h3></li><br>\n" +
"           <li><h3>This project would be very useful for educatonal linstitutes where regular evaluation of students is required.</h3><br>\n" +
"        </li>\n" +
"        </ul>\n" +
"        </fieldset></div> \n" +
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
