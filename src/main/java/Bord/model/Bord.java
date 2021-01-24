package Bord.model;

import Stukken.model.EnumTypes;
import Stukken.model.Stukken;
import Stukken.model.Toren;
import Stukken.model.*;
import static view.Stukken.BordView.SIZE;


/**
 * Het model van het speelbord
 * 
 * @author Katleen
 */
public class Bord {
    
    public static Stukken[][] schaakbord; //moet public zijn voor in controler
    private int x;
        
    /**
     * Constructor voor het schaakbord
     */
    public Bord(){
        schaakbord = new Stukken[8][8];
        ZetStukken();
    }
   
    
    /**
     * Zet alle stukken op het bord
     * 
     * De basis voor deze methode komt van https://www.geeksforgeeks.org/design-a-chess-game/
     */
    public void ZetStukken(){
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
     * Kijk of het vakje op het bord ligt
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
    
    
    /**
     * Geef de I-coordinaat van de array
     * 
     * @param x de schermcoordinaat x (double)
     * @return het arrayvakje op i (int)
     */
    public double getI(double x){
        int i = (int)((x-SIZE)/SIZE);
        return i;
    }
   
    
   /**
     * Geef de J-coordinaat van de array
     * 
     * @param y de schermcoordinaat y (double)
     * @return het arrayvakje op j (int)
     */ 
    public double getJ(double y){
        int j = (int)((y-SIZE)/SIZE);
        return j;
    }
    
    
    /**
     * Krijg het stuk op een bepaald vakje
     * 
     * @param x x-coordinaat van het scherm
     * @param y y-coordinaat van het scherm
     */
    public void getStukOp(int x, int y){
        if (schaakbord[x][y] instanceof Stukken){
            getInhoud(x,y);
//            System.out.println("Stuk" + ":" + "" + getInhoud(x,y) + "" + "gelukt");
        } 
    }

    
    /**
     * Neem een stuk op de gekozen plaats
     * 
     * @param x gekozen x-coordinaat
     * @param y gekozen y-coordinaat
     */
    public void neemStukOp(int x, int y) {
        schaakbord[x][y] = null;
    }

    
    /**
     * Zet een stuk neer op een gekozen plaats
     * 
     * @param stuk Het genomen stuk
     * @param xcor De gekozen x-coordinaat
     * @param ycor De gekozen y-coordinaat
     * 
     * Hierbij werd geholpen door de neef van Katleen
     */
    public void zetneer(Stukken stuk, int xcor, int ycor) {
        schaakbord[xcor][ycor] = stuk;
    } 

}