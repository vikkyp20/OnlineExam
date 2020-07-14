
package online;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class StudentHome extends HttpServlet {

   
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
"          <tr width='1510px' height='40px'><th width='1300px' height='40px'></th><th width='90px' height='40px'><h5>NewUser?</h5> </th><th width='50px' height='40px'><a href='register'>REGISTER</a></th></tr>\n" +
"      </table></div>  \n" +
"      <div class='div1'><img src='img/img1.png' width='1520px' height='350px'></div>\n" +
"      <div class='div4'><table width='1520px' height='40px' bgcolor='black'>"
                    + "<th width='150px'><a href='ViewProfile'>ViewProfile</a></th>"
                    
                    + "<th width='150px'><a href='Exam'>Exam</a></th>"
                    + "<th width='150px'><a href='Result'>Result</a></th>"
                   
                    + "<th width='150px'><a href='Query'>Query</a></th>"
                    + "<th width='150px'><a href='ChangePswd'>ChangePswd</a></th>"
                    + "<th width='150px'><a href='Logout'>Logout</a></th>"
                    + "</table></div>\n" +
"      <br>\n" +
"      <div>\n" +

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
