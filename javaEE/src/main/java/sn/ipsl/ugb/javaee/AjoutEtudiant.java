/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.ipsl.ugb.javaee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Miki_Biboy
 */
public class AjoutEtudiant {
    
    public static void main(String[] args){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaEE_PU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        
        
        Etudiant e=new Etudiant("Abdou", "Ba", "Master 1", "Saint Louis", "douBa", "passer");
        em.persist(e);
        
        for (int i = 2; i < 20; i++) {
            e=new Etudiant("prenom"+i, "nom"+i, "Annee "+i, "adresse"+i, "pnom"+i, "passer");
            em.persist(e);
        }
        
        
        tx.commit();
        em.close();
        emf.close();
    }
    
}
