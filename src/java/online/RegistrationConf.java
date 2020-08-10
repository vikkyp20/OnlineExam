
package online;

import DB.DBCon;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationConf extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
      String user=request.getParameter("t1");
      String pswd=request.getParameter("t2");
      String name=request.getParameter("t3");
      String qua=request.getParameter("t4");
      String dob=request.getParameter("t5");
      String gen=request.getParameter("gen");
      String addr=request.getParameter("addr");
      String city=request.getParameter("city");
      String state=request.getParameter("state");
      String pin=request.getParameter("pin");
      String contact=request.getParameter("cnt");
      DBCon db=new DBCon();
      db.pstmt=db.con.prepareStatement("insert into details values(?,?,?,?,?,?,?,?,?,?) ");
      db.pstmt.setString(1, user);
      db.pstmt.setString(2, name);
      db.pstmt.setString(3, qua);
      db.pstmt.setString(4, dob);
      db.pstmt.setString(5, gen);
      db.pstmt.setString(6, addr);
      db.pstmt.setString(7, city);
      db.pstmt.setString(8, state);
      db.pstmt.setString(9, pin);
      db.pstmt.setString(10, contact);
      int i1=db.pstmt.executeUpdate();
      db.pstmt=db.con.prepareStatement("insert into logintable values(?,?,?)");
      db.pstmt.setString(1, user);
      db.pstmt.setString(2, pswd);
      db.pstmt.setString(3, "Member");
      int i2=db.pstmt.executeUpdate();
      if(i1>0 && i2>0){
          out.println("<script>alert('Student Registered Successfully')</script>");
          response.sendRedirect("OnlineExam?msg=Student Registered Successfully");
      }
      else{
          out.println("<script>alert('Error in Registration')</script>");
          out.println("<a href=register>Back</a>");
      }
      
        }
        catch(Exception e){
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
