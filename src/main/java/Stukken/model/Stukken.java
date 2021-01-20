/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stukken.model;

import Speler.model.EnumSpeler;

/**
 *
 * @author katle
 */
public abstract class Stukken {
    public EnumSpeler speler;
    public EnumTypes type;
    int x;
    int y;

    public Stukken(EnumSpeler speler, EnumTypes type) {
        //this.x = i;
        //this.y = j;
        this.speler = speler;
        this.type = type;
    }
    
    
    
    

    /**
     * Krijg het type speler
     * @return De speler
     */
    public EnumSpeler getSpeler() {
        return speler;
    }

    /**
     * Krijg het type speelstuk
     * @return Het type
     */
    public EnumTypes getType() {
        return type;
    }
    
    
}
