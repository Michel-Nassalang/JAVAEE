/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2.metier;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import sn.edu.ugb.ipsl.ipsling2.Etudiant;

/**
 *
 * @author Miki_Biboy
 */
@Stateless
public class EtudiantFacade extends AbstractFacade<Etudiant> {

    @PersistenceContext(unitName = "IpslIng2 ")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EtudiantFacade() {
        super(Etudiant.class);
    }

    public List<Etudiant> load(int numpage, int taille) {
        Query q = em.createNamedQuery("Etudiant.findAll");
        int firstResult = (numpage - 1)*taille;
        q.setFirstResult(firstResult );
        q.setMaxResults(taille);
        return q.getResultList();
    }
    
}
