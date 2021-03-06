

///////////////////////////////////////////////////////////////////
// Eerdere vorm van movement                                     //
// Gemaakt tijdens vakantie toen array nog niet gekend was       //
// Dit werd gebaseerd op de FXML                                 //
// In klasse pionnen staat een toegepast voorbeeld in commentaar //
// Wordt in het eindproduct niet meer gebruikt                   //
// Gemaakt door MATHIAS                                          //
///////////////////////////////////////////////////////////////////

package Stukken.model;

/**
 *
 * @author Mathias
 */
public class Schaken {
       /** x-coordinaat van het mannetjes */
    private int x;
    /** y-coordinaat van het mannetjes */
    private int y;
    
    public int temp_x;
    public int temp_y;
    
    

    /** constructor voor een wandelaar die in de oorsprong begint 
     */    
    public Schaken() {
        this(600,700);
    }
    
    /**
     * constructor voor wandelaar op opgegeven positie
     * 
     * @param x x-coordinaat
     * @param y y-coordinaat
     */
    public Schaken(int x, int y) {
        this.x = x;
        this.y = y;
        
    }

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
     */
    public int getY() {
        return y;
    }
    public void reset(){
        y= 525;
        x= 725;
    }
        //schaakbord[this.i]
        
    
}

