/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/J2EE/EJB31/SingletonEjbClass.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2.metier;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author Miki_Biboy
 */
@Singleton(name = "startupBean")
@Startup // executer la classe au démarrage
public class StartupBean {
    
    @PostConstruct // permet d'executer une fois l'objet créé
    public void demarrage(){
        System.out.println("#### Demarrage Application ####");
    }
}
