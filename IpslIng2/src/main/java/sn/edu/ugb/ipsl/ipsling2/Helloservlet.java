/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miki_Biboy
 */
@WebServlet(name = "Helloservlet", urlPatterns = {"/bonjour", "/bonsoir"})
public class Helloservlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String prenom = req.getParameter("prenom");
       String chemin = req.getServletPath().replace("/", "");
        resp.setContentType("text/html");
        try(PrintWriter writer=resp.getWriter()){
            writer.print("<html>");
            writer.print("<head>");
            writer.print("<title> HelloWorld </title>");
            writer.print("</head>");
            writer.print("<body>");
            writer.print("<h2>"+chemin +" " + prenom +"</h2>");
            writer.print("</body>");
            writer.print("</html>");
        }
    }

    
}
