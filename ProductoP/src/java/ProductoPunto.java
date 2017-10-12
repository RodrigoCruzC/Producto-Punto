/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ProductoPunto;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "ProductoPunto", urlPatterns = {"/ProductoPunto"})
public class ProductoPunto extends HttpServlet {

    

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
        //Se piden todas las posiciones
        String [] posiciones = {"m11","m12","m13","m14","m21","m22","m23","m24"};
        String [] Matriz1 = new String [4];
        String [] Matriz2 = new String [4];
        int [] Producto = new int [4];
        //se asignan las posiciones a dos arrays que actuaran como 2 matrices
        for (int i = 0; i < 4; i++) {
            Matriz1[i] = request.getParameter(posiciones[i]);
            Matriz2[i] = request.getParameter(posiciones[i+4]);
        }
        //El producto es la multiplicacion entre las posiciones, se hace eso
        for (int i = 0; i < 4; i++) {
            Producto[i]= Integer.parseInt(Matriz1[i])*Integer.parseInt(Matriz2[i]);
        }
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Producto punto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> El resultado es: <h1> <br>");
            //se imprimen con un for
                    for (int i = 0; i < 4; i++) {
                        out.println(Producto[i]);
                        if(i == 1){
                            out.println("<br>");
                        }
                    }
            out.println("</body>");
            out.println("</html>");
        }
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
