/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stukken.model;

/**
 *
 * @author Mathias
 */
public class Koning {
    private int x;
    /** y-coordinaat van het mannetjes */
    private int y;
    
    public int temp_x;
    public int temp_y;
    
    

    /** constructor voor een wandelaar die in de oorsprong begint 
     */    
    public Koning() {
        this(400,700);
    }
    
    /**
     * constructor voor wandelaar op opgegeven positie
     * 
     * @param x x-coordinaat
     * @param y y-coordinaat
     */
    public Koning(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

    public void newX(){
        this.x = temp_x;
        
    }   
        
    public void newY(){
        this.y = temp_y;
    }

    
    public int getX() {
        return x;
    }

    /**
     * y-coordinaat van het mannetjes
     * @return the y
     */
    public int getY() {
        return y;
    }
    public void reset(){
        y= 700;
        x= 400;
    }
}
