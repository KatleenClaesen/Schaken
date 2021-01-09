package Bewegen;

/**
 *
 * @author katle
 */
public class CMove {
    private int c; //Een getal tussen coördinaat 100 en 700 om maximum 7 vakjes te verplaatsen
    
    /**
     * Een speelstuk kan tussen de 100 en 700 coördinaten verplaatsen
     * Dus creëren we een constante die dit weergeeft
     * 
     * @return Een constante c (tussen 100 en 700)
     */
    public int getC(){   
        this.c = 100;
        
        while (this.c < 799 ){
            this.c = this.c + 100;
        }
        return c;
    }
    
}