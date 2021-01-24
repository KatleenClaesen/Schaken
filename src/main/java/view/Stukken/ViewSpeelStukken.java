/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;


import Stukken.model.Koning;
import Stukken.model.Loper;
import Stukken.model.Paard;
import Stukken.model.Pion;
import Stukken.model.Queen;
import Stukken.model.Stukken;
import Stukken.model.Toren;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;

/** de view en het model aan elkaar linken
 * inspiratie genomen van Diamond caves
 * @author Mathias
 */

class ViewSpeelStukken extends Region{
    
    private static final String marengo = "Paard.png";
    private static final String pionetje = "Pion.png";
    private static final String king = "Koning.png";
    private static final String bohemian_Rhapsody = "Queen.png";
    private static final String hardLoper = "Loper.png";
    private static final String siegeTower = "Toren.png";
    
    public static Node createNode(Stukken stuk){
        if(stuk instanceof Paard){ 
            
            return new StukView((Paard)stuk ,marengo, stuk.speler);
        }
        else if(stuk instanceof Pion){
            
            return new StukView((Pion)stuk ,pionetje, stuk.speler);
        }
        else if(stuk instanceof Koning){
            
            return new StukView((Koning)stuk ,king, stuk.speler);
        }
        else if(stuk instanceof Queen){
            
            return new StukView((Queen)stuk ,bohemian_Rhapsody, stuk.speler);
        }
        else if(stuk instanceof Loper){
            
            return new StukView((Loper)stuk ,hardLoper, stuk.speler);
        }
        else if(stuk instanceof Toren){
            
            return new StukView((Toren)stuk,siegeTower, stuk.speler);
        }
        return new Circle(0,0,0);
       
    }
}
