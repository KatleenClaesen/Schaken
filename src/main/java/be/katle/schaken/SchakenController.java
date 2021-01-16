/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.katle.schaken;

import Stukken.model.Koning;
import Stukken.model.Loper;
import Stukken.model.Paard;
import Stukken.model.Pionnen;
import Stukken.model.Queen;
import Stukken.model.Schaken;
import Stukken.model.Toren;

import java.io.FileNotFoundException;
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
import view.Stukken.KoningView;
import view.Stukken.LoperView;
import view.Stukken.PaardView;
import view.Stukken.QueenView;
import view.Stukken.TorenView;


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
    private AnchorPane Pion;
    /**
     * 
     */
    private Schaken model;
    private SchakenView view;
    
    /**
     * getting the view and model of the pieses
     */
    public int mouseX;
    public int mouseY;
    
    private Pionnen modelPion;
    private PionnenView viewPion;
    
    private Toren modelToren;
    private TorenView viewToren;
    
    private Koning modelKoning;
    private KoningView viewKoning;
    
    private Queen modelQueen;
    private QueenView viewQueen;
    
    private Loper modelLoper;
    private LoperView viewLoper;
    
    private Paard modelPaard;
    private PaardView viewPaard;
    
    
    
    /**
     * the initialization of the fxml
     */

    @FXML
    void initialize() {
        model = new Schaken();
        modelPion = new Pionnen();
        modelToren = new Toren();
        modelKoning = new Koning();
        modelQueen = new Queen();
        modelLoper = new Loper();
        modelPaard = new Paard();
        
         
        view = new SchakenView(model);
        viewPion = new PionnenView(modelPion);
        viewToren = new TorenView(modelToren);
        viewKoning = new KoningView(modelKoning);
        viewQueen = new QueenView(modelQueen);
        viewLoper = new LoperView(modelLoper);
        viewPaard = new PaardView(modelPaard);
        
        
        
        bord.getChildren().addAll(view,viewPion,viewToren,viewKoning,viewQueen,viewLoper,viewPaard);
        bord.setOnMousePressed(this::test);
        //testPlane.getChildren().add(reset);
        
        
        update();
        
        reset.setFocusTraversable(false);
        reset.setOnAction(this::reset);
        

    }
    private void start(ActionEvent e){
       
        
      
        
    }
    /**
     * kijkt op welk speelstuk er geklikt is en gaat de coordinaten laten ophalen
     * @param e 
     */
    public void test(MouseEvent e){
        if(viewToren.isOpToren(e.getX(), e.getY())){
            viewToren.setOnMouseReleased(this::move);
        }
        else if(viewPion.isOpPion(e.getX(), e.getY())){
            viewPion.setOnMouseReleased(this::movePion);
        }
        else if(viewKoning.isOpKoning(e.getX(), e.getY())){
            viewKoning.setOnMouseReleased(this::moveKoning);
        }
        else if(viewQueen.isOpQueen(e.getX(), e.getY())){
            viewQueen.setOnMouseReleased(this::moveQueen);
        }
        else if(viewLoper.isOpLoper(e.getX(), e.getY())){
            viewLoper.setOnMouseReleased(this::moveLoper);
        }
        else if(viewPaard.isOpPaard(e.getX(),e.getY())){
            viewPaard.setOnMouseReleased(this::movePaard);
        }
  
    }
    /**
     * gaat de coordinaten van het speelstuk ophalen en doorgeven aan de view
     * @param e 
     */
    
    public void move(MouseEvent e){
        this.mouseX = (int) e.getX();
        this.mouseY = (int) e.getY();
        this.modelToren.temp_x = mouseX;
        this.modelToren.temp_y = mouseY;
        modelToren.newX();
        modelToren.newY();
        viewToren.update();
       
        System.out.println(mouseX+","+mouseY);
    }
    /**move voor de pion*/
    public void movePion(MouseEvent e){
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
    
    public void moveKoning(MouseEvent e){
        this.mouseX = (int) e.getX();
        this.mouseY = (int) e.getY();
        this.modelKoning.temp_x = mouseX;
        this.modelKoning.temp_y = mouseY;
        modelKoning.newX();
        modelKoning.newY();
        viewKoning.update();
       
        System.out.println(mouseX+","+mouseY);
    }
    /**move van de Queen*/
    public void moveQueen(MouseEvent e){
        this.mouseX = (int) e.getX();
        this.mouseY = (int) e.getY();
        this.modelQueen.temp_x = mouseX;
        this.modelQueen.temp_y = mouseY;
        modelQueen.newX();
        modelQueen.newY();
        viewQueen.updateQueen();
       
        System.out.println(mouseX+","+mouseY);
    }
    
    public void moveLoper(MouseEvent e){
        this.mouseX = (int) e.getX();
        this.mouseY = (int) e.getY();
        this.modelLoper.temp_x = mouseX;
        this.modelLoper.temp_y = mouseY;
        modelLoper.newX();
        modelLoper.newY();
        viewLoper.updateLoper();
       
        System.out.println(mouseX+","+mouseY);
    }
    
    public void movePaard(MouseEvent e){
        this.mouseX = (int) e.getX();
        this.mouseY = (int) e.getY();
        this.modelPaard.temp_x = mouseX;
        this.modelPaard.temp_y = mouseY;
        modelPaard.newX();
        modelPaard.newY();
        viewPaard.updatePaard();
       
        System.out.println(mouseX+","+mouseY);
    }
    /**
     * the update method for all views
     */
    private void update(){
        view.update();
        viewPion.updatePion();
        viewToren.update();
        viewKoning.update();
        viewQueen.updateQueen();
        viewLoper.updateLoper();
        viewPaard.updatePaard();
    }
    /**
     * the reset of all the pieces
     * 
     */
    private void reset(ActionEvent e){
        model.reset();
        modelPion.reset();
        modelToren.reset();
        modelKoning.reset();
        modelQueen.reset();
        modelLoper.reset();
        modelPaard.reset();
        update();
    }
   
}
