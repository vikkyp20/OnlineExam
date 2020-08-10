
package online;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ViewProfile extends HttpServlet {


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
                    + "<th width='150px'><a href='ViewProfile'>ViewProfile</a></th>"
                    
                    + "<th width='150px'><a href='Exam'>Exam</a></th>"
                    + "<th width='150px'><a href='Result'>Result</a></th>"
                   
                    + "<th width='150px'><a href='Query'>Query</a></th>"
                    + "<th width='150px'><a href='ChangePswd'>ChangePswd</a></th>"
                    + "<th width='150px'><a href='Logout'>Logout</a></th>"
                    + "</table></div>\n" +
"      <br>\n" +
"      <div>\n"+
"           <center><div style='width:900px;height:450px;'>\n");
            HttpSession session=request.getSession();
            String user=session.getAttribute("user").toString();
            DBCon db=new DBCon();
            db.pstmt=db.con.prepareStatement("Select * from details where email=?");
            db.pstmt.setString(1,user);
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                out.println("<span style='font-size:40px;color:grey;'>Student Profile</span>"
                        + "<form action='UpdateStu Profile'><table height=450px width=600px>"
                        + "<tr><td>UserName/Email</td><td>"+db.rst.getString(1)+"</td></tr>"
                        + "<tr><td>Nmae</td><td>"+db.rst.getString(2)+"</td></tr>"
                        + "<tr><td>Qualification</td><td>"+db.rst.getString(3)+"</td></tr>"
                        + "<tr><td>DateofBirth</td><td>"+db.rst.getString(4)+"</td></tr>"
                        + "<tr><td>Gender</td><td>"+db.rst.getString(5)+"</td></tr>"
                        + "<tr><td>Address</td><td>"+db.rst.getString(6)+"</td></tr>"
                        + "<tr><td>City</td><td>"+db.rst.getString(7)+"</td></tr>"
                        + "<tr><td>State</td><td>"+db.rst.getString(8)+"</td></tr>"
                        + "<tr><td>Pincode</td><td>"+db.rst.getString(9)+"</td></tr>"
                        + "<tr><td>Contact</td><td>"+db.rst.getString(10)+"</td></tr>"
                        + "<tr><td><input type='Button' value='Print'></td><td><input type=submit value=Update></td></tr>"
                                + "</table></form>");
                 out.println("</div></center></body>");
            out.println("</html>");
            }
            else{
                response.sendRedirect("OnlineExam?msg=Please Login First");
            }
           
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
