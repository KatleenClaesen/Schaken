/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.katle.schaken;

import Bord.model.Bord;
import Stukken.model.Koning;
import Stukken.model.Loper;
import Stukken.model.Paard;
import Stukken.model.Pion;
import Stukken.model.Queen;
import Stukken.model.Schaken;
import Stukken.model.Stukken;
import Stukken.model.Toren;

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import view.Stukken.PionnenView;
import view.Stukken.BordView;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.util.Pair;
import view.Stukken.KoningView;
import view.Stukken.LoperView;
import view.Stukken.StukView;
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
    private Button menu;

   
    /**
     * 
     */
    private Bord model;
    private BordView view;
    
    /**
     * getting the view and model of the pieces
     */
    public int mouseX;
    public int mouseY;
    
    private Pion modelPion;
    private Pion modelPion2;
    private PionnenView viewPion;
    private PionnenView viewPion2;
    
    private Toren modelToren;
    private TorenView viewToren;
    
    private Koning modelKoning;
    private KoningView viewKoning;
    
    private Queen modelQueen;
    private QueenView viewQueen;
    
    private Loper modelLoper;
    private LoperView viewLoper;
    
    private Paard modelPaard;
    private StukView viewPaard;
    
    
    
    /**
     * the initialization of the fxml
     */

    @FXML
    void initialize() {
        model = new Bord();
        //modelPion = new Pion(1);
        //modelPion2 = new Pion(2);
       //modelToren = new Toren();
        //modelKoning = new Koning();
        //modelQueen = new Queen();
        //modelLoper = new Loper();
        //modelPaard = new Paard();
        
         
        view = new BordView(model);
        //viewPion = new PionnenView(modelPion);
        //viewToren = new TorenView(modelToren);
        //viewKoning = new KoningView(modelKoning);
        //viewQueen = new QueenView(modelQueen);
        //viewLoper = new LoperView(modelLoper);
        //viewPaard = new PaardView(modelPaard);
        //viewPion2 = new PionnenView(modelPion2);
        
        
        bord.getChildren().addAll(view);
        /* als er op het spelbord w geklikt gaat er gezien worden waar er geklikt w*/
        
        //Momenteel wordt enkel eindCo weergegeven
        bord.setOnMousePressed(this::startCo);
        bord.setOnMousePressed(this::eindCo);
        
        
        //update();
        
        menu.setFocusTraversable(false);
        menu.setOnAction(this::reset);
        

    }
    private void reset(ActionEvent e){
        //Wat is het nut hiervan?
    }
    
    
    /**
     * Welk vakje wil ik gebruiken? (Start)
     * (weergegeven in coordinaten van de array)
     * 
     * Gebaseerd op RushHour
     * 
     * @param e mousevent
     * @return Het i,j vakje van de array
     */
    public Stukken startCo(MouseEvent e){
        double muisX = e.getX();
        double muisY = e.getY();
        int arrayI = (int) view.getI(muisX);
        int arrayJ = (int) view.getJ(muisY);
        //Geeft de i,j coordinaat van de array weer
        System.out.println("Een" + arrayI + "," + arrayJ);
        return model.getInhoud(arrayI, arrayJ);
    }
    
    /**
     * Naar welk vakje wil ik verplaatsen? (Einde)
     * (weergegeven in coordinaten van de array)
     * 
     * @param e mousevent
     * @return Het i,j vakje van de array
     */
    public Stukken eindCo(MouseEvent e){
        double muisX = e.getX();
        double muisY = e.getY();
        int arrayII = (int) view.getI(muisX);
        int arrayJJ = (int) view.getJ(muisY);
        //Geeft de i,j coordinaat van de array weer
        System.out.println("Twee" + arrayII + "," + arrayJJ);
        return model.getInhoud(arrayII, arrayJJ);
    }
    
    
}
    
    
/*    public void test2(MouseEvent e){
        System.out.println(e.getX()+e.getY());
    }
*/        /*if(viewToren.isOpToren(e.getX(), e.getY())){
            viewToren.setOnMouseReleased(this::move);
        }
        //else if(viewPion.isOpPion(e.getX(), e.getY())){
            //viewPion.setOnMouseReleased(this::movePion);
        //}
        else if(viewKoning.isOpKoning(e.getX(), e.getY())){
            viewKoning.setOnMouseReleased(this::moveKoning);
        }
        else if(viewQueen.isOpQueen(e.getX(), e.getY())){
            viewQueen.setOnMouseReleased(this::moveQueen);
        }
        else if(viewLoper.isOpLoper(e.getX(), e.getY())){
            viewLoper.setOnMouseReleased(this::moveLoper);
        }
        //else if(viewPaard.isOpPaard(e.getX(),e.getY())){
            //viewPaard.setOnMouseReleased(this::movePaard);
        //}
  
    }
    /**
     * gaat de coordinaten van het speelstuk ophalen en doorgeven aan de view
     * @param e 
     */
    /*
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
    /*public void movePion(MouseEvent e){
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
    *//*
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
    /**move van de Queen*//*
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
    
    /*public void movePaard(MouseEvent e){
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
}/*/
        