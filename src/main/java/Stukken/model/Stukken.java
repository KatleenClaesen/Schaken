
package Stukken.model;

import Bewegen.Beweging;
import Speler.model.EnumSpeler;

/**
 * De abstracte klasse als verzameling voor alle speelstukkken
 * 
 * @author Katleen
 */
public abstract class Stukken {
    public EnumSpeler speler;
    public EnumTypes type;
    public static Beweging beweging;
    int i;
    int j;

    
    /**
     * Constructor voor een stuk
     * 
     * @param speler Van welke speler is het stuk
     * @param type Wat voor type speelstuk is het
     */
    public Stukken(EnumSpeler speler, EnumTypes type) {
        this.speler = speler;
        this.type = type;
    }
    

    /**
     * Krijg het type speler
     * 
     * @return De speler
     */
    public EnumSpeler getSpeler() {
        return speler;
    }

    
    /**
     * Krijg het type speelstuk
     * 
     * @return Het type
     */
    public EnumTypes getType() {
        return type;
    }
    
    
    /**
     * Krijg de coordinaat van het speelstuk
     * 
     * @param x x-coordinaat
     * @param y y-coordinaat
     */
    public void getCoordinaat(int x, int y){
        this.i = x;
        this.j = y;
    }
    
    
    /**
     * Mag ik het speelstuk naar een bepaald vakje verplaatsen
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindy De Nieuwe y-coordinaat
     * @return Geldige verplaatsing
     */
    public abstract boolean juisteMove(int beginx, int beginy, int eindx, int eindy);
    
    
    /**
     * Om te kijken of een stuk verplaats wordt
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindy De Nieuwe y-coordinaat
     * @return Is het stuk verplaatst?
     */
    public boolean geldigeZet(int beginx, int beginy, int eindx, int eindy){
        boolean geldig = true;
        if (beginx == eindx && beginy == eindy){
            System.out.println("Je hebt niet verplaatst");
            geldig = false;     
        }
        return geldig;
    }
    
    /**
     * Ligt de gekozen eindplaats van een stuk op het vak
     * 
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindy  De Nieuwe y-coordinaat
     * @return Het gekozen vak ligt op het bord
     */
    public boolean binnenBord(int beginx, int beginy, int eindx, int eindy){
        boolean inBord = true;
        if(eindx > 8 && eindx < -1 && eindy >8 && eindy < -1){
            System.out.println("Je bent buiten het bord");
            inBord = false;
        }
        return inBord;
    }
}