import Model.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RomaUlina
 */
public class Main {
    public static void main(String[] args){
        File file = new File("Test", 12, 12);
        Music music = new Music("Teza Sumendra","WKNDCRUISIN",15,2222);
        
        StreamProgressInfo streamFileInfo = new StreamProgressInfo(file);
        StreamProgressInfo streamMusicInfo = new StreamProgressInfo(music);
        
        System.out.println(streamFileInfo.CalculateCurrentPercent());
        System.out.println(streamMusicInfo.CalculateCurrentPercent());
    }
}
