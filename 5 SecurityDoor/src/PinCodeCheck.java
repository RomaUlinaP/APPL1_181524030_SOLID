
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
public class PinCodeCheck extends SecurityCheck{
    private ISecurityUI securityUI;
    public PinCodeCheck(ISecurityUI securityUI){
        this.securityUI = securityUI;
    }
    private boolean IsValid(int Pin){
        return true;
    }
    public boolean ValidateUser(){
        int pin = securityUI.RequestPinCode();
        if(IsValid(pin)){
            return true;
        }
        return false;
    }
}
