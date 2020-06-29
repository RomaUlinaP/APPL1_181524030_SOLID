
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RomaUlina
 */
public class SecurityManager {
    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;
    Scanner myInput = new Scanner(System.in);
    
    public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck){
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
    }
    
    public void Check(){
        System.out.println("Choose option: 1 - KeyCard, 2 - PinCode:");
        int option = myInput.nextInt();
        switch (option){
            case 1:
                System.out.println(this.keyCardCheck.ValidateUser());
                break;
            case 2:
                System.out.println(this.pinCodeCheck.ValidateUser());
                break;
        }
    }
}
