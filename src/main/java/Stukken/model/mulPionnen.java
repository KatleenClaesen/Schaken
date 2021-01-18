/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stukken.model;

import java.util.ArrayList;

/**
 *
 * @author Mathias
 
public class mulPionnen {
    private ArrayList<Pionnen> Pionnen;
    
    private Pionnen huidigePion;
    
    public mulPionnen(){
        huidigePion = new Pionnen(8);
        for(int i=0; i< 8; i++ ){
            int j = 0;
           huidigePion[i] = new Pionnen (i); 
        }
        Pionnen.add(huidigePion);
    }
    
    private ArrayList<Pionnen>
}
*/