package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Random;

public class Controller {

    @FXML
    private ImageView Billede;

    @FXML
    private Button Roll_the_dice;

    @FXML
    void kastTerning(ActionEvent event) {

        int random = new Random().nextInt(6)+1;

        if (random == 1) {
            Image i1 = new Image("billeder/" + "terning1.png" );

            Billede.setImage(i1);

        } else if (random == 2){

            Image i1 = new Image("billeder/" + "terning2.png");

            Billede.setImage(i1);
        }else if (random == 3) {

            Image i1 = new Image("billeder/" + "terning3.png");

            Billede.setImage(i1);
        }else if (random == 4) {

            Image i1 = new Image("billeder/" + "terning4.png");

            Billede.setImage(i1);
        }else if (random == 5) {

            Image i1 = new Image("billeder/" + "terning5.png");

            Billede.setImage(i1);
        }else {

            Image i1 = new Image("billeder/" + "terning6.png");

            Billede.setImage(i1);
        }





    }
}