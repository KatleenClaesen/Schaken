package Stukken.model;

import Bord.model.EnumSpeler;

/**
 * Model van een Toren
 *
 * @author Katleen
 */
public class Toren extends Stukken {

    /**
     * Constructor voor een Toren
     *
     * @param speler Het type speler
     * @param type   Het type speelstuk
     */
    public Toren(EnumSpeler speler, EnumTypes type) {
        super(speler, type);
    }


    /**
     * Maken we een geldige beweging?
     *
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindy De Nieuwe y-coordinaat
     */
    @Override
    public boolean juisteMove(int beginx, int beginy, int eindx, int eindy) {
        boolean okezet = false;
        
        if (beginy == eindy && eindx < 8 && eindx > -1) { // Verticaal bewegen
//            System.out.println("Niet geldige torenbeweging");
            okezet = true;
        } 
        else if (beginx == eindx && eindy < 8 && eindy > -1){ //Horizontaal bewegen
            okezet = true;
        }
//    System.out.println(okezet);
    return okezet;     
    }
}        