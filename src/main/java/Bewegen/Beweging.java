
package Bewegen;

/**
 *
 * @author katle
 */
public class Beweging {
    private int x;
    private int y;
    private int c;

    /**
     * @return X coordinaat
     */
    public int getX() {
        return x;
    }

    /**
     * @return Y coordinaat
     */
    public int getY() {
        return y;
    }
    
    /**
     * Een speelstuk kan tussen de 1 en 7 vakjes verplaatsen
     * Dus creëren we een constante die dit weergeeft
     * 
     * @return Een constante c (tussen 1 en 7)
     */
    public int setC(){           
        while (this.c < 8 ){
            this.c = c++;
        }
        return c;
    }
    
    /**
     * We controleren of constante c tussen 1 en 7 ligt
     * 
     * @return true als c van 1 tot 7 gaat;
     */
    public boolean isCOneindig(){
        if (0 < setC() && setC() < 8){
            return true;
        }
        return false;
    }
    
    
    /**
     * "ONEINDIGE" RECHTE VERPLAATSINGEN //
     * Bruikbaar voor KONINGIN en TOREN
     */
    
    /**
     * Verplaats 1 tot 7 vakjes naar rechts
     */
    public void OneindigRechts(){
        this.x = x;
        this.y = y + c;
    }
    /**
     * Verplaats 1 tot 7 vakjes naar links
     */
    public void OneindigLinks(){
        this.x = x;
        this.y = y - c;
    }
    /**
     * Verplaats 1 tot 7 vakjes naar boven
     */
    public void OneindigBoven(){
        this.x = x - c;
        this.y = y;
    }
    /**
     * Verplaats 1 tot 7 vakjes naar onder
     */
    public void OneindigOnder(){
        this.x = x + c;
        this.y = y;
    }
      
    /**
     * "ONEINDIGE" SCHUINE VERPLAATSINGEN //
     * Bruikbaar voor KONINGIN en LOPER
     */
    
    /**
     * Verplaats 1 tot 7 vakjes naar rechts boven
     */
    public void OneindigRechtsBoven(){
        this.x = x - c;
        this.y = y + c;
    }
    /**
     * Verplaats 1 tot 7 vakjes naar links onder
     */
    public void OneindigLinksOnder(){
        this.x = x + c;
        this.y = y - c;
    }
    /**
     * Verplaats 1 tot 7 vakjes naar links boven
     */
    public void OneindigLinksBoven(){
        this.x = x - c;
        this.y = y - c;
    }
    /**
     * Verplaats 1 tot 7 vakjes naar rechts onder
     */
    public void OneindigRechtsOnder(){
        this.x = x + c;
        this.y = y + c;
    }
    
    /**
     * EINDIGE RECHTE VERPLAATSINGEN //
     * Bruikbaar voor KONING en PION
    */
    
    /**
     * Verplaats 1 vakje naar rechts
     */
    public void Rechts(){
        this.x = x;
        this.y = y + 1;
    }
    /**
     * Verplaats 1 vakje naar links
     */
    public void Links(){
        this.x = x;
        this.y = y - 1;
    }
    /**
     * Verplaats 1 vakje naar boven
     */
    public void Boven(){
        this.x = x - 1;
        this.y = y;
    }
    /**
     * Verplaats 1 vakje naar onder
     */
    public void Onder(){
        this.x = x + 1;
        this.y = y;
    }
    
    
    /**
     * EINDIGE SCHUINE VERPLAATSINGEN       //
     * Bruikbaar voor KONING en PAKKEN PION
     */
    
    /**
     * Verplaats 1 vakje naar rechts boven
     */
    public void RechtsBoven(){
        this.x = x - 1;
        this.y = y + 1;
    }
    /**
     * Verplaats 1 vakje naar links onder
     */
    public void LinksOnder(){
        this.x = x + 1;
        this.y = y - 1;
    }
    /**
     * Verplaats 1 vakje naar links boven
     */
    public void LinksBoven(){
        this.x = x - 1;
        this.y = y - 1;
    }
    /**
     * Verplaats 1 vakje naar rechts onder
     */
    public void RechtsOnder(){
        this.x = x + 1;
        this.y = y + 1;
    }
    
    
    //UITZONDERING PION //
    /**
     * Verplaats witte pion 2 vakje
     */
    public void Wit2(){
        this.x = x - 2;
        this.y = y;
    }
    /**
     * Verplaats zwarte pion 2 vakje
     */
    public void Zwart2(){
        this.x = x + 2;
        this.y = y;
    }
    
    //BEWEGINGEN PAARD //
    /**
     * Verplaats 2 naar rechts en 1 naar boven
     */
    public void RechtsUp(){
        this.x = x - 1;
        this.y = y + 2;
    }
    /**
     * Verplaats 2 naar rechts en 1 naar onder
     */
    public void RechtsDown(){
        this.x = x + 1;
        this.y = y + 2;
    }
    /**
     * Verplaats 2 naar links en 1 naar boven
     */
    public void LinksUp(){
        this.x = x - 1;
        this.y = y - 2;
    }
    /**
     * Verplaats 2 naar links en 1 naar onder
     */
    public void LinksDown(){
        this.x = x + 1;
        this.y = y - 2;
    }
    /**
     * Verplaats 2 naar boven en 1 naar rechts
     */
    public void BovenRight(){
        this.x = x - 2;
        this.y = y + 1;
    }
    /**
     * Verplaats 2 naar boven en 1 naar links
     */
    public void BovenLeft(){
        this.x = x - 2;
        this.y = y - 1;
    }
    /**
     * Verplaats 2 naar onder en 1 naar rechts
     */
    public void OnderRight(){
        this.x = x + 2;
        this.y = y + 1;
    }
    /**
     * Verplaats 2 naar onder en 1 naar links
     */
    public void OnderLeft(){
        this.x = x + 2;
        this.y = y - 1;
    }
}