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
public class Music implements IStreamable{
    private String artist;
    private String album;
    private int length;
    private int byteSent;
    
    public Music(String Artist, String Album, int Length, int ByteSent){
        this.artist = Artist;
        this.album = Album;
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
