/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2.metier;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import sn.edu.ugb.ipsl.ipsling2.Etudiant;

/**
 *
 * @author Miki_Biboy
 */
@Singleton
@Startup
@DependsOn({"startupBean"})
public class InitEtudiant {
    
    @EJB
    private EtudiantFacade etudiantFacade;
   
    @PostConstruct
    public void initialEtudiants(){
        System.out.println("#### Initialisation des etudiants ####");
        System.out.println("#### Nombre d'étudiants dans la base " + etudiantFacade.count() + " ####");
        if(etudiantFacade.count()==0){
            Etudiant e1 = new Etudiant("Mansal", "Edgar", "passer", "mansal.edgar@ugb.edu.sn", "Saly Carrefour", "771112236");
            etudiantFacade.create(e1);
            Etudiant e2 = new Etudiant("Sarr", "Nicolas", "passer", "sarr.nicolas@ugb.edu.sn", "Saly Carrefour", "771112236");
            etudiantFacade.create(e2);
            
            for (int i = 0; i < 10; i++) {
                Etudiant etu = new Etudiant("Nom", "Prenom", "passer", "prenom"+ i + "nom"+ i +"@ugb.edu.sn", "Adresse"+i, "tel"+i);
                etudiantFacade.create(etu);
            }
        }
    }
}
