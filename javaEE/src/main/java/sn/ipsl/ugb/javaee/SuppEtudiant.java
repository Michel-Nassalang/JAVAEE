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
public class SuppEtudiant {
    
    public static void main(String[] args){
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaEE_PU");
        EntityManager em = emf.createEntityManager();
        Etudiant eSupp=em.find(Etudiant.class, 9);
        System.out.println("on va supprimer "+eSupp);
        
        EntityTransaction tx=em.getTransaction();
        tx.begin();
        
        em.remove(eSupp);
        
        
        tx.commit();
        
        System.out.println("suppression ok");
        em.close();
        emf.close();
    }
    
}
