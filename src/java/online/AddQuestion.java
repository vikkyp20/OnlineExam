
package online;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddQuestion extends HttpServlet {


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
"          <tr width='1510px' height='40px'><th width='1300px' height='40px'></th><th width='90px' height='40px'><h5></h5> </th><th width='50px' height='40px'><a href='#'></a></th></tr>\n" +
"      </table></div>  \n" +
"      <div class='div1'><img src='img/img1.png' width='1520px' height='350px'></div>\n" +
"      <div class='div4'><table width='1520px' height='40px' bgcolor='black'>"
                    + "<th width='112px'><a href='StudentList'>StudentList</a></th>"
                    + "<th width='114px'><a href='AddQuestion'>AddQuestion</a></th>"
                    + "<th width='112px'><a href='QuesList'>QuesList</a></th>"
                    + "<th width='112px'><a href='Result'>Result</a></th>"
                    + "<th width='112px'><a href='NewsPanel'>NewsPanel</a></th>"
                    + "<th width='114px'><a href='ViewFeedback'>ViewFeedback</a></th>"
                    + "<th width='112px'><a href='ChangePswd'>ChangePswd</a></th>"
                    + "<th width='112px'><a href='Logout'>Logout</a></th>"
                    + "</table></div>\n" +
"      <br>\n" +
"      <div>\n"
                    + "<div style='height:700px;'><center><h1>Add Question</h1><br>"
                    + "<form action=AddConf>"
                    + "<table width='350px' height='600px' border='0'><tr width=250px height=150px><td >"
                    + "<h3>Question:</h3></td>"
                    + "<td ><textarea name='t1' ></textarea></td>"
                    + "</tr>"
                    + "<tr><td><h3>option1:</h3></td>"
                    + "<td><input type='text' name=t2></td></tr>"
                    +"<tr><td><h3>option2:</h3></td>"
                    + "<td><input type='text' name=t3></td></tr>"
                    +"<tr><td><h3>option3:</h3></td>"
                    + "<td><input type='text' name=t4></td></tr>"
                    +"<tr><td><h3>option4:</h3></td>"
                    + "<td><input type='text' name=t5></td></tr>"
                    +"<tr><td><h3>Answer:</h3></td>"
                    + "<td><input type='text' name=t6></td></tr>"
                    + "<tr><td><input type=submit value=UploadQuestiion></td></tr>"
                    + "</table></form></center>" +


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
