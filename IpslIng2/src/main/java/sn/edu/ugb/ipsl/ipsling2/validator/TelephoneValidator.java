/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sn.edu.ugb.ipsl.ipsling2.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

/**
 *
 * @author Miki_Biboy
 */
@FacesValidator("telephoneValidator")
public class TelephoneValidator implements Validator<String>{

    @Override
    public void validate(FacesContext fc, UIComponent uic, String t) throws ValidatorException {
        if(t==null || t.isEmpty()){
            FacesMessage fm = new FacesMessage("Telephone obligatoire");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(fm);
        }
        if (!t.startsWith("+221")) {
            FacesMessage fm = new FacesMessage("Format incorrect");
            fm.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(fm);
        }
    }
    
}
