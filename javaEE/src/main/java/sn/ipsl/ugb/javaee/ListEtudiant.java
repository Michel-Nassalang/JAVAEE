/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ipsl.ugb.javaee;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Miki_Biboy
 */
public class ListEtudiant {
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaEE_PU");
        EntityManager em = emf.createEntityManager();
        Etudiant etu=em.find(Etudiant.class, 1);
        System.out.println("etudiant recuperer="+etu);
        Query q=em.createQuery("SELECT e FROM Etudiant e WHERE e.id = 1");
        List<Etudiant> etudiants=q.getResultList();
        System.out.println("--------- liste etudiants ------------");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
        em.close();
        emf.close();
    }
    
}
