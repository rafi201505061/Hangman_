/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author rakibul
 */
public class StringgetterController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    private AnchorPane temp;
    @FXML
    private JFXTextField stri;

    @FXML
    private JFXButton submiti;
    @FXML
    private ImageView img;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void onclick(ActionEvent event)
    {
        if(!stri.getText().trim().equals("")){
            Hangman.stringrafi=stri.getText();
            Stage st=((Stage)((Node)event.getSource()).getScene().getWindow());
            st.getOpacity();
            FadeTransition ft=new FadeTransition(Duration.seconds(2), img);
            ft.setFromValue(1);
            ft.setToValue(0);
            FadeTransition ft1=new FadeTransition(Duration.seconds(2), stri);
            ft1.setFromValue(1);
            ft1.setToValue(0);
            FadeTransition ft3=new FadeTransition(Duration.seconds(2), submiti);
            ft3.setFromValue(1);
            ft3.setToValue(0);
            FadeTransition ft2=new FadeTransition(Duration.seconds(2), temp);
            ft2.setFromValue(1);
            ft2.setToValue(0);
            ParallelTransition p=new ParallelTransition(ft,ft1,ft2,ft3);
            p.play();

            st.close();
            
        }
    }
    
}
