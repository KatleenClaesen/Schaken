/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Queen;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

/**
 *
 * @author Mathias
 */
public class QueenView extends Region{
    private AnchorPane paneel;
    private Queen modelQueen;
    

    public QueenView(Queen modelQueen){
        this.modelQueen = modelQueen;
        findImageQueen();
        updateQueen();
        
    }
    
    public void updateQueen(){
        getChildren().clear();
        
        paneel.setTranslateX(this.modelQueen.getX());
        paneel.setTranslateY(this.modelQueen.getY());
        
        getChildren().addAll(paneel);
    }
    public void findImageQueen(){
        
        paneel = new AnchorPane();
        
        Image koning = new Image("file:///D:/github/Schaken/afbeeldingen/Queen.png");
        ImageView imageView = new ImageView(koning);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(false);
        
        paneel.getChildren().add(imageView);
    }
     public boolean isOpQueen(double x,double y){
        if(x > modelQueen.getX() + 99 )
            return false;
        if(y > modelQueen.getY()+ 99)
            return false;
        return true;
     }
}

