/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.WebApplicationException;

/**
 *
 * @author Miki_Biboy
 */
@WebServlet(name = "PDFBuilder", urlPatterns = {"/pdf"})
public class PDFBuilder extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String fichier = req.getParameter("fichier");
        if(fichier==null){
            //throw new WebApplicationException("Fichier introuvable", 404);
            resp.sendError(500, "Erreur sur Fichier");
            return ;
        }
        File download = new File("C:\\Users\\Miki_Biboy\\Documents\\Genesis\\Apprentissage\\Cours_ING2\\JEE\\documents");
        File aLire = new File(download, fichier);
        if(!aLire.isFile()){
            //throw new WebApplicationException("Fichier introuvable", 404);
            resp.sendError(404, "Fichier introuvable");
            return ;
        }
        resp.setContentType("application/pdf");
        try(FileInputStream f = new FileInputStream(aLire); OutputStream os = resp.getOutputStream()){
            byte[] buffer = new byte[2048];
            int longueur;
            while((longueur=f.read(buffer))!=-1){
            os.write(buffer, 0, longueur);
            }
            os.flush();
        }
        
    }
    
}
