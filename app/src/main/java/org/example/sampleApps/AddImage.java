package org.example.sampleApps;

import java.io.InputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class AddImage extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        Text title = new Text("California");
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 34));
        title.setFill(Color.FIREBRICK);
        
        InputStream imageIn = getClass().getClassLoader().getResourceAsStream("desertToSea.png");
        Image caPic = new Image(imageIn);
        ImageView imageView = new ImageView(caPic);
        
        root.setTop(title);
        root.setCenter(imageView);
        
        Scene scene = new Scene(root, 300, 400);

        primaryStage.setTitle("Add Image");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }    
}
