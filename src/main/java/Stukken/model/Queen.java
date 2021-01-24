
package Stukken.model;

import Speler.model.EnumSpeler;

/**
 * Model voor een Queen
 * 
 * @author Katleen
 */
public class Queen extends Stukken {

    /**
     * Constructor voor een Queen
     *
     * @param speler Het type speler
     * @param type  Het type speelstuk
     */
    public Queen(EnumSpeler speler, EnumTypes type) {
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
        
        if (beginy == eindy && eindx < 8 && eindx > -1){ //Horizontaal bewegen
            okezet = true;
        } 
        else if (beginx == eindx && eindy < 8 && eindy > -1){ //Verticaal bewegen
            okezet = true;
        }
        else if (Math.abs(beginx - eindx)== Math.abs(beginy - eindy)){
            okezet = true;
        }
        else{
        okezet = false;
        }
    System.out.println(okezet);
    return okezet;
    }    
}