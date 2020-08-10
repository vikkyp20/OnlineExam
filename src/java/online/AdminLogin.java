

package online;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AdminLogin extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           out.println("<!DOCTYPE html>");
            out.println("<html>\n" +
"    <head>\n" +
"        <title>Feedback</title>\n" +
"       <link rel='stylesheet' type='text/css' href='assets/mystyle.css'>\n" +
"       <style>\n" +
"        </style>\n" +
"    </head>\n" +
"    <body>\n" +
"        <div class='div2'></div>\n" +
"        <div class='div1' style='background-color:grey;'><center><img src='img/img1.png' width='1520px' height='350px'></center></div>\n" +
"        <div class='div2'><table width='1520px' height='40px' bgcolor='black'><th><marquee class='marquee1'>Admin Login Page</marquee></th></table></div>     \n" +
"    \n" +
"        <div style='padding-left:350px ;padding-top: 100px;padding-right: 350px;' >\n" +
"        \n" +
"        <form action='AdminHome'><table width='350px' height='320px' bgcolor='powderblue'  >\n" +
"          <tr ><th width='330px' height='40px' bgcolor='burlywood'><h1>Login</h1></th></tr>\n" +
"          <tr><td><h3>User ID*</h3></td></tr>\n" +
"          <tr cellpadding='10px'><td><input class='input1' type='text' name='t1'></td></tr>\n" +
"          <tr><td><h3>Password*</h3></td></tr>\n" +
"          <tr cellpadding='10px'><td><input class='input1' type='password' name='t1'></td></tr>\n" +
"          <tr><td><input class='input2' type='submit' value='Submit'>&nbsp;&nbsp;<input class='input2' type='reset' value='Reset'></td></tr>\n" +
"      </table></form></div> \n" +
"    </body>\n" +
"</html>    ");
            if(request.getParameter("t1")!=null)
        try{
            String user=request.getParameter("t1");
            String pswd=request.getParameter("t2");
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("select from logintable where email., and password., and usertype=?"); db. pstmt.setString( 1,user);
            db.pstmt.setString(2,pswd);
            db.pstmt.setString(3,"Admin");
            db.rst=db.pstmt.executeQuery();
             if(db.rst.next())
             {
               HttpSession session=request.getSession(); 
               session.setAttribute("user", user); 
               response.sendRedirect("AdminHome");
             }
             else{
                 out.println("<script>alert('Invalid User or Password')</script>");
             }
        }    
        catch(Exception e){
            e.printStackTrace();
         }
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
