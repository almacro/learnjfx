package org.example.challenge;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class UIChallenge extends Application {
    
    Label message;
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);

        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem printMenuItem = new MenuItem("Print");
        MenuItem exitMenuItem = new MenuItem("Exit");
        
        exitMenuItem.setOnAction(actionEvent->Platform.exit());
        
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, printMenuItem,
                new SeparatorMenuItem(), exitMenuItem);
        menuBar.getMenus().add(fileMenu);
        
        message = new Label("");
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        
        btn1.setText("JavaFX");
        btn2.setText("Greeting");
        btn3.setText("Mystery");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                message.setText("Welcome to JavaFX!!");
                message.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
                message.setTextFill(Color.FIREBRICK);
            }    
        });
        btn2.setOnAction((ActionEvent e)->{
                message.setText("Hello World!");
                message.setFont(Font.font("Comic Sans ms", FontWeight.BOLD, 30));
                message.setTextFill(Color.DARKSLATEGRAY);
        });
        btn3.setOnAction((ActionEvent e)->{
                message.setText("Have a nice day!");
                //message.setFont(Font.font("Jokerman", FontWeight.BOLD, 30));
                message.setFont(Font.font("Party LET", FontWeight.BOLD, 30));
                message.setTextFill(Color.FUCHSIA);   
        });
        
        root.setCenter(message);
        
        VBox buttons = new VBox();
        buttons.setSpacing(10);
        buttons.setAlignment(Pos.CENTER);
        buttons.getChildren().addAll(btn1, btn2, btn3);
        root.setLeft(buttons);
        root.setTop(menuBar);
        
        Scene scene = new Scene(root, 400, 250);
        
        primaryStage.setTitle("UI Challenge");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
