
package view.Stukken;

import Speler.model.EnumSpeler;
import static Speler.model.EnumSpeler.WIT;
import static Speler.model.EnumSpeler.ZWART;
import Stukken.model.Stukken;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import static view.Stukken.BordView.SIZE;

/**
 * Een algemene view voor de stukken
 * @author Mathias
 */
public class StukView extends Region{
    
    private AnchorPane paneel;
    private Stukken modelStuk;
    private EnumSpeler Speler;
    private final String foto;
    

    public StukView(Stukken model,String image, EnumSpeler Kleur){
        this.modelStuk = model;
        this.foto = image;
        /*om de nodes op een afstand van 100 van de rand te laten verschijenen */
        setLayoutX(SIZE);
        setLayoutY(SIZE);
        this.Speler = Kleur;
        findImage(foto, Speler);
        getChildren().add(paneel);
    }

    /**
     * Het vinden van een afbeelding bij het juiste speelstuk
     * 
     * @param foto afbeelding van het stuk
     * @param Speler Speler die bij het stuk hoort
     * @return paneel met foto op
     */
    public AnchorPane findImage(String foto, EnumSpeler Speler){
        
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
            imageView.setFitHeight(SIZE);
            imageView.setFitWidth(SIZE);
            imageView.setPreserveRatio(false);
            paneel.getChildren().add(imageView);  
           
            //System.out.println("zwart");
            return paneel;     
        }
        else if(Speler == WIT){
            Image afbeelding = new Image(foto);
            ImageView imageView = new ImageView(afbeelding);
            imageView.setFitHeight(SIZE);
            imageView.setFitWidth(SIZE);
            imageView.setPreserveRatio(false);
            paneel.getChildren().add(imageView);
            
            //System.out.println("wit");
            return paneel;
        }
        System.out.println("probleem");
        return paneel;
    }
}

