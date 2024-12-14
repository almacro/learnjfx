package org.example.sampleApps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class Menus extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 400, 400, Color.WHITE);

        MenuBar menuBar = new MenuBar();
        menuBar.prefWidthProperty().bind(primaryStage.widthProperty());
        root.setTop(menuBar);
        
        Menu fileMenu = new Menu("File");
        MenuItem newMenuItem = new MenuItem("New");
        MenuItem saveMenuItem = new MenuItem("Save");
        MenuItem printMenu = new MenuItem("Print");
        MenuItem exitMenuItem = new MenuItem("Exit");
        
        fileMenu.getItems().addAll(newMenuItem, saveMenuItem, printMenu,
                new SeparatorMenuItem(), exitMenuItem);
        
        Menu languageMenu = new Menu("Language");
        CheckMenuItem javaMenuItem = new CheckMenuItem("Java");
        CheckMenuItem pythonMenuItem = new CheckMenuItem("Python");
        CheckMenuItem htmlMenuItem = new CheckMenuItem("HTML");
        languageMenu.getItems().addAll(javaMenuItem, pythonMenuItem, htmlMenuItem);
        
        CheckMenuItem FXMenuItem = new CheckMenuItem("JavaFX");
        FXMenuItem.setSelected(true);
        languageMenu.getItems().addAll(new SeparatorMenuItem(), FXMenuItem);
        
        Menu tutorialMenu = new Menu("Tutorial");
        tutorialMenu.getItems().addAll(
                new MenuItem("Buttons"),
                new MenuItem("Menus"),
                new MenuItem("Images"));
                
        languageMenu.getItems().addAll(tutorialMenu);
        
        menuBar.getMenus().addAll(fileMenu, languageMenu);
        
        primaryStage.setTitle("Adding Menus");
        primaryStage.setScene(scene);
        primaryStage.show();        
    }

    public static void main(String[] args) {
        launch(args);
    }    
}
