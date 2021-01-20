/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Stukken.model.Loper;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;

/**
 *
 * @author Mathias
 */
public class LoperView extends Region{/*
    private AnchorPane paneel;
    private Loper modelLoper;
    

    public LoperView(Loper modelLoper){
        this.modelLoper = modelLoper;
        findImageLoper();
        updateLoper();
        
    }
    
    public void updateLoper(){
        getChildren().clear();
        
        paneel.setTranslateX(this.modelLoper.getX());
        paneel.setTranslateY(this.modelLoper.getY());
        
        getChildren().addAll(paneel);
    }
    public void findImageLoper(){
        
        paneel = new AnchorPane();
        
        Image loper = new Image("file:///D:/github/Schaken/afbeeldingen/Loper.png");
        ImageView imageView = new ImageView(loper);
        imageView.setFitHeight(100);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(false);
        
        paneel.getChildren().add(imageView);
    }
     public boolean isOpLoper(double x,double y){
        if(x > modelLoper.getX() + 99 )
            return false;
        if(y > modelLoper.getY()+ 99)
            return false;
        return true;
     }*/
}
