/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stukken.model;

import Speler.model.EnumSpeler;

/**
 *het model van de toren 
 * @author Mathias
 */
public class Toren extends Stukken{
        
    /**
     * Constructor voor een Toren
     * 
     * @param enumSpeler Het type speler
     * @param enumTypes Het type speelstuk
     */
    public Toren(EnumSpeler speler, EnumTypes type) {
        super(speler, type); 
    }
    
}


