/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Schaken;
import Stukken.model.Toren;
import Stukken.model.Koning;
import Stukken.model.Loper;
import Stukken.model.Paard;
import Stukken.model.Pionnen;
import Stukken.model.Queen;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

/**
 *
 * @author vanca
 */
public class SchakenView extends Region{
    private Schaken model;
    private AnchorPane paneel;
    private static final int RADIUS = 10;

    public SchakenView(Schaken model) {
        this.model = model;
        createSmiley();
        update();
    }
    
    public void update(){
        
        paneel.setTranslateX(this.model.getX());
        paneel.setTranslateY(this.model.getY());
        
    }
    
    public void createSmiley(){
        
        paneel = new AnchorPane();
        KoningView kv = new KoningView(new Koning());
        PionnenView pv = new PionnenView(new Pionnen());
        TorenView tv = new TorenView(new Toren());
        QueenView qv = new QueenView(new Queen());
        LoperView lv = new LoperView(new Loper());
        PaardView pav = new PaardView(new Paard());
        
        
        paneel.getChildren().addAll(tv,kv,pv,qv,lv,pav);
        
    
    }
}
    
    

