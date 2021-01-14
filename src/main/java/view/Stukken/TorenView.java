/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Toren;
import java.io.File;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;



/**
 *
 * @author Mathias
 */
public class TorenView extends Region{
    private Toren modelToren;
    private AnchorPane paneel;
    
   
    public TorenView(Toren model){
        this.modelToren = model;
        Image();
        update();
        
        
    }
    
    public void update(){
        getChildren().clear();
        
        setTranslateX(this.modelToren.getX());
        setTranslateY(this.modelToren.getY());
        
        getChildren().add(paneel);
    }
    
    private void Image(){
        paneel = new AnchorPane();
        
        
        
        Image toren = new Image("file:///C:/Users/Stijn/Schaken/afbeeldingen/Toren.jpg");
        ImageView imageView = new ImageView(toren);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(false);
        paneel.getChildren().add(imageView);
    }
            
}