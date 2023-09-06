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
public class JpqlTest {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaEE_PU");
        EntityManager em = emf.createEntityManager();
        
        Query q = em.createQuery("SELECT e FROM Etudiant e");
        List<Etudiant> etudiants = q.getResultList();
        for(Etudiant etudiant : etudiants){
            System.out.println("Etudiant"+ etudiant);
        }
        
        System.out.println("Etudiant avec id 10");
        Query qu = em.createQuery("SELECT e FROM Etudiant e WHERE e.id=10");
        Etudiant etu = (Etudiant) qu.getSingleResult();
        
        System.out.println("Etudiant"+ etu);
        
        System.out.println("Etudiant avec nom donnée en paramètre");
        Query qn = em.createQuery("SELECT e FROM Etudiant e WHERE e.nom=:nom");
        qn.setParameter("nom", "prenom5");
        
        List<Etudiant> etn = qn.getResultList();
        for(Etudiant etudiant : etn){
            System.out.println("Etudiant par nom: "+ etudiant);
        }
        
        System.out.println("Etudiant avec nom donnée en parametre avec la clause like");
        Query ql = em.createQuery("SELECT e FROM Etudiant e WHERE e.nom like :nom");
        ql.setParameter("nom", "p%");
        
        List<Etudiant> etl = ql.getResultList();
        for(Etudiant etudiant : etl){
            System.out.println("Etudiant par nom: "+ etudiant);
        }
        
        System.out.println("Etudiant avec requete créé à l'exterieur avec login");
        Query qname = em.createNamedQuery("Etudiant.login");
        qname.setParameter("login", "pnom3");
        qname.setParameter("pass", "passer");
        
        Etudiant etname = (Etudiant) qname.getSingleResult();
        System.out.println("Etudiant par nom: "+ etname);
        
        System.out.println("Etudiant avec requete créé à l'exterieur findAll");
        Query qnamef = em.createNamedQuery("Etudiant.findAll");
        
        List<Etudiant> etus = qnamef.getResultList();
        for(Etudiant etudiant : etus){
            System.out.println("Etudiant par nom: "+ etudiant);
        }
        
        em.close();
        emf.close();
    }
}
