/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import sn.edu.ugb.ipsl.ipsling2.metier.EtudiantFacade;

/**
 *
 * @author Miki_Biboy
 */
@Named(value = "ajoutEtudiantBean")
@SessionScoped
public class AjoutEtudiant implements Serializable {

    @EJB
    private EtudiantFacade etudiantFacade;
    private Etudiant etudiant = new Etudiant();
    private String mdp;

  

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    
    public String enrigistrer(){
        try {
            MessageDigest mdph = MessageDigest.getInstance("SHA-512");
            byte[] hash = mdph.digest(mdp.getBytes());
            String hash64 = Base64.getEncoder().encodeToString(hash);
            etudiant.setMdp(hash64);
            etudiantFacade.create(etudiant);
            System.out.println("Enrigistrement de " + etudiant + ".");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(AjoutEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "ajout_etudiant.xhtml?faces-redirect=true";
    }
    
}
