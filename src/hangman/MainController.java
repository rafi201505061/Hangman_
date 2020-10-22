/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.animation.ParallelTransition;
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
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * FXML Controller class
 *
 * @author rakibul
 */
public class MainController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Text first;

    @FXML
    private Text second;
    @FXML
    JFXButton start;
    
    @FXML
    private JFXButton A;

    @FXML
    private JFXButton B;

    @FXML
    private JFXButton F;

    @FXML
    private JFXButton G;

    @FXML
    private JFXButton C;

    @FXML
    private JFXButton H;

    @FXML
    private JFXButton K;

    @FXML
    private JFXButton L;

    @FXML
    private JFXButton M;

    @FXML
    private JFXButton D;

    @FXML
    private JFXButton I;

    @FXML
    private JFXButton T;

    @FXML
    private JFXButton Q;

    @FXML
    private JFXButton X;

    @FXML
    private JFXButton W;

    @FXML
    private JFXButton R;

    @FXML
    private JFXButton S;

    @FXML
    private JFXButton O;

    @FXML
    private JFXButton N;

    @FXML
    private JFXButton E;

    @FXML
    private JFXButton J;

    @FXML
    private JFXButton Y;

    @FXML
    private JFXButton Z;

    @FXML
    private JFXButton U;

    @FXML
    private JFXButton P;

    @FXML
    private JFXButton V;
    
    @FXML
    private Rectangle rect1;

    @FXML
    private Rectangle rect2;

    @FXML
    private Rectangle rect3;

    @FXML
    private Rectangle rect4;

    @FXML
    private Rectangle rect5;

    @FXML
    private Rectangle rect6;

    @FXML
    private Rectangle rect7;

    @FXML
    private Rectangle rect8;

    @FXML
    private Rectangle rect9;

    @FXML
    private Rectangle rect10;

    @FXML
    private Rectangle rect11;

    @FXML
    private Rectangle rect12;

    @FXML
    private Rectangle rect13;

    @FXML
    private Rectangle rect14;

    @FXML
    private Rectangle rect15;
        @FXML
    private Text t1;

    @FXML
    private Text t2;

    @FXML
    private Text t3;

    @FXML
    private Text t4;

    @FXML
    private Text t5;

    @FXML
    private Text t6;

    @FXML
    private Text t7;

    @FXML
    private Text t8;

    @FXML
    private Text t9;

    @FXML
    private Text t10;

    @FXML
    private Text t11;

    @FXML
    private Text t12;

    @FXML
    private Text t13;

    @FXML
    private Text t14;

    @FXML
    private Text t15;
    @FXML
    private Text lost;

    @FXML
    private JFXButton play_again;
    
    @FXML
    private JFXButton next;

    @FXML
    private Text win;
    
    @FXML
    private ImageView exit;

    @FXML
    private ImageView back;
    String st,category;
    int wrongcount=0,playertracking=0;
    int x=50,y=550;
    Rectangle[] re=new Rectangle[15];
    Text[] txt=new Text[15];
    int index;
    String stri;
    int flag=0,length=0,score1=0,score2=0,score=0;
    JFXButton[] jb=new JFXButton[26];
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        if(Hangman.kusal==1){
            first.setText(Hangman.firstplayer+"::");
            second.setText(Hangman.secondplayer+"::");
            first.setOpacity(1);
            second.setOpacity(1);
        }
        start.setDisable(false);
        start.setOpacity(1);
        category=Hangman.cat;
        lost.setDisable(true);
        play_again.setDisable(true);
        
        // TODO
        jb[0]=A;
        jb[1]=B;
        jb[2]=C;
        jb[3]=D;
        jb[4]=E;
        jb[5]=F;
        jb[6]=G;
        jb[7]=H;
        jb[8]=I;
        jb[9]=J;
        jb[10]=K;
        jb[11]=L;
        jb[12]=M;
        jb[13]=N;
        jb[14]=O;
        jb[15]=P;
        jb[16]=Q;
        jb[17]=R;
        jb[18]=S;
        jb[19]=T;
        jb[20]=U;
        jb[21]=V;
        jb[22]=W;
        jb[23]=X;
        jb[24]=Y;
        jb[25]=Z;
        
        re[0]=rect1;
        re[1]=rect2;
        re[2]=rect3;
        re[3]=rect4;
        re[4]=rect5;      
        re[5]=rect6;
        re[6]=rect7;
        re[7]=rect8;
        re[8]=rect9;
        re[9]=rect10;
        re[10]=rect11;
        re[11]=rect12;
        re[12]=rect13;
        re[13]=rect14;
        re[14]=rect15;
        txt[0]=t1;
        txt[1]=t2;
        txt[2]=t3;
        txt[3]=t4;
        txt[4]=t5;
        txt[5]=t6;
        txt[6]=t7;
        txt[7]=t8;
        txt[8]=t9;
        txt[9]=t10;
        txt[10]=t11;
        txt[11]=t12;
        txt[12]=t13;
        txt[13]=t14;
        txt[14]=t15;
        disablebuttons();
        
    }  
    public void disablebuttons(){
        for(int i=0;i<26;i++)
        {
            jb[i].setDisable(true);
        }
    }
    public void enablebuttons(){
        for(int i=0;i<26;i++)
        {
            jb[i].setDisable(false);
        }
    }
     public void crici(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.05), (ImageView)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.2);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setFromZ(1);
        sc.setToZ(1.5);
        sc.setCycleCount(1);
        sc.setAutoReverse(true);
        sc.play();
        //Hangman.cat=((ImageView)event.getSource()).getAccessibleText();
        sc.setOnFinished(e->{
            
            try {
                Parent root=FXMLLoader.load(getClass().getResource("CategoryPage.fxml"));
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
      public void cricii(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.05), (ImageView)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.2);
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
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }
    public void Ad(ActionEvent event){
        st=((JFXButton)event.getSource()).getText();
        System.out.println(st.charAt(0));
        FadeTransition ft=new FadeTransition(Duration.seconds(1), ((JFXButton)event.getSource()));
        ft.setFromValue(((JFXButton)event.getSource()).getOpacity());
        ft.setToValue(0);
        ft.play();
        ((JFXButton)event.getSource()).setDisable(true);
        flag=0;
        for(int i=0;i<stri.length();i++){
            if(st.charAt(0)==stri.charAt(i)){
            length++;
            flag=1;
            txt[i].setText(st);
            txt[i].setVisible(true);
            FadeTransition fti=new FadeTransition(Duration.seconds(2), txt[i]);
            fti.setFromValue(0);
            fti.setToValue(1);
            fti.play();
            }
            
            System.out.println(length+" "+stri.length());
        }
        for(int k=0;k<stri.length();k++){
            if(stri.charAt(k)==' '){
                length++;
            }
        } 
        
        System.out.println(length+" "+stri.length());
        if(length==stri.length()){
            
            if(Hangman.kusal==1)
            {
                if(playertracking%2==0)
                {
                    score1+=20-wrongcount*5;
                    first.setText(first.getText()+Integer.toString(score1));
                }
                else
                {
                    score2+=20-wrongcount*5;
                    second.setText(second.getText()+Integer.toString(score2));
                }
            }
            System.out.println("right");
            
            FadeTransition fade=new FadeTransition(Duration.seconds(2), next);
            fade.setFromValue(0);
            fade.setToValue(1);
            
            FadeTransition fade1=new FadeTransition(Duration.seconds(2), win);
            fade1.setFromValue(0);
            fade1.setToValue(1);
            ParallelTransition p=new ParallelTransition(fade1,fade);
            //fade1.play();
            p.play();
            p.setOnFinished(e->{
                next.setDisable(false);
            });
            length=0;
            playertracking++;
            //start.setDisable(false);
        }
        
        else if(flag==0){
            wrongcount++;
        
        if(wrongcount==5){
            System.out.println("Dead");
            
            //play_again.setDisable(false);
            FadeTransition fade=new FadeTransition(Duration.seconds(2.5), play_again);
            fade.setFromValue(0);
            fade.setToValue(1);
            
            FadeTransition fade1=new FadeTransition(Duration.seconds(2.5), lost);
            fade1.setFromValue(0);
            fade1.setToValue(1);
            ParallelTransition p=new ParallelTransition(fade1,fade);
            //fade1.play();
            p.play();
            p.setOnFinished(e->{
                play_again.setDisable(false);
            });
            wrongcount=0;
            //fade.play();
            //start.setDisable(false);
        }}
    }
    
    public void  starti(ActionEvent event){
       
        if(Hangman.kusal==0)
        {Random rand=new Random();
        index=rand.nextInt(10);
        
        try {
            PreparedStatement p=Hangman.conn.prepareStatement("select * from "+category +" where ID = ?");
            p.setString(1, String.valueOf(index));
             ResultSet rs=p.executeQuery();
             while(rs.next()){
                 stri=rs.getString("NAME");
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }}
        else
        {
             try {
                Parent root=FXMLLoader.load(getClass().getResource("stringgetter.fxml"));
                //Scene scene=new Scene(root);
                Stage stage=new Stage();
                Scene scenei=new Scene(root);
                stage.setScene(scenei);
                stage.setMinHeight(scenei.getHeight());
                stage.setMinWidth(scenei.getWidth());
                stage.showAndWait();
            } catch (IOException ex) {
                Logger.getLogger(TextGainController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stri=Hangman.stringrafi;
        }
         for(int k=0;k<stri.length();k++){
            if(stri.charAt(k)==' '){
                length++;
            }
        }  
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (JFXButton)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.2);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setCycleCount(2);
        sc.setAutoReverse(true);
        sc.play();
        for(int i=0;i<26;i++){
            jb[i].setDisable(false);
            jb[i].setOpacity(1);
        }
        for(int jh=0;jh<15;jh++){
            re[jh].setOpacity(0);
            re[jh].setVisible(false);
            txt[jh].setOpacity(0);
            txt[jh].setVisible(false);
        }

        
        for(int i=0;i<stri.length();i++){
            if(stri.charAt(i)!=' ')
            {
                re[i].setVisible(true);
                FadeTransition ft=new FadeTransition(Duration.seconds(1.5), re[i]);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
            }
        }
        enablebuttons();
        
        ((JFXButton)event.getSource()).setDisable(true);
        ((JFXButton)event.getSource()).setOpacity(0);
        
        
        
        //start.setDisable(true);
    }
     public void  startii(ActionEvent event){
        if(Hangman.kusal==0)
        {Random rand=new Random();
        index=rand.nextInt(10);
        
        try {
            PreparedStatement p=Hangman.conn.prepareStatement("select * from "+category +" where ID = ?");
            p.setString(1, String.valueOf(index));
             ResultSet rs=p.executeQuery();
             while(rs.next()){
                 stri=rs.getString("NAME");
             }
             
             
        } catch (SQLException ex) {
            Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
        }}
        else
        {
             try {
                Parent root=FXMLLoader.load(getClass().getResource("stringgetter.fxml"));
                //Scene scene=new Scene(root);
                Stage stage=new Stage();
                Scene scenei=new Scene(root);
                stage.setScene(scenei);
                stage.setMinHeight(scenei.getHeight());
                stage.setMinWidth(scenei.getWidth());
                stage.showAndWait();
            } catch (IOException ex) {
                Logger.getLogger(TextGainController.class.getName()).log(Level.SEVERE, null, ex);
            }
            stri=Hangman.stringrafi;
        }
           
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (JFXButton)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.2);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setCycleCount(2);
        sc.setAutoReverse(true);
        sc.play();
        for(int i=0;i<26;i++){
            jb[i].setDisable(false);
            jb[i].setOpacity(1);
        }
        for(int jh=0;jh<15;jh++){
            re[jh].setOpacity(0);
            re[jh].setVisible(false);
            txt[jh].setOpacity(0);
            txt[jh].setVisible(false);
        }

        
        for(int i=0;i<stri.length();i++){
            if(stri.charAt(i)!=' ')
            {
                re[i].setVisible(true);
                FadeTransition ft=new FadeTransition(Duration.seconds(1.5), re[i]);
                ft.setFromValue(0);
                ft.setToValue(1);
                ft.play();
            }
        }
        enablebuttons();
        
        ((JFXButton)event.getSource()).setDisable(true);
        ((JFXButton)event.getSource()).setOpacity(0);
        lost.setOpacity(0);
        win.setOpacity(0);
        
        //start.setDisable(true);
    }
      public void hoverover(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (JFXButton)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.2);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setFromZ(1);
        sc.setToZ(1.5);
        sc.play();
    }
     public void hoveroveir(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (JFXButton)event.getSource());
        sc.setFromX(1.2);
        sc.setToX(1);
        sc.setFromY(1.1);
        sc.setToY(1);
        sc.setFromZ(1.5);
        sc.setToZ(1);
        sc.play();
    }
     public void hoveroveri(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (ImageView)event.getSource());
        sc.setFromX(1);
        sc.setToX(1.2);
        sc.setFromY(1);
        sc.setToY(1.1);
        sc.setFromZ(1);
        sc.setToZ(1.5);
        sc.play();
    }
     public void hoveroveiri(MouseEvent event){
        ScaleTransition sc=new ScaleTransition(Duration.seconds(.1), (ImageView)event.getSource());
        sc.setFromX(1.2);
        sc.setToX(1);
        sc.setFromY(1.1);
        sc.setToY(1);
        sc.setFromZ(1.5);
        sc.setToZ(1);
        sc.play();
    }
    
}

