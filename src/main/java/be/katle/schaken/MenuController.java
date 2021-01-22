/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.katle.schaken;

import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MenuController extends App{

    @FXML
    private ToggleButton Muziek;

    @FXML
    private Button start;
    
    @FXML
    private Button test;
    
    @FXML
    void Initialize(){
        start.setFocusTraversable(true);
        
        test.setOnAction(this::handle); 
            
        //});
               // }
    }
    public void handle(ActionEvent event) {
        System.out.println("test");
        try{
    
        App.setRoot("schakenFXML.fxml");}
        catch (IOException e) {
                e.printStackTrace();
                }
    }}
            /*Parent root;
            try {
                //root = FXMLLoader.load(getClass().getClassLoader().getResource("schakenFXML.fxml"));
                Stage stage = new Stage();
                
                stage.setScene(new Scene(root, 1000, 900));
                stage.show();
                // Hide this current window (if this is what you want)
                //((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            }}*/
   
            
            
    
        
    

    

