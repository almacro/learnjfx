package org.example.sampleApps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class UILayout extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World!'");

        btn.setOnAction(event
                -> System.out.println("Hello World!"));

        //StackPane root = new StackPane();
        BorderPane root = new BorderPane();
        Circle cir = new Circle(150, 125, 70);
        root.setCenter(cir);
        root.setTop(btn);

        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
