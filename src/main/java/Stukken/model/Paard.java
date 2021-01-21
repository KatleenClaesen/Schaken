/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stukken.model;

import Speler.model.EnumSpeler;
import Stukken.model.EnumTypes;
import view.Stukken.StukView;

/**
 *
 * @author Mathias
 */
public class Paard extends Stukken{
    
    /**
     * Constructor voor een Paard
     * 
     * @param enumSpeler Het type speler
     * @param enumTypes Het type speelstuk
     */
    public Paard( EnumSpeler speler, EnumTypes type) {
        super(speler, type); 
        }

    
}
