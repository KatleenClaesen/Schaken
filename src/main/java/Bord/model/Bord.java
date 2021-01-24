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
 * Het model van het speelbord
 * @author Katleen
 */
public class Bord {
    
    public static Stukken[][] schaakbord;
    private EnumSpeler speler;
    private int speelstuk;
    private EnumTypes type;
    
    
    //reset het bord

    
    /**
     * Constructor voor het schaakbord
     */
    public Bord(){
        schaakbord = new Stukken[8][8];
        LeegBord();
        ZetStukken();
    }
   
    
    /**
     * Maak een leeg schaakbord (8x8)
     */
    public void LeegBord(){
        schaakbord = new Stukken[8][8];
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
              schaakbord[i][j]= new Stukken(speler,type) {}; 
            }
        }   
    }

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
    /**
     * Krijg vakje op array-bord
     * 
     * @param i x-coordinaat op array-bord
     * @param j y-coordinaat op array-bord
     * @return een vak op het schaakbord
     */
    public Stukken getInhoud(int i,int j){
         if(i<0)return null;
         if(i>=8)return null;
         if(j<0)return null;
         if(j>=8)return null;
         return schaakbord[i][j];

       }
    
    }
    
    

