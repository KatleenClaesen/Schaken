/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.katle.schaken;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.URL;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
//import javafx.print.attribute.standard.Media;



public class MenuController{
    private static final String Queen = "file:///../../../../Muziek.mp3";
    MediaPlayer mediaplayer;

    @FXML
    private Button start;
    
    @FXML
    private AnchorPane background;
    
    @FXML
    private Button muziek;
    
    @FXML
    void initialize(){
        start.setFocusTraversable(true);
        
        start.setOnAction(this::handle); 
        muziek.setOnAction(this::Muziek);
            Image afbeelding = new Image("file:///D:/github/Schaken/afbeeldingen/background.png");
            ImageView imageView = new ImageView(afbeelding);
        background.getChildren().add(imageView);
            
      
        
    }
    public void handle(ActionEvent event) {
        System.out.println("test");
        try{
    
            App.setRoot("schakenFXML");}
        catch (IOException e) {
                e.printStackTrace();
                }
    }/*
    private void background(){
        Image afbeelding = new Image(foto);
        ImageView background = new ImageView(afbeelding);
        background.getChildren().add(imageView);
    }*/
    /**gives error
     * Exception in thread "JavaFX Application Thread" java.lang.IllegalAccessError: class com.sun.media.jfxmediaimpl.platform.PlatformManager (in module javafx.media) cannot access class com.sun.javafx.PlatformUtil (in module javafx.base) because module javafx.base does not export com.sun.javafx to module javafx.media
     * 
     */
    
    public void Muziek(ActionEvent event){
        
        //ClassLoader classLoader = getClass().getClassLoader();
        //URL resource = classLoader.getResource("Muziek.mp3");
        Media media = new Media(Queen.toString());
        mediaplayer = new MediaPlayer(media);
        mediaplayer.setAutoPlay(true);  
        //mediaPlayer.play();
    }
}