package org.example.sampleApps;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class UIControls extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Button btn = new Button();
        btn.setText("I'm a button");
        Label lbl = new Label("I'm a label");
        TextField tf = new TextField("Enter text here");
        Hyperlink hl = new Hyperlink("I'm a hyperlink");
        
        RadioButton rb = new RadioButton("Radio Button");
        rb.setStyle("-fx-base: #61a2b1");
        CheckBox cb = new CheckBox("Check Box");
        ProgressBar pb = new ProgressBar();
        ScrollBar sb = new ScrollBar();
        
        ClassLoader cldr = getClass().getClassLoader();
        Image imageHome = new Image(cldr.getResourceAsStream("uicontrols/search.png"));
        Button btn2 = new Button("Search", new ImageView(imageHome));
        PasswordField pw = new PasswordField();
        
        GridPane grid = new GridPane();
        
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(20);
        grid.setVgap(50);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        grid.add(btn, 0, 0);
        grid.add(lbl, 1, 0);
        grid.add(tf, 2, 0);
        grid.add(rb, 0, 1);
        grid.add(cb, 1, 1);
        grid.add(hl, 2, 1);
        grid.add(pb, 0, 2);
        grid.add(sb, 1, 2);
        grid.add(btn2, 2, 2);
        grid.add(pw, 0, 3, 3, 1);

        Scene scene = new Scene(grid, 500, 500);

        primaryStage.setTitle("UI Controls");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
