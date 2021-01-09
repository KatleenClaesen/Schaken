/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.katle.schaken;

import Stukken.model.Pionnen;
import Stukken.model.Schaken;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import view.Stukken.PionnenView;
import view.Stukken.SchakenView;
import javafx.event.ActionEvent;
import javafx.util.Pair;


public class SchakenController {
/**
 * the loading of objects form FXML
 */
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane bord;

    @FXML
    private AnchorPane testPlane;

    @FXML
    private Button reset;

    @FXML
    private Button start;

    @FXML
    private AnchorPane Pion;
    /**
     * 
     */
    private Schaken model;
    private SchakenView view;
    
    /**
     * 
     */
    public int mouseX;
    public int mouseY;
    
    private Pionnen modelPion;
    private PionnenView viewPion;
    
    
    
    

    @FXML
    void initialize() {
        model = new Schaken();
        modelPion = new Pionnen();
         
        view = new SchakenView(model);
        viewPion = new PionnenView(modelPion);
        
        
        bord.getChildren().addAll(view,viewPion);
        bord.setOnMousePressed(this::test);
        testPlane.getChildren().add(reset);
        reset.setOnAction(this::reset);
        
        update();
        start.setOnAction(this::reset);
        reset.setFocusTraversable(false);
        
        

    }
    private void start(ActionEvent e){
       
        
      
        
    }
    public void test(MouseEvent e){
        if(view.isOpSchaken(e.getX(), e.getY())){
            view.setOnMouseReleased(this::move);
        }
        else if(viewPion.isOpPion(e.getX(), e.getY())){
            viewPion.setOnMouseReleased(this::mover);
        }
    }
    
    public void move(MouseEvent e){
        this.mouseX = (int) e.getX();
        this.mouseY = (int) e.getY();
        this.model.temp_x = mouseX;
        this.model.temp_y = mouseY;
        model.newX();
        model.newY();
        view.update();
       
        System.out.println(mouseX+","+mouseY);
    }
    
    public void mover(MouseEvent e){
        this.mouseX = (int) e.getX();
        this.mouseY = (int) e.getY();
        this.modelPion.temp_x = mouseX;
        this.modelPion.temp_y = mouseY;
        Pair<Integer,Integer> p = new Pair(mouseX,mouseY);
        p.getKey();
        modelPion.newX();
        modelPion.newY();
        viewPion.updatePion();
       
        System.out.println(mouseX+","+mouseY);
    }
    
    private void update(){
        view.update();
        viewPion.updatePion();
        
    }
    
    private void reset(ActionEvent e){
        model.reset();
        modelPion.reset();
        update();
    }
    /**private void test2(){
        Pair<int,int> p = new Pair(mouseX,mouseY)
                1 getKey
                        2 getValue
    }
    */
}
