/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Speler.model.EnumSpeler;
import static Speler.model.EnumSpeler.WIT;
import static Speler.model.EnumSpeler.ZWART;
import static Stukken.model.EnumTypes.PAARD;
import Stukken.model.Paard;
import Stukken.model.Queen;
import Stukken.model.Stukken;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;

/**
 *
 * @author Mathias
 */
public class StukView extends Region{
    private AnchorPane paneel;
    private Stukken modelStuk;
    private EnumSpeler Speler;
    private final String foto;
    private int teller;
    

    public StukView(Stukken model,String image, EnumSpeler Kleur){
        this.modelStuk = model;
        this.foto = image;
        /* om de nodes op een afstand van 100 van de rand te laten verschijenen*/
        setLayoutX(100);
        setLayoutY(100);
        this.Speler = Kleur;
        //System.out.println(Speler);
 
        findImagePaard(foto, Speler);
        getChildren().add(paneel);
        //updatePaard();
        
    }
    
    /*public void updatePaard(){
        getChildren().clear();
        
        paneel.setTranslateX(this.modelPaard.getX());
        paneel.setTranslateY(this.modelPaard.getY());
        
        getChildren().addAll(paneel);
    }*/
    public AnchorPane findImagePaard(String foto, EnumSpeler Speler){
        
        paneel = new AnchorPane();
        
        
        
        if(Speler == ZWART){
            Image paard = new Image(foto);
            PixelReader reader = paard.getPixelReader();
            int w = (int)paard.getWidth();
            int h = (int)paard.getHeight();
            WritableImage wImage = new WritableImage(w, h);
            PixelWriter writer= wImage.getPixelWriter();
            for(int y = 0; y < h; y++){
                for(int x = 0; x< w; x++){
                    Color color = reader.getColor(x,y);
                    writer.setColor(x, y, color.invert());
                }
            }
            ImageView imageView = new ImageView();
            imageView.setImage(wImage);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);
            imageView.setPreserveRatio(false);
            paneel.getChildren().add(imageView);  
           
            System.out.println("zwart");
            return paneel;
                   
        }
        else if(Speler == WIT){
            Image paard = new Image(foto);
            ImageView imageView = new ImageView(paard);
            imageView.setFitHeight(100);
            imageView.setFitWidth(100);
            imageView.setPreserveRatio(false);
            paneel.getChildren().add(imageView);
            
            System.out.println("wit");
            return paneel;
            
        }
        
        System.out.println("probleem");
        return paneel;
        
    }
    
    
    /*
     public boolean isOpPaard(double x,double y){
        if(x > modelPaard.getX() + 99 )
            return false;
        if(y > modelPaard.getY()+ 99)
            return false;
        return true;
     }*/
    /*
    if (speler == zwart) pixels = image.getPixelReader().getPixels()
    for (Pixel p : pixels) p = 255 -p

    */
}

