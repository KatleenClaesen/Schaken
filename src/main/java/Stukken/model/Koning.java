 
package Stukken.model;

import Speler.model.EnumSpeler;

/**
 * Model van een Koning
 * 
 * @author Katleen
 */
public class Koning extends Stukken {

    
    /**
     * Constructor voor een Koning
     *
     * @param speler Het type speler
     * @param type  Het type speelstuk
     */
    public Koning(EnumSpeler speler, EnumTypes type) {
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
        
        if (beginx == eindx && beginy +1 == eindy) { // Naar Rechts
            okezet = true;
        } 
        else if (beginx == eindx && beginy - 1 == eindy) { //Naar Links
            okezet = true;
        }
        else if (beginx - 1 == eindx && beginy == eindy) { //Naar Boven
            okezet = true;
        }
        else if (beginx + 1 == eindx && beginy == eindy) { //Naar Onder
            okezet = true;
        }
        else if (beginx - 1 == eindx && beginy +1 == eindy) { //Recht boven
            okezet = true;
        }
        else if (beginx + 1 == eindx && beginy - 1 == eindy) { //Links onder
            okezet = true;
        }
        else if (beginx - 1 == eindx && beginy - 1 == eindy) { //Links boven
            okezet = true;
        }
        else if (beginx + 1 == eindx && beginy +1 == eindy) { //Rechts onder
            okezet = true;
        }
        else{
        okezet = false;
        }
    System.out.println(okezet);
    return okezet;
    }    
}
