package org.example.sampleApps;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.PerspectiveTransform;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class TextEffects extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setSpacing(20);
        /*
        Text p = new Text("LinkedIn");
        Text r = new Text("Reflection in JavaFX...");
        Text d = new Text("Drop Shadow");
        */
        root.getChildren().addAll(perspective(), dropShadow(), reflection());
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Text Effects");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    static Node dropShadow() {
        Text t = new Text();
        t.setCache(true);
        t.setFill(Color.FIREBRICK);
        t.setText("DropShadow effect");
        t.setFont(Font.font("null", FontWeight.BOLD, 32));
        DropShadow ds = new DropShadow();
        ds.setOffsetX(3.0);
        ds.setOffsetY(3.0);
        ds.setColor(Color.DARKGRAY);
        t.setEffect(ds);
        return t;
    }
    
    static Node reflection() {
        Text t = new Text();
        t.setCache(true);
        t.setText("Reflection in JavaFX..");
        t.setFill(Color.CORNFLOWERBLUE);
        t.setFont(Font.font("null", FontWeight.BOLD, 30));
        
        Reflection r = new Reflection();
        r.setFraction(0.9);
        t.setEffect(r);
        t.setTranslateY(50);
        return t;
    }
    
    static Node perspective() {
        Group g = new Group();
        PerspectiveTransform pt = new PerspectiveTransform();
        pt.setUlx(10.0f);
        pt.setUly(10.0f);
        pt.setUrx(210.0f);
        pt.setUry(40.0f);
        pt.setLrx(210.0f);
        pt.setLry(60.0f);
        pt.setLlx(10.0f);
        pt.setLly(90.0f);
        
        g.setEffect(pt);
        g.setCache(true);
        
        Rectangle r = new Rectangle();
        r.setX(10.0f);
        r.setY(10.0f);
        r.setWidth(280.0f);
        r.setHeight(80.0f);
        r.setFill(Color.DODGERBLUE);
        
        Text t = new Text();
        t.setX(20.0f);
        t.setY(65.0f);
        t.setText("LinkedIn");
        t.setFill(Color.WHITE);
        t.setFont(Font.font("null", FontWeight.BOLD, 36));
        
        g.getChildren().addAll(r,t);
        return g;
    }
    public static void main(String[] args) {
        launch(args);
    } 
}
