package Bord.model;

import Stukken.model.Stukken;
import Stukken.model.Toren;
/**
 * Een vakje op het schaakbord, met eventueel een speelstuk op
 * 
 * @author Katleen Claesen
 */
public abstract class Vakje {
    private Coordinaat coordinaat;
    private Stukken speelstuk;

    /**
     * Maak een vakje met speelstuk
     * @param coordinaat Coordinaat van het vakje
     * @param speelstuk  Speelstuk op het vakje
     */
    public Vakje(Coordinaat coordinaat, Stukken speelstuk) {
        this.coordinaat = coordinaat;
        this.speelstuk = speelstuk;
    }

    /**
     * Maak een vakje zonder speelstuk
     * @param coordinaat Coordinaat van het vakje
     */
    public Vakje(Coordinaat coordinaat) {
        this.coordinaat = coordinaat;
        speelstuk = null;
    }
    

    /**
     * @return De coordinaat van het 
     */
    public Coordinaat getCoordinaat() {
        return coordinaat;
    }

    /**
     * @return Het speelstuk op het vakje
     */
    public Stukken getSpeelstuk() {
        return speelstuk;
    }

    /**
     * Zet een speelstuk op een vakje
     * 
     * @param speelstuk Het speelstuk
     */
    public void setSpeelstuk(Stukken speelstuk) {
        this.speelstuk = speelstuk;
    }

    
}
