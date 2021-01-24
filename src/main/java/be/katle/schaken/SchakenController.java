
package be.katle.schaken;

import Bord.model.Bord;
import Bord.model.EnumSpeler;
import Stukken.model.Stukken;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import view.Stukken.BordView;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


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
    private Button muziek;

    @FXML
    private Button menu;

    @FXML
    private Label speler;

    /**
     * 
     */
    private Bord model;
    private BordView view;
    
    private Stukken stuk = null;
    private int beginx, beginy, eindx, eindy;
    MediaPlayer mediaplayer;
    
    /**
     * the initialization of the fxml
     * 
     * @author Mathias en Katleen
     */

    @FXML
    void initialize() {
        model = new Bord();
        view = new BordView(model);

        bord.getChildren().addAll(view);
        bord.setOnMousePressed(this::startCo);
        bord.setOnMouseReleased(this::eindCo);
        speler.setText("Wit is aan zet");
        
        menu.setOnAction(this::Menu);
        
        muziek.setOnAction(this::Muziek);
        

    }
    private void Menu(ActionEvent e){
//        System.out.println("Menu");
        try{
            App.setRoot("MenuFXML");}
        catch (IOException ex) {
                ex.printStackTrace();
                }
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
        beginx = (int) model.getI(e.getX());
        beginy = (int) model.getJ(e.getY());
        model.getStukOp(eindx, eindy);
/*      for (int i = 0; i < model.schaakbord.length; i++) {
          Stukken[] stukkens = model.schaakbord[i];
        }
*/
        //Geeft de i,j coordinaat van de array weer
//        System.out.println("Start" + ":" + "" + beginx + "," + beginy);
        stuk = model.getInhoud(beginx, beginy);
        model.neemStukOp(beginx, beginy);
        return model.getInhoud(beginx, beginy);
    }
    
    /**
     * Naar welk vakje wil ik verplaatsen? (Einde)
     * (weergegeven in coordinaten van de array)
     * 
     * @param e mousevent
     */
    public void eindCo(MouseEvent e){
        //System.out.println(stuk);
        eindx = (int) model.getI(e.getX());
        eindy = (int) model.getJ(e.getY());
        model.getStukOp(eindx, eindy);
        
        //Geeft de i,j coordinaat van de array weer
//      System.out.println("Einde" + ":" + "" + eindx + "," + eindy);
        model.getInhoud(eindx,eindy);

        // Bij het effectief verplaatsen van het stuk werd geholpen door de neef van Katleen
        if (stuk.juisteMove(beginx, beginy, eindx, eindy) == true
               && stuk.geldigeZet(beginx, beginy, eindx, eindy) == true
               && stuk.binnenBord(beginx, beginy, eindx, eindy) == true) {
            model.zetneer(stuk, eindx, eindy);
            if (stuk.getSpeler() == EnumSpeler.ZWART){
            speler.setText("Wit is aan zet");
            }
            if (stuk.getSpeler() == EnumSpeler.WIT){
            speler.setText("Zwart is aan zet");
            }
            view.visual();
        } 
        else { 
            model.zetneer(stuk, beginx, beginy); //Zet op originele plaats
        }  
    }
    
    
    public void Muziek(ActionEvent event){
        
        ClassLoader classLoader = getClass().getClassLoader();
        URL test = classLoader.getResource("Muziek.mp3");
        Media media = new Media(test.toString());
        mediaplayer = new MediaPlayer(media);
        mediaplayer.setAutoPlay(true);  
    }
}