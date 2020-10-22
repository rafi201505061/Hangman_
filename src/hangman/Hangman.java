/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author rakibul
 */
public class Hangman extends Application {
    public static Connection conn;
    public static String cat;
    public static Stage stagei;
    public static int kusal=0;
    public static String stringrafi;
    public static String firstplayer;
    public static String secondplayer;
    
    
    @Override
    public void start(Stage primaryStage) {
        try {
            Class.forName("org.sqlite.JDBC");
            conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\rakibul\\Documents\\NetBeansProjects\\Hangman\\Hangman.sqlite");
            
        } catch (SQLException ex) {
            Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            Parent root =FXMLLoader.load(getClass().getResource("CategoryPage.fxml"));
            
            
            Scene scene = new Scene(root);
            Hangman.stagei=primaryStage;
            primaryStage.setTitle("Hangman");
            primaryStage.setScene(scene);
            primaryStage.setMinHeight(scene.getHeight());
            primaryStage.setMinWidth(scene.getWidth());
            primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(Hangman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
