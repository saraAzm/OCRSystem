/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocr_system;

import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author sanjab
 */
public class OCR_system extends Application {
   
       
    @Override
    public void start(Stage primaryStage) {
        
       VBox root = new VBox();
       HBox UpRoot = new HBox();
       HBox DownRoot = new HBox();
       HBox Buttons = new HBox();
 
       root.setAlignment(Pos.CENTER);
       
        
        
        
        root.getChildren().add(UpRoot);
        root.getChildren().add(DownRoot);
           

         Label colorLable = new Label("Color:");
         Label GeneralInformationLable = new Label("General Information:");
         
       
   
        
        
        UpRoot.setAlignment(Pos.CENTER);
        
        DownRoot.setAlignment(Pos.CENTER);
        DownRoot.setSpacing(100);
        root.setSpacing(100);
        
         
       
        VBox UserEntry = new VBox();
        VBox DataSetInformation = new VBox();
        UpRoot.setSpacing(50);
        
        UpRoot.getChildren().add(UserEntry);
        UpRoot.getChildren().add(DataSetInformation);
        
        
        //Images
        // load the image
         Image image = new Image("segment.png");
         // simple displays ImageView the image as is
         ImageView iv1 = new ImageView();
         ImageView iv2 = new ImageView();
         iv1.setFitWidth(100);
         iv1.setFitHeight(30);
         
         iv2.setFitWidth(300);
         iv2.setFitHeight(90);
         iv1.setImage(image);
         iv2.setImage(image);
         UserEntry.getChildren().add(iv2);
         UserEntry.getChildren().add(iv1);
         UserEntry.setAlignment(Pos.CENTER);
        
        HBox GeneralInformation = new HBox();
        
        GeneralInformation.setAlignment(Pos.CENTER);
        UserEntry.getChildren().add(GeneralInformation);
        // CheckBox vaziate kolli
        CheckBox readable = new CheckBox("readable");
        CheckBox complete = new CheckBox("complete");
        CheckBox rotate = new CheckBox("rotate");
        CheckBox small = new CheckBox("small");
        GeneralInformation.getChildren().addAll(GeneralInformationLable, small, rotate, complete, readable);
        
        GeneralInformation.setSpacing(25);
        
        HBox Color = new HBox();
        Color.setAlignment(Pos.CENTER);
        UserEntry.getChildren().add(Color);
        // CheckBox rang
        CheckBox white = new CheckBox("white");
        CheckBox yellow = new CheckBox("yellow");
        CheckBox green = new CheckBox("green");
        CheckBox red = new CheckBox("red");
        Color.getChildren().addAll(colorLable, red,green, yellow, white);
        
        Color.setSpacing(25);
        // ghesmat shode
        HBox Segment = new HBox();
        
        List<Image> ImageList = new ArrayList<>();
        List<CheckBox> checkBoxList = new ArrayList<>();
        List<ComboBox> comboboxList1 = new ArrayList<>();
        List<ComboBox> comboboxList2 = new ArrayList<>();
        List<TextField> textFieldList = new ArrayList<>();
        
        
        
        
            UserEntry.getChildren().add(Segment);
            
        Integer i;
        for(i=0;i<8;i++){
            VBox Segmented = new VBox();
            Segment.getChildren().add(Segmented);
        
            
        Image segmentImage = new Image("1.png");
         ImageView bigSegment = new ImageView();
         ImageView smallSegment = new ImageView();
         bigSegment.setFitWidth(40);
         bigSegment.setFitHeight(60);
         
         smallSegment.setFitWidth(10);
         smallSegment.setFitHeight(3);
         smallSegment.setImage(segmentImage);
         bigSegment.setImage(segmentImage);
        
         
         CheckBox badSegmented = new CheckBox("Bad Segmented");
         Label OCRSystemLable = new Label("OCR system:");
         TextField OCRSystemText = new TextField ("1");
     
         OCRSystemText.setPrefSize(10, 10);
          Label OCRUserLable = new Label("OCR User:");
          ObservableList<String> digits = FXCollections.observableArrayList();
          if(i!=2){
           digits =  FXCollections.observableArrayList("0","1","2","3","4","5","6","7","8","9");
          }
          if(i==2){
              digits =  FXCollections.observableArrayList("الف","ب","پ","ت","ث","ج","چ","ح","خ","د","ذ","ر","ز","ژ","س","ش","ص","ض","ط","ظ","ع","غ","ن","و","ه","ی");
          }
          
         ComboBox OCRUserText = new ComboBox(digits);
         Label SegmentStatusLable = new Label("Segment Status:");
         ObservableList<String> Status =  FXCollections.observableArrayList("MATCHED","UNMATCHED");
         ComboBox SegmentStatus = new ComboBox(Status);
         Segmented.getChildren().addAll(bigSegment, badSegmented,  OCRSystemLable, OCRSystemText, OCRUserLable, OCRUserText,SegmentStatusLable, SegmentStatus);
        Segment.setSpacing(25);
        }
        
        UserEntry.setSpacing(25);
        
        
        
        
        Label Date = new Label("Date:");
        Label Time = new Label("Time:");
        Label Number = new Label("Number:");
        Label Done = new Label("Done:");
        Label True = new Label("True:");
        Label False = new Label("False:");
        TextField dateText = new TextField ();
        TextField timeText = new TextField ();
        TextField numberText = new TextField ();
        TextField doneText = new TextField ();
        TextField trueText = new TextField ();
        TextField falseText = new TextField ();
        DataSetInformation.getChildren().addAll(Date, dateText);
        DataSetInformation.getChildren().addAll(Time, timeText);
        DataSetInformation.getChildren().addAll(Number, numberText);
        DataSetInformation.getChildren().addAll(Done, doneText);
        DataSetInformation.getChildren().addAll(True, trueText);
        DataSetInformation.getChildren().addAll(False, falseText);
        DataSetInformation.setSpacing(5);
        
        
        UserEntry.getChildren().add(Buttons);
        Buttons.setSpacing(25);
        Buttons.setAlignment(Pos.CENTER);
        // Button 1
        Button button1= new Button("Remove");
        button1.setPrefSize(100, 30);
        Buttons.getChildren().add(button1);
        
        
        
        // Button 2
        Button button2 = new Button("Next");
        button2.setPrefSize(100, 30);
        Buttons.getChildren().add(button2);
       
       
        
        
        Scene scene = new Scene(root, 550, 250);
 
        primaryStage.setTitle("VBox Layout Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
