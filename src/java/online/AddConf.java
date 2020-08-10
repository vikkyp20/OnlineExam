/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

import DB.DBCon;
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
public class AddConf extends HttpServlet {

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
         String ques=request.getParameter("t1");
      String opt1=request.getParameter("t2");
      String opt2=request.getParameter("t3");
      String opt3=request.getParameter("t4");
      String opt4=request.getParameter("t5");
      String ans=request.getParameter("t6");
      DBCon db=new DBCon();
      db.pstmt=db.con.prepareStatement("insert into  questions(ques,opt1,opt2,opt3,opt4,ans) values(?,?,?,?,?,?) ");
   
      db.pstmt.setString(1,ques );
      db.pstmt.setString(2, opt1);
      db.pstmt.setString(3, opt2);
      db.pstmt.setString(4, opt3);
      db.pstmt.setString(5, opt4);
      db.pstmt.setString(6, ans);
      int i1=db.pstmt.executeUpdate();
       if(i1>0){
          out.println("<script>alert('Question Entered Successfully')</script>");
          response.sendRedirect("AddQuestion");
      }
      else{
          out.println("<script>alert('Error in Entertng Question')</script>");
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
