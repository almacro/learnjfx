package org.example.challenge;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class CustomerUI extends Application {

    final String[] MSG = {
        "Hello!", "How are You?", "Goodbye!"
    };
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root, 400, 400);
        
        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);
        
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem printMenuItem = new MenuItem("Print");
        MenuItem exitMenuItem = new MenuItem("Exit");
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, printMenuItem,
                new SeparatorMenuItem(), exitMenuItem);
        menuBar.getMenus().add(fileMenu);

        Label response = new Label("");
        root.setCenter(response);
        
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(25, 25, 25, 25));
        vbox.setSpacing(50);
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        vbox.getChildren().addAll(btn1, btn2, btn3);
        root.setLeft(vbox);
        
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            response.setText(MSG[0]);
        });
        btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            response.setText(MSG[1]);
        });
        btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent e) -> {
            response.setText(MSG[2]);
        });
        
        scene.getStylesheets()
                .add( getClass().getClassLoader().getResource("customerUI/control.css").toExternalForm() );
        
        primaryStage.setTitle("Customer UI");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
