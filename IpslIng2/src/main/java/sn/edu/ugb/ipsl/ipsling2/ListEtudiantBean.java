/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import sn.edu.ugb.ipsl.ipsling2.metier.EtudiantFacade;

/**
 *
 * @author Miki_Biboy
 */
@Named(value = "listEtudiantBean")
@ViewScoped
public class ListEtudiantBean implements Serializable {

    private List<Etudiant> etudiants;
     /**
     * Creates a new instance of ListEtudiantBean
     */
    @EJB
    private EtudiantFacade etudiantFacade;
    
    public ListEtudiantBean() {
    }

    public List<Etudiant> getEtudiants() {
        if (etudiants==null) {
            etudiants = etudiantFacade.findAll();
        }
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }
    
    
}
