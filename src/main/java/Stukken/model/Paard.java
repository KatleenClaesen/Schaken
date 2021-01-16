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
public class Paard {
       /** x-coordinaat van het paard */
    private int x;
    /** y-coordinaat van het paard */
    private int y;
    /**
     * de coordinaten die worden doorgegeven bij mousemovement
     */
    public int temp_x;
    public int temp_y;
    
    

    /**startpositie van het paard*/
       
    public Paard() {
        this(100,700);
    }
    
    /**
     * 
     * 
     * @param x x-coordinaat
     * @param y y-coordinaat
     */
    public Paard(int x, int y) {
        this.x = x;
        this.y = y;
        
    }
    /**
     * the movement of the Paard(tijdelijke coordinaten van de muis omzetten in de uiteindelijke coordinaten(hier de beweging toepassen)
     */
    public void newX(){
        this.x = temp_x;
        
    }   
        
    public void newY(){
        this.y = temp_y;
    }

    /** voor het opvragen van de huidige coordinaten van het model(x)*/
    public int getX() {
        return x;
    }
    /** voor het opvragen van de huidige coordinaten van het model(y)*/
    public int getY() {
        return y;
    }
    
    /** de reset van het Paard*/
    public void reset(){
        y= 700;
        x= 100;
    }
   
}
