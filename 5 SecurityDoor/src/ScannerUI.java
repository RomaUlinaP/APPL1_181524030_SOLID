
import Interface.ISecurityUI;
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
public class ScannerUI implements ISecurityUI{
    Scanner myInput = new Scanner(System.in);
    @Override
    public String RequestKeyCard() {
        System.out.println("Slide your key card");
        return myInput.nextLine();
    }

    @Override
    public int RequestPinCode() {
        System.out.println("Enter your pin code:");
        return myInput.nextInt();
    }
}
