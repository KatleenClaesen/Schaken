/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Stukken;

import Bord.model.Vakje;
import Bord.model.Vakken;
import Stukken.model.Paard;
import Stukken.model.Stukken;
import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.scene.shape.Circle;

/**
 *
 * @author Mathias
 */
class ViewSpeelStukken extends Region{
    public static Node createNode(Stukken vak){
        if(vak instanceof Paard){ 
            Paard paard=(Paard)vak;
            return new PaardView(paard);
        }
        return new Circle(0,0,0);
       
    }
}
