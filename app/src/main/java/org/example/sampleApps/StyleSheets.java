package org.example.sampleApps;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class StyleSheets extends Application {
    Label lblOutput;
    @Override
    public void start(Stage primaryStage) {
        Label lbl = new Label("Press the button to see a message");
        lblOutput = new Label(null);
        
        Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction((ActionEvent ev)->{ lblOutput.setText("Hello World"); });
        
        lblOutput.setId("textstyle");
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setVgap(30);
        root.setHgap(10);
        root.setOrientation(Orientation.VERTICAL);
        root.getChildren().addAll(lbl, btn, lblOutput);
                
        Scene scene = new Scene(root, 300, 300);
        scene.getStylesheets()
                .add(StyledLogin.class.getClassLoader().getResource("stylesheets/styles.css").toExternalForm());
        
        primaryStage.setTitle("StyleSheets");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
