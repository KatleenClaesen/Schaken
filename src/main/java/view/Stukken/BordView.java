/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Bord.model.Bord;

import Stukken.model.Schaken;
import Stukken.model.Toren;
import Stukken.model.Koning;
import Stukken.model.Loper;
import Stukken.model.Paard;
import Stukken.model.Pion;
import Stukken.model.Queen;
import Stukken.model.Stukken;
import javafx.scene.Node;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
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
public class BordView extends Region{
    private Bord model;
    public static final int SIZE = 100;
    
    public BordView(Bord model){
        this.model = model;
        update();
    }
    
    public void update(){
        getChildren().clear();
        Rectangle Bordje = new Rectangle(0,0,800,800);
        Color c = new Color(0,0,0,0);
        Bordje.setFill(c);
        getChildren().add(Bordje);
        
        for(int i=0; i<8; i++){
            for(int j=0; j< 8; j++ ){
                Stukken stuk = model.getInhoud(i, j);
                Node view= ViewSpeelStukken.createNode(stuk);
                view.setTranslateX(i*100);
                view.setTranslateY(j*100);
                getChildren().add(view);
            }
            
        }
        
    }
    
    
}
    
    

