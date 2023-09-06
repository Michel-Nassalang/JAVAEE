/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sn.ipsl.ugb.javaee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Miki_Biboy
 */
public class JavaEE {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("javaEE_PU");
        EntityManager em = emf.createEntityManager();
        
        em.close();
        emf.close();
        
    }
}
