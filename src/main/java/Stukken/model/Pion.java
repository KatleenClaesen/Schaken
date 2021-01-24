
package Stukken.model;

import Bord.model.EnumSpeler;


/**
 * Model voor een Pion
 * 
 * @author Katleen (+ onderaan Mathias)
 */

public class Pion extends Stukken {

    /**
     * Constructor voor een Pion
     *
     * @param speler Het type speler
     * @param type   Het type speelstuk
     */
    public Pion(EnumSpeler speler, EnumTypes type) {
        super(speler, type);
    }


    /**
     * Maken we een geldige beweging?
     *
     * @param beginx De Startcoordinaat x
     * @param beginy De Startcoordinaat y
     * @param eindx  De Nieuwe x-coordinaat
     * @param eindy De Nieuwe y-coordinaat
     */
    @Override
    public boolean juisteMove(int beginx, int beginy, int eindx, int eindy) {
        boolean okezet = false;
           
        //Voor de witte pionnen
        if (speler == EnumSpeler.WIT){
            if (beginy - 1 == eindy && beginx == eindx) { // 1 naar boven
                okezet = true;
            }
            else if (beginx + 1 == eindx && beginy - 1 == eindy) { //Rechts boven pakken
                okezet = true;
            }
            else if (beginx - 1 == eindx && beginy - 1 == eindy) { //Links boven pakken
                okezet = true;
            }
            //Voor de eerste zet van de witte pionnen
            else if (beginy == 6){
                if (beginy -2 == eindy && beginx == eindx) { //2 stappen zetten mag
                    okezet = true;
                }
                else {
                    okezet = false;
                }
            }
            else{
            okezet = false;
            }
        } 
          
        //Voor de zwarte pionnen    
        else {
            if (beginy + 1 == eindy && beginx == eindx) { // 1 naar Boven
                okezet = true;
            }
            else if (beginx - 1 == eindx && beginy + 1 == eindy) { //Links boven pakken
                okezet = true;
            }
            else if (beginx + 1 == eindx && beginy +1 == eindy) { //Rechts onder pakken
                okezet = true;
            }
            //Voor de eerste zet van de zwarte pionnen
            else if (beginy == 1){
                if (beginy + 2 == eindy && beginx == eindx) { //2 stappen zetten mag JUIST
                    okezet = true;
                }
                else {
                    okezet = false;
                }
            }    
        }
//    System.out.println(okezet);
    return okezet;
    }
}        
    
  
    
    
/////////////////////////////////////////////////
// Toegepaste versie van klasse Schaken        //
// Wordt in het eindproduct niet meer gebruikt //
// Gemaakt door MATHIAS                        //
/////////////////////////////////////////////////
    
    
//private int x;
/**
 * y-coordinaat van het mannetjes  constructor voor een wandelaar die in de oorsprong begint
 * public Pionnen(int i, int j) {
 * <p>
 * this.x = startX;
 * this.y = startY;
 * <p>
 * <p>
 * }
 * Pionnen(int i) {
 * this.x= i *100;
 * this.y= 600;
 * }
 * <p>
 * /**
 * constructor voor wandelaar op opgegeven positie
 *
 * @param x x-coordinaat
 * @param y y-coordinaat
 * public Pionnen(int x, int y) {
 * this.x = x;
 * this.y = y;
 * <p>
 * }
 */
//private int y;

//public int temp_x;
//public int temp_y;

//private int startX;
//private int startY;
//private int i;

/** constructor voor een wandelaar die in de oorsprong begint
 */
    
    /*public Pion(int i){
        startX= 0;
        startY= 600;
        //x= startX;
        //y= startY;
        this.x= i *100;
        this.y= 600;
        
    }
    */
/**public Pionnen(int i, int j) {

 this.x = startX;
 this.y = startY;


 }
 */
/**Pionnen(int i) {
 this.x= i *100;
 this.y= 600;
 }

 /**
 * constructor voor wandelaar op opgegeven positie
 *
 * @param x x-coordinaat
 * @param y y-coordinaat
 */
/**public Pionnen(int x, int y) {
 this.x = x;
 this.y = y;

 }
 */
    /*
    public void newX(){
        if(temp_x>0 && temp_x<100){
            this.x = 25;
        }
        else if(temp_x>100 && temp_x<200){
            this.x = 125;
        }
        else if(temp_x>200 && temp_x<300){
            this.x = 225;
        }
        else if(temp_x>300 && temp_x<400){
            this.x = 325;
        }
        else if(temp_x>400 && temp_x<500){
            this.x = 425;        
        }
        else if(temp_x>500 && temp_x<600){
            this.x = 525;
        }
        else if(temp_x>600 && temp_x<700){
            this.x = 625;
        }
        else if(temp_x>700 && temp_x<800){
            this.x = 725;
        }
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
     *//*
    public int getY() {
        return y;
    }
    public void reset(){
        y= 600;
        x= 0;
    }
      */
    