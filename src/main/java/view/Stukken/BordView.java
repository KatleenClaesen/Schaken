
package view.Stukken;

import Bord.model.Bord;

import Stukken.model.Stukken;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


/**
 * De view van het bord
 * 
 * @author Mathias
 */
public class BordView extends Region{
    private Bord model;
    public static final int SIZE = 100;

    
    public BordView(Bord model){
        this.model = model;
        visual();
    }
    
    /**
     * Maak bord visueel aan en zet op elke plaats (g)een stuk
     */
    public void visual(){
        getChildren().clear();
        Rectangle Bordje = new Rectangle(0,0,8*SIZE,8*SIZE);
        Color c = new Color(0,0,0,0);
        Bordje.setFill(c);
        getChildren().add(Bordje);
        
        for(int i=0; i<8; i++){
            for(int j=0; j< 8; j++ ){
                Stukken stuk = model.getInhoud(i,j);
                Node view = ViewSpeelStukken.createNode(stuk);
                view.setTranslateX(i*SIZE);
                view.setTranslateY(j*SIZE);
                getChildren().add(view);
            }
        }
    }
}