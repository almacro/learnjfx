package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class SceneGraph extends Application {
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        // add a leaf node
        Circle cir = new Circle(200, 200, 100);
        cir.setFill(Color.CORAL);
        
        root.getChildren().add(cir);
        Scene scene = new Scene(root, 400, 400);
     
        primaryStage.setTitle("Scene Graph Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
