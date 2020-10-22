/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author rakibul
 */
public class CategoryPageController implements Initializable {

    /**
     * Initializes the controller class.
     */
       @FXML
    private ImageView Cricket;

    @FXML
    private ImageView Football;

    @FXML
    private ImageView Movies;

    @FXML
    private ImageView Countries;

    @FXML
    private ImageView Pornstars;

    @FXML
    private ImageView Flowers;

    @FXML
    private ImageView Fruits;

    @FXML
    private ImageView Tennis;

    @FXML
    private ImageView Animals;

    @FXML
    private ImageView back;

    @FXML
    private ImageView exit;

    @FXML
    private ImageView Random;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        Hangman.kusal=0;
    }    
    public void cric(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.05), (ImageView)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.1);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setFromZ(1);
        sc.setToZ(1.5);
        sc.setCycleCount(1);
        sc.setAutoReverse(true);
        sc.play();
        Hangman.cat=((ImageView)event.getSource()).getAccessibleText();
        sc.setOnFinished(e->{
            
            try {
                Parent root=FXMLLoader.load(getClass().getResource("Main.fxml"));
                Stage stage=(Stage) ((Node)event.getSource()).getScene().getWindow();
                
                Scene scene=new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Hangman");
                stage.setMinHeight(scene.getHeight());
                stage.setMinWidth(scene.getWidth());
                stage.show();
            } catch (IOException ex) {
                Logger.getLogger(CategoryPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    public void crici(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.05), (ImageView)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.1);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setFromZ(1);
        sc.setToZ(1.5);
        sc.setCycleCount(1);
        sc.setAutoReverse(true);
        sc.play();
        //Hangman.cat=((ImageView)event.getSource()).getAccessibleText();
        sc.setOnFinished(e->{
           System.exit(1);
            try {
                Hangman.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(CategoryPageController.class.getName()).log(Level.SEVERE, null, ex);
            }
    });
}
    public void hoverover(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (ImageView)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.1);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setFromZ(1);
        sc.setToZ(1.5);
        sc.play();
    }
     public void hoveroveir(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (ImageView)event.getSource());
        sc.setFromX(1.1);
        sc.setToX(1);
        sc.setFromY(1.1);
        sc.setToY(1);
        sc.setFromZ(1.5);
        sc.setToZ(1);
        sc.play();
    }
     public void two(MouseEvent event){
           try {
               Parent root=FXMLLoader.load(getClass().getResource("text_gain.fxml"));
               Stage stage=new Stage();
               Scene scene=new Scene(root);
               stage.setScene(scene);
               stage.setMinHeight(scene.getHeight());
               stage.setMinWidth(scene.getWidth());
               stage.showAndWait();
           } catch (IOException ex) {
               Logger.getLogger(CategoryPageController.class.getName()).log(Level.SEVERE, null, ex);
           }
     }
}
