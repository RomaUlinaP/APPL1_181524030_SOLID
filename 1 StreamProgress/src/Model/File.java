/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Interface.IStreamable;

/**
 *
 * @author RomaUlina
 */
public class File implements IStreamable {
    private String name;
    private int length;
    private int byteSent;
    
    public File(String Name, int Length, int ByteSent){
        this.name = Name;
        this.length = Length;
        this.byteSent = ByteSent;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public int getByteSent() {
        return this.byteSent;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @param byteSent the byteSent to set
     */
    public void setByteSent(int byteSent) {
        this.byteSent = byteSent;
    }
}
