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
public class Loper {
    /** x-coordinaat van de loper */
    private int x;
    /** y-coordinaat van de loper*/
    private int y;
    /**
     * de coordinaten die worden doorgegeven bij mousemovement
     */
    public int temp_x;
    public int temp_y;
    
    

    /**startpositie van de loper
     */    
    public Loper() {
        this(200,700);
    }
    
    /**
     * 
     * 
     * @param x x-coordinaat
     * @param y y-coordinaat
     */
    public Loper(int x, int y) {
        this.x = x;
        this.y = y;
        
    }
    /**
     * the movement of the loper(tijdelijke coordinaten van de muis omzetten in de uiteindelijke coordinaten(hier de beweging toepassen)
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
    
    /** de reset van de loper*/
    public void reset(){
        y= 700;
        x= 200;
    }
        
        
    
}
