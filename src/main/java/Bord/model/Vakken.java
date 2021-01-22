/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bord.model;
import javafx.scene.layout.Region;


/**
 *
 * @author Mathias
 */
public class Vakken extends Region{
    
    private int X;
    private int Y;
    private boolean thisPiece;

        
    /**
     * Constructor voor een vak op het bord
     * 
     * @param i vak i(x) van het schaakbord
     * @param j vak j(y) van het schaakbord
     */
    public Vakken(int i, int j){
        this.X = i*100;
        this.Y = j*100;
        this.thisPiece= true;
    }  

    /**
     * @return the X
     */
    public int getVakX() {
        return X;
    }

    /**
     * @return the Y
     */
    public int getVakY() {
        return Y;
    }
    
    
}
