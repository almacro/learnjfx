package org.example.challenge;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class ShapeChallenge extends Application {
    Random rand = new Random();
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        StackPane stack = new StackPane();
        Group circles = new Group();
        for(int i = 0; i < 5; i++) {
            int centerx = rand.nextInt(300);
            int centery = rand.nextInt(300);
            int radius = rand.nextInt(60);
            
            Circle circle = new Circle(centerx, centery, radius);
            circle.setStrokeType(StrokeType.OUTSIDE);
            circle.setStroke(Color.RED);
            circle.setStrokeWidth(4);
            circles.getChildren().add(circle);
        }
        Group rectangles = new Group();
        for(int i = 0; i < 5; i++) {
            int recx = rand.nextInt(150)+50;
            int recy = rand.nextInt(150)+50;
            int width = rand.nextInt(75);
            int height = rand.nextInt(75);
            
            Rectangle rec = new Rectangle(recx, recy, width, height);
            rec.setStrokeType(StrokeType.OUTSIDE);
            rec.setStroke(Color.BLUEVIOLET);
            rec.setStrokeWidth(4);
            rectangles.getChildren().add(rec);
        }
        Group lines = new Group();
        for(int i = 0; i < 5; i++) {
            int startx = rand.nextInt(100);
            int starty = rand.nextInt(100)+30;
            int endx = rand.nextInt(200)+100;
            int endy = rand.nextInt(200)+100;
            
            Line line = new Line(startx, starty, endx, endy);
            line.setStrokeType(StrokeType.OUTSIDE);
            line.setStroke(Color.DARKGRAY);
            line.setStrokeWidth(3);
            lines.getChildren().add(line);
        }
        
        root.getChildren().addAll(circles, rectangles, lines);
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Shapes");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }    
}
