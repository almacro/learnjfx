package org.example.sampleApps;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class RotateButton extends Application {
    double angle=0.0;
    
    @Override
    public void start(Stage primaryStage) {
        Rotate rotate = new Rotate();
        Button btnRotate = new Button("Click to rotate");
        btnRotate.getTransforms().add(rotate);
        
        btnRotate.setOnAction((ActionEvent ev)->{
            angle += 15;
            rotate.setAngle(angle);
            rotate.setPivotX(btnRotate.getWidth()/2);
            rotate.setPivotY(btnRotate.getHeight()/2);
        });
        
        FlowPane root = new FlowPane();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(25, 25, 25, 25));
        root.getChildren().add(btnRotate);
        
        Scene scene = new Scene(root, 300, 400);

        primaryStage.setTitle("Animate the button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
