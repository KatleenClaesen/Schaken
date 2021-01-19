package Bord.model;

import Bord.model.Vakje;
import Bord.model.Coordinaat;
import Bord.model.Vakken;
import Speler.model.EnumSpeler;
import Stukken.model.EnumTypes;
import Stukken.model.Stukken;
import Stukken.model.Toren;
import java.util.HashSet;
import view.Stukken.*;
import Stukken.model.*;
/**
 *
 * @author katle
 */
public class Bord {
    private Stukken[][] schaakbord;
    private int speler;
    private int speelstuk;
    private Coordinaat coordinaat;
    
    //maak het bord
    //zet speler, witte en zwarte stukken
    //reset het bord

    public Bord(){
        schaakbord = new Stukken[8][8];
        //LeegBord();
        ZetStukken();
    }
    
    private static final String Paard = "file:///D:/github/Schaken/afbeeldingen/Paard.png";    
    

      
    
    
    /*public void LeegBord(){
        schaakbord = new Vakken[8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
              schaakbord[i][j]= new Vakken(i,j) {}; 
            }
        }   
    }*/
    public void ZetStukken(){
        schaakbord[6][7]= new Paard(0,0, EnumSpeler.ZWART, EnumTypes.PAARD);
        schaakbord[1][7]= new Paard(0,0, EnumSpeler.ZWART, EnumTypes.PAARD);
        /*stuk.add(new Stukken(2,0, EnumSpeler.ZWART, EnumTypes.LOPER));
        stuk.add(new Stukken(3,0, EnumSpeler.ZWART, EnumTypes.QUEEN));
        stuk.add(new Stukken(4,0, EnumSpeler.ZWART, EnumTypes.KONING));
        stuk.add(new Stukken(5,0, EnumSpeler.ZWART, EnumTypes.LOPER));
        stuk.add(new Stukken(6,0, EnumSpeler.ZWART, EnumTypes.PAARD));
        stuk.add(new Stukken(7,0, EnumSpeler.ZWART, EnumTypes.TOREN));
        stuk.add(new Stukken(0,1, EnumSpeler.ZWART, EnumTypes.PION));
        stuk.add(new Stukken(1,1, EnumSpeler.ZWART, EnumTypes.PION));
        stuk.add(new Stukken(2,1, EnumSpeler.ZWART, EnumTypes.PION));
        stuk.add(new Stukken(3,1, EnumSpeler.ZWART, EnumTypes.PION));
        stuk.add(new Stukken(4,1, EnumSpeler.ZWART, EnumTypes.PION));
        stuk.add(new Stukken(5,1, EnumSpeler.ZWART, EnumTypes.PION));
        stuk.add(new Stukken(6,1, EnumSpeler.ZWART, EnumTypes.PION));
        stuk.add(new Stukken(7,1, EnumSpeler.ZWART, EnumTypes.PION));
        
        
        stuk.add(new Stukken(0,7, EnumSpeler.WIT, EnumTypes.TOREN));
        stuk.add(new Stukken(1,7, EnumSpeler.WIT, EnumTypes.PAARD));
        stuk.add(new Stukken(2,7, EnumSpeler.WIT, EnumTypes.LOPER));
        stuk.add(new Stukken(3,7, EnumSpeler.WIT, EnumTypes.QUEEN));
        stuk.add(new Stukken(4,7, EnumSpeler.WIT, EnumTypes.KONING));
        stuk.add(new Stukken(5,7, EnumSpeler.WIT, EnumTypes.LOPER));
        stuk.add(new Stukken(6,7, EnumSpeler.WIT, EnumTypes.PAARD));
        stuk.add(new Stukken(7,7, EnumSpeler.WIT, EnumTypes.TOREN));
        stuk.add(new Stukken(0,6, EnumSpeler.WIT, EnumTypes.PION));
        stuk.add(new Stukken(1,6, EnumSpeler.WIT, EnumTypes.PION));
        stuk.add(new Stukken(2,6, EnumSpeler.WIT, EnumTypes.PION));
        stuk.add(new Stukken(3,6, EnumSpeler.WIT, EnumTypes.PION));
        stuk.add(new Stukken(4,6, EnumSpeler.WIT, EnumTypes.PION));
        stuk.add(new Stukken(5,6, EnumSpeler.WIT, EnumTypes.PION));
        stuk.add(new Stukken(6,6, EnumSpeler.WIT, EnumTypes.PION));
        stuk.add(new Stukken(7,6, EnumSpeler.WIT, EnumTypes.PION));
        */
        System.out.println(schaakbord);
    
    }
    public Stukken getInhoud(int x,int y){
         if(x<0)return null;
         if(x>=8)return null;
         if(y<0)return null;
         if(y>=8)return null;
         return schaakbord[x][y];
       }
    }
    
    

