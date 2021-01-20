/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Pion;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
    private Pion modelPion;
    

    public PionnenView(Pion modelPion){
        this.modelPion = modelPion;
        findImagePion();
        setLayoutX(100);
        setLayoutY(100);
        //updatePion();
        getChildren().add(paneel);
    }
    
    /*public void updatePion(){
        getChildren().clear();
        
        paneel.setTranslateX(this.modelPion.getX());
        paneel.setTranslateY(this.modelPion.getY());
        
        getChildren().addAll(paneel);
    }*/
    public void findImagePion(){
        
        paneel = new AnchorPane();
        
        Image koning = new Image("file:///D:/github/Schaken/afbeeldingen/Pion.png");
        ImageView imageView = new ImageView(koning);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(false);
        
        paneel.getChildren().add(imageView);
    }
    /*public boolean isOpPion(double x,double y){
        if(x > modelPion.getX() + 99 )
            return false;
        if(y > modelPion.getY()+ 99)
            return false;
        return true;
     }
     */
}
