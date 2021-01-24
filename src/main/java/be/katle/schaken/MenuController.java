
package be.katle.schaken;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.MediaPlayer;



public class MenuController{
    MediaPlayer mediaplayer;

    @FXML
    private Button start;
    
    @FXML
    private AnchorPane background;
    
    @FXML
    private Label tekst;
    
    @FXML
    void initialize(){
        start.setFocusTraversable(true);
        
        start.setOnAction(this::handle); 
            Image afbeelding = new Image("background.png");
            ImageView imageView = new ImageView(afbeelding);
        background.getChildren().add(imageView);   
    }
    
    
    public void handle(ActionEvent event) {
//        System.out.println("test");
        try{
             App.setRoot("schakenFXML");}
        catch (IOException e) {
                e.printStackTrace();
                }
    }
}