/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Paard;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

/**
 *
 * @author Mathias
 */
public class PaardView extends Region{
    private AnchorPane paneel;
    private Paard modelPaard;
    

    public PaardView(Paard modelPaard){
        this.modelPaard = modelPaard;
        findImagePaard();
        updatePaard();
        
    }
    
    public void updatePaard(){
        getChildren().clear();
        
        paneel.setTranslateX(this.modelPaard.getX());
        paneel.setTranslateY(this.modelPaard.getY());
        
        getChildren().addAll(paneel);
    }
    public void findImagePaard(){
        
        paneel = new AnchorPane();
        
        Image paard = new Image("file:///D:/github/Schaken/afbeeldingen/Paard.png");
        ImageView imageView = new ImageView(paard);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(false);
        
        paneel.getChildren().add(imageView);
    }
     public boolean isOpPaard(double x,double y){
        if(x > modelPaard.getX() + 99 )
            return false;
        if(y > modelPaard.getY()+ 99)
            return false;
        return true;
     }
}

