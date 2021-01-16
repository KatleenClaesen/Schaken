/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Koning;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

/**
 *
 * @author Mathias
 */
public class KoningView extends Region{
    private Koning modelKoning;
    private AnchorPane paneel;
    private static final int RADIUS = 50;
   
    public KoningView(Koning model){
        this.modelKoning = model;
        Image();
        update();
        
        
    }
    /**
     * the update method for Toren
     */
    public void update(){
        getChildren().clear();
        
        setTranslateX(this.modelKoning.getX());
        setTranslateY(this.modelKoning.getY());
        
        getChildren().add(paneel);
    }
    
    /*getting the image Toren and adjusting the size to the right size for the project
    
    */
    private void Image(){
        paneel = new AnchorPane();
        
        
        
        Image koning = new Image("file:///D:/github/Schaken/afbeeldingen/Koning.png");
        ImageView imageView = new ImageView(koning);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(false);
        paneel.getChildren().add(imageView);
    }
    public boolean isOpKoning(double x,double y){
       if(x > modelKoning.getX() + 99 )
            return false;
        if(y > modelKoning.getY()+ 99)
            return false;
        return true;
     }        
    
}
