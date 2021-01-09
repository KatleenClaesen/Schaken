/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Schaken.model.Schaken;
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
    private static final int RADIUS = 4;

    public SchakenView(Schaken model) {
        this.model = model;
        createSmiley();
        update();
    }
    
    public void update(){
        getChildren().clear();
        
        paneel.setTranslateX(this.model.getX());
        paneel.setTranslateY(this.model.getY());
        
        getChildren().addAll(paneel);
    }
    
    public void createSmiley(){
        
        paneel = new AnchorPane();
        Circle hoofdje = new Circle(25,25,25, null); // center x, centery, radius, fill = null
        //80% rood, 0% groen, 0% blauw, 100% zichtbaar
        hoofdje.setStroke(new Color(0.8f,0,0,1)); //
        
        Line knipOog = new Line(10,10,15,10);
        Arc mond = new Arc(25,25,18,18,-30,-120); 
        Circle oogje = new Circle(35,10,5);
        oogje.setFill(new Color(0,0,0.8f,1));
        
        paneel.getChildren().addAll(hoofdje,knipOog,mond, oogje);
    
    }
        
     public boolean isOpSchaken(double x,double y){
        return Math.sqrt(Math.pow(model.getX()+25-x,2) + Math.pow(model.getY()+25 - y, 2)) <= RADIUS;
     }
}
    
    

