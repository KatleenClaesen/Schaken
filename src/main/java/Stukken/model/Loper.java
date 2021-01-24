
package Stukken.model;

import Bord.model.EnumSpeler;

/**
 * Model voor een Loper
 * 
 * @author Katleen
 */
public class Loper extends Stukken {

    /**
     * Constructor voor een Loper
     *
     * @param speler Het type speler
     * @param type  Het type speelstuk
     */
    public Loper(EnumSpeler speler, EnumTypes type) {
        super(speler, type);
    }

    
    /**
     * Maken we een geldige beweging?
     *
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindy De Nieuwe y-coordinaat
     * 
     * Zelfgeschreven code gaf ongeldige plaatsen
     * Uiteindelijke code afkomstig van https://stackoverflow.com/questions/4288729/implementing-rules-for-a-bishop-in-chess
     */
    @Override
    public boolean juisteMove(int beginx, int beginy, int eindx, int eindy) {
        boolean okezet = false;
        
        if (Math.abs(beginx - eindx)== Math.abs(beginy - eindy)){
            okezet = true;
        }
        else{
        okezet = false;
        }
//    System.out.println(okezet);
    return okezet;
    }   
}