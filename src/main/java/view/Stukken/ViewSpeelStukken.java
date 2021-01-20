/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;


import Bord.model.Vakken;
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

/**
 *
 * @author Mathias
 */




class ViewSpeelStukken extends Region{
    
    private static final String Paardje = "file:///D:/github/Schaken/afbeeldingen/Paard.png";
    private static final String Pionetje = "file:///D:/github/Schaken/afbeeldingen/Pion.png";
    private static final String King = "file:///D:/github/Schaken/afbeeldingen/Koning.png";
    private static final String Bohemian_Rhapsody = "file:///D:/github/Schaken/afbeeldingen/Queen.png";
    private static final String HardLoper = "file:///D:/github/Schaken/afbeeldingen/Loper.png";
    private static final String SiegeTower = "file:///D:/github/Schaken/afbeeldingen/Toren.png";
    
    public static Node createNode(Stukken stuk){
        if(stuk instanceof Paard){ 
            
            return new StukView((Paard)stuk ,Paardje, stuk.speler);
        }
        else if(stuk instanceof Pion){
            
            return new StukView((Pion)stuk ,Pionetje, stuk.speler);
        }
        else if(stuk instanceof Koning){
            
            return new StukView((Koning)stuk ,King, stuk.speler);
        }
        else if(stuk instanceof Queen){
            
            return new StukView((Queen)stuk ,Bohemian_Rhapsody, stuk.speler);
        }
        else if(stuk instanceof Loper){
            
            return new StukView((Loper)stuk ,HardLoper, stuk.speler);
        }
        else if(stuk instanceof Toren){
            
            return new StukView((Toren)stuk,SiegeTower, stuk.speler);
        }
        return new Circle(0,0,0);
       
    }
}
