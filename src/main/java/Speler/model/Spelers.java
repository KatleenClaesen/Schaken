package Speler.model;

import Speler.model.EnumSpeler;

/**
 * Spelers maken en oproepen
 * 
 * @author Katleen Claesen
 */
public class Spelers {
    private EnumSpeler speler;
    
    
    public void Speler(EnumSpeler speler){
        this.speler = speler;
    }

    /**
     * Roep speler op
     * 
     * @return De speler
     */
    public EnumSpeler getSpeler() {
        return speler;
    }
}

