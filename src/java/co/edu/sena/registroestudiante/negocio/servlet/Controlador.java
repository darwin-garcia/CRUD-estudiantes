/** @author ErickG */
package co.edu.sena.registroestudiante.negocio.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controlador extends HttpServlet {

  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">   
  /**
   * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
   * methods.
   *
   * @param req servlet request
   * @param res servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  protected void processRequest(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException {
    res.setContentType("text/html;charset=UTF-8");
    try (PrintWriter out = res.getWriter()) {
      /* TODO output your page here. You may use following sample code. */
      out.println("<!DOCTYPE html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>Servlet Controlador</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<h1>Servlet Controlador at " + req.getContextPath() + "</h1>");
      out.println("</body>");
      out.println("</html>");
    }
  }

  String listar = "_vista/listar.jsp";
  String add = "_vista/add.jsp";
  String edit = "_vista/edit.jsp";

  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param req servlet request
   * @param res servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException {
    String acceso = "";
    String action = req.getParameter("accion");
    if (action.equalsIgnoreCase("listar")) {
      acceso = listar;
    }
    RequestDispatcher vista = req.getRequestDispatcher(acceso);
    vista.forward(req, res);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param req servlet request
   * @param res servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse res)
          throws ServletException, IOException {
    processRequest(req, res);
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

} // Fin Servlet Controlador
