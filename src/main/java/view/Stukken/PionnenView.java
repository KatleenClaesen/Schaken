/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Pionnen;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;

/**
 *
 * @author Mathias
 */
public class PionnenView extends Region{
    private AnchorPane paneel;
    private Pionnen modelPion;
    private static final int RADIUS = 4;

    public PionnenView(Pionnen modelPion){
        this.modelPion = modelPion;
        createSmiley();
        updatePion();
        
    }
    
    public void updatePion(){
        getChildren().clear();
        
        paneel.setTranslateX(this.modelPion.getX());
        paneel.setTranslateY(this.modelPion.getY());
        
        getChildren().addAll(paneel);
    }
    public void createSmiley(){
        
        paneel = new AnchorPane();
        Circle hoofdje = new Circle(25,25,25); // center x, centery, radius, fill = null
        //80% rood, 0% groen, 0% blauw, 100% zichtbaar
        hoofdje.setStroke(new Color(0.8f,0,0,1)); //
        
        Line knipOog = new Line(10,10,15,10);
        Arc mond = new Arc(25,25,18,18,-30,-120); 
        Circle oogje = new Circle(35,10,5);
        oogje.setFill(new Color(0,0,0.8f,1));
        
        
        paneel.getChildren().addAll(hoofdje,knipOog,mond, oogje);
    }
     public boolean isOpPion(double x,double y){
        return Math.sqrt(Math.pow(modelPion.getX()+25-x,2) + Math.pow(modelPion.getY()+25 - y, 2)) <= RADIUS;
     }
     
}
