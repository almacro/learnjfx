package org.example.sampleApps;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.BlendMode;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class BlendedShapes extends Application {
    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        root.getChildren().add(blendModeObjects());
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Blended Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    static Node blendModeObjects(){
        Group g = new Group();
        Circle c = new Circle(50, 50, 25);
        c.setFill(Color.DARKGRAY);
        c.setBlendMode(BlendMode.MULTIPLY);
        
        Rectangle r = new Rectangle(50, 50, 50, 50);
        r.setFill(Color.BLUEVIOLET);
        
        Rectangle r2 = new Rectangle(170, 50, 50, 50);
        r2.setFill(Color.TEAL);

        Circle c2 = new Circle(170, 50, 25);
        c2.setFill(Color.CORAL);

        Rectangle r3 = new Rectangle(50, 150, 50, 50);
        r3.setFill(Color.WHITE);

        Circle c3 = new Circle(50, 150, 25);
        c3.setFill(Color.NAVY);
        
        g.setBlendMode(BlendMode.SRC_ATOP);
        g.getChildren().addAll(r, c, c2, r2, c3, r3);
        return g;
    }
    public static void main(String[] args) {
        launch(args);
    }    
}
