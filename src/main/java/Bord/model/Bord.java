package Bord.model;



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
    private EnumSpeler speler;
    private int speelstuk;
    private EnumTypes type;
    
    
    //maak het bord
    //zet speler, witte en zwarte stukken
    //reset het bord

    public Bord(){
        schaakbord = new Stukken[8][8];
        LeegBord();
        ZetStukken();
    }
   
    
    public void LeegBord(){
        schaakbord = new Stukken[8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
              schaakbord[i][j]= new Stukken(speler,type) {}; 
            }
        }   
    }
    /**
     * zal de stukken op het bord plaatsen
     */
    public void ZetStukken(){
        int x;
        for(x=0; x<8; x++){
            schaakbord[x][6]= new Pion(EnumSpeler.WIT, EnumTypes.PION);
        }
        for(x=0; x<8; x++){
            schaakbord[x][1]= new Pion(EnumSpeler.ZWART, EnumTypes.PION);
        }
        schaakbord[0][0]= new Toren(EnumSpeler.ZWART, EnumTypes.TOREN);
        schaakbord[1][0]= new Paard(EnumSpeler.ZWART, EnumTypes.PAARD);
        schaakbord[2][0]= new Loper(EnumSpeler.ZWART, EnumTypes.LOPER);
        schaakbord[3][0]= new Koning(EnumSpeler.ZWART, EnumTypes.KONING);
        schaakbord[4][0]= new Queen(EnumSpeler.ZWART, EnumTypes.QUEEN);
        schaakbord[5][0]= new Loper(EnumSpeler.ZWART, EnumTypes.LOPER);
        schaakbord[6][0]= new Paard(EnumSpeler.ZWART, EnumTypes.PAARD);
        schaakbord[7][0]= new Toren(EnumSpeler.ZWART, EnumTypes.TOREN); 
        
        schaakbord[0][7]= new Toren(EnumSpeler.WIT, EnumTypes.TOREN);
        schaakbord[1][7]= new Paard(EnumSpeler.WIT, EnumTypes.PAARD);
        schaakbord[2][7]= new Loper(EnumSpeler.WIT, EnumTypes.LOPER);
        schaakbord[3][7]= new Koning(EnumSpeler.WIT, EnumTypes.KONING);
        schaakbord[4][7]= new Queen(EnumSpeler.WIT, EnumTypes.QUEEN);
        schaakbord[5][7]= new Loper(EnumSpeler.WIT, EnumTypes.LOPER);
        schaakbord[6][7]= new Paard(EnumSpeler.WIT, EnumTypes.PAARD);
        schaakbord[7][7]= new Toren(EnumSpeler.WIT, EnumTypes.TOREN); 
    }
    
    
    
    public Stukken getInhoud(int x,int y){
         if(x<0)return null;
         if(x>=8)return null;
         if(y<0)return null;
         if(y>=8)return null;
         return schaakbord[x][y];
       }
    }
    
    

