package org.example.sampleApps;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class Comments extends Application {
    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setPadding(new Insets(15, 15, 15, 15));
        root.setVgap(10);
        root.setHgap(10);
        
        Text title = new Text("Leave a comment!");
        title.setFill(Paint.valueOf("#2A5058"));
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        Label name = new Label("Enter your name: ");
        TextField userName = new TextField();
        HBox hb = new HBox();
        hb.getChildren().addAll(name, userName);
        hb.setSpacing(25);
        
        Label lblComment = new Label("Enter your comment: ");
        TextField commemt = new TextField();
        
        Button submit = new Button("Submit");
        Button clear = new Button("Clear");
        
        Label lblResponse = new Label();
        
        DropShadow shadow = new DropShadow();
        submit.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
            submit.setEffect(shadow);
        });
        clear.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e)->{
            clear.setEffect(shadow);
        });
        
        submit.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->{
            submit.setEffect(null);
        });
        clear.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e)->{
            clear.setEffect(null);
        });
        
        submit.setOnAction((ActionEvent e)->{
            if(commemt.getText() != null && !commemt.getText().isEmpty()) {
                lblResponse.setText(userName.getText() + " " +
                        "Thanks for your comment");
            } else {
                lblResponse.setText("you have not left a comment.");
            }
        });
        
        clear.setOnAction((ActionEvent e)->{
           userName.clear();
           commemt.clear();
           lblResponse.setText(null);
        });
        
        root.add(title, 0, 0, 2, 1);
        root.add(hb, 0, 1);
        root.add(lblComment, 0, 2);
        root.add(commemt, 0, 3);
        root.add(submit, 0, 4);
        root.add(clear, 1, 4);
        root.add(lblResponse, 0, 6, 2, 1);
        
        Scene scene = new Scene(root, 500, 400);
        scene.getStylesheets()
                .add( getClass().getClassLoader().getResource("login.css").toExternalForm() );
        
        primaryStage.setTitle("Comments");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
