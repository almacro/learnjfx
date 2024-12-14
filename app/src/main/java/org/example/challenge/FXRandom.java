package org.example.challenge;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

/**
 * Draw random shapes and colors.
 * @author almacro
 */
public class FXRandom extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(grid, 300, 275);
        
        int c = 0;
        int row = 0, col = 0;
        while (c < 12) {
            if (c % 4 == 0) {
                row = 0;
                col = c % 3;
            } else {
                row = c % 4;
            }

            Node shape = getRandomShape();
            grid.add(shape, col, row);
            ++c;
        }
        
        primaryStage.setTitle("Random Shapes and Colors");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    static Color getRandomColor() {
        return Color.color(Math.random(), Math.random(), Math.random());
    }
    
    static Node getRandomShape() {
        // ellipse, circle, rectangle, line, arc, polygon, cubic curve
        HBox hbox = new HBox();
        Shape shape = null;
        int id = randInt(12);
        int cx = randInt(40, 20);
        int cy = randInt(40, 20);
        switch(id) {
            case 0:
                // ellipse
                int rx = randInt(30,20);
                int ry = randInt(30,20);
                shape = new Ellipse(cx, cy, rx, ry);
                break;
            case 1: 
                // circle
                int r = randInt(30,20);
                shape = new Circle(cx, cy, r);
                break;
            case 2:
                // rectangle
                int w = randInt(40,30);
                int h = randInt(40,30);
                shape = new Rectangle(cx, cy, w, h);
                break;
            case 3:
                // line
                int dx = randInt(20,30);
                int dy = randInt(20,30);
                shape = new Line(cx - dx, cy - dy, cx + dx, cy + dy);
                break;
            case 4:
                // arc
                int r1 = randInt(20,30);
                int r2 = randInt(20,30);
                int deg = randInt(10, 60);
                int len = randInt(90);
                shape = new Arc(cx, cy, r1, r2, deg, len);
                break;
            case 5:
                // polygon
                Polygon poly = new Polygon();
                poly.getPoints().addAll(new Double[]{
                    0.0, 0.0,
                    20.0, 10.0,
                    10.0, 20.0});
                shape = poly;
                break;
            default:
                // cubic curve
                CubicCurve cubic = new CubicCurve();
                cubic.setStartX(0.0f);
                cubic.setStartY(50.0f);
                cubic.setControlX1(25.0f);
                cubic.setControlY1(0.0f);
                cubic.setControlX2(75.0f);
                cubic.setControlY2(100.0f);
                cubic.setEndX(100.0f);
                cubic.setEndY(50.0f);
                shape = cubic;
        }
        shape.setFill(getRandomColor());
        shape.setStrokeWidth(15);
        shape.setStroke(getRandomColor());
        hbox.getChildren().add(shape);
        return hbox;
    }
    
    static int randInt(int n) {
        return randInt(0, n);
    }
    
    static int randInt(int m, int n) {
        return (int)(Math.random() * n) + m;
    }
    
    public static void main(String[] args) {
        launch(args);
    } 
}
