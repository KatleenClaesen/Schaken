/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stukken.model;

import Speler.model.EnumSpeler;

/**
 *
 * @author Mathias
 */
public class Koning extends Stukken{
        
    /**
     * Constructor voor een Koning
     * 
     * @param enumSpeler Het type speler
     * @param enumTypes Het type speelstuk
     */
    public Koning(EnumSpeler speler, EnumTypes type) {
        super(speler, type); 
    }
    
    

}
