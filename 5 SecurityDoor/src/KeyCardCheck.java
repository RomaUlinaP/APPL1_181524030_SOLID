
import Interface.ISecurityUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RomaUlina
 */
public class KeyCardCheck extends SecurityCheck{
    private ISecurityUI securityUI;
    public KeyCardCheck(ISecurityUI SecurityUI){
        this.securityUI = SecurityUI;
    }
    private boolean IsValid(String Code){
        return true;
    }
   
    @Override
    public boolean ValidateUser() {
        String code = securityUI.RequestKeyCard();
        if(IsValid(code)){
            return true;
        }
        return false;
    }
}
