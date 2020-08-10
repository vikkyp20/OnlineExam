
package online;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class QuesList extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
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
"      <div>\n" +
                " <center><h1>Questions List</h1> <div style='width:900px;height:700px'><table  border=10px><tr bgcolor=yellow><th>QuesId</th>      "
                  + "<th>Question</th><th>option1</th>"
                  + "<th>option2</th><th>option3</th>     "
                  +"<th>option4</th><th>Answer</th><th>Action1</th>"
                  + "<th>Action2</th></tr>");
            DBCon db = new DBCon();
         db.pstmt=db.con.prepareStatement("select * from questions");
         db.rst=db.pstmt.executeQuery();
         while(db.rst.next())
         {
             out.println("<tr><td>"+db.rst.getString(1)+"</td><td>"+db.rst.getString(2)+"</td><td>"+db.rst.getString(3)+"</td><td>"+db.rst.getString(4)+"</td><td>"+db.rst.getString(5)+"</td><td>"+db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td><td><a href=UpdateQues?QuesId="+db.rst.getString(1)+">Update</a></td><td><a href=DeleteQues?QuesId="+db.rst.getString(1)+">Delete</a></td></tr>");
         }


out.println("</table></center></body>    \n" +
"</html>");
        }
        catch(Exception e)
        {
            e.printStackTrace();
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
