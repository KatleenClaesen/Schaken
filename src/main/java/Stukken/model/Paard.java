
package Stukken.model;

import Bord.model.EnumSpeler;

/**
 * Model voor een Paard
 * 
 * @author Katleen
 */
public class Paard extends Stukken {

    /**
     * Constructor voor een Paard
     *
     * @param speler Het type speler
     * @param type  Het type speelstuk
     */
    public Paard(EnumSpeler speler, EnumTypes type) {
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
        
        if (beginx - 1 == eindx && beginy + 2 == eindy) { //2 naar rechts en 1 naar boven
            okezet = true;
        } 
        else if (beginx + 1 == eindx && beginy + 2 == eindy) { //2 naar rechts en 1 naar onder
            okezet = true;
        }
        else if (beginx - 1 == eindx && beginy - 2 == eindy) { //2 naar links en 1 naar boven
            okezet = true;
        }
        else if (beginx + 1 == eindx && beginy - 2 == eindy) { //2 naar links en 1 naar onder
            okezet = true;
        }
        else if (beginx - 2 == eindx && beginy + 1 == eindy) { //2 naar boven en 1 naar rechts
            okezet = true;
        }
        else if (beginx - 2 == eindx && beginy - 1 == eindy) { //2 naar boven en 1 naar links
            okezet = true;
        }
        else if (beginx + 2 == eindx && beginy +1 == eindy) { //2 naar onder en 1 naar rechts
            okezet = true;
        }
        else if(beginx + 2 == eindx && beginy - 1 == eindy) { //2 naar onder en 1 naar links
            okezet = true;
        }
        else{
        okezet = false;
        }
//    System.out.println(okezet);
    return okezet;
    }
}
