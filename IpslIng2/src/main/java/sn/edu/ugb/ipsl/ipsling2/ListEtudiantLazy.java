/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2;

import javax.inject.Named;
import javax.faces.view.ViewScoped;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;
import javax.ejb.EJB;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import sn.edu.ugb.ipsl.ipsling2.metier.EtudiantFacade;

/**
 *
 * @author Miki_Biboy
 */
@Named(value = "listEtudiantLazy")
@ViewScoped
public class ListEtudiantLazy implements Serializable {

     private LazyDataModel<Etudiant> lazyEtudiants;
     @EJB
     private EtudiantFacade etudiantFacade;
    /**
     * Creates a new instance of ListEtudiantLazy
     */
    public ListEtudiantLazy() {
    }

    public LazyDataModel<Etudiant> getLazyEtudiants() {
        if(lazyEtudiants == null){
            lazyEtudiants = new LazyDataModel<Etudiant>() {
                @Override
                public void forEach(Consumer<? super Etudiant> action) {
                    super.forEach(action); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                }

                @Override
                public Spliterator<Etudiant> spliterator() {
                    return super.spliterator(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                }

                @Override
                public int count(Map<String, FilterMeta> map) {
                    return etudiantFacade.count();
                }

                @Override
                public List<Etudiant> load(int numpage, int taille, Map<String, SortMeta> map, Map<String, FilterMeta> map1) {
                    return etudiantFacade.load(numpage, taille);
                }
            };
        }
        return lazyEtudiants;
    }

    public void setLazyEtudiants(LazyDataModel<Etudiant> lazyEtudiants) {
        this.lazyEtudiants = lazyEtudiants;
    }

    public EtudiantFacade getEtudiantFacade() {
        return etudiantFacade;
    }

    public void setEtudiantFacade(EtudiantFacade etudiantFacade) {
        this.etudiantFacade = etudiantFacade;
    }
    
}
