package Bord.model;

import Bord.model.Vakje;
import Bord.model.Coordinaat;

/**
 *
 * @author katle
 */
public class Bord {
    private Vakje[][] schaakbord;
    private int speler;
    private int speelstuk;
    private Coordinaat coordinaat;
    
    //maak het bord
    //zet speler, witte en zwarte stukken
    //reset het bord

    public Bord() {
     
    }

      
    
    
    public void LeegBord(){
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
              schaakbord[i][j]= new Vakje(new Coordinaat(i,j));
            }
        }   
    }
    
    
    
    
    
}
