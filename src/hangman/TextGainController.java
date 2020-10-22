/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author rakibul
 */
public class TextGainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private JFXTextField first_name;

    @FXML
    private JFXTextField second_name;

    @FXML
    private JFXButton submit;
    @FXML
    private ImageView img;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void onclick(ActionEvent event)
    {
        if(!first_name.getText().trim().equals("")&&!second_name.getText().trim().equals("")){
            Hangman.firstplayer=first_name.getText();
            Hangman.secondplayer=second_name.getText();
            Stage st=((Stage)((Node)event.getSource()).getScene().getWindow());
            st.getOpacity();
            FadeTransition ft=new FadeTransition(Duration.seconds(2), img);
            ft.setFromValue(1);
            ft.setToValue(0);
            FadeTransition ft1=new FadeTransition(Duration.seconds(2), second_name);
            ft1.setFromValue(1);
            ft1.setToValue(0);
            FadeTransition ft2=new FadeTransition(Duration.seconds(2), first_name);
            ft2.setFromValue(1);
            ft2.setToValue(0);
            FadeTransition ft3=new FadeTransition(Duration.seconds(2), submit);
            ft3.setFromValue(1);
            ft3.setToValue(0);
            ParallelTransition p=new ParallelTransition(ft,ft1,ft2,ft3);
            p.play();
            p.setOnFinished(e->{
                st.close();
            });
            Hangman.kusal=1;
            try {
                Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
                Scene scene=new Scene(root);
                Hangman.stagei.setScene(scene);
                Hangman.stagei.setMinHeight(scene.getHeight());
                Hangman.stagei.setMinWidth(scene.getWidth());
                Hangman.stagei.show();
            } catch (IOException ex) {
                Logger.getLogger(TextGainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
