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
public class StreamProgressInfo {
    private IStreamable file;
    
    public StreamProgressInfo(IStreamable file){
        this.file = file;
    }
    
    public int CalculateCurrentPercent(){
        return file.getByteSent()*100/file.getLength();
    }
}
