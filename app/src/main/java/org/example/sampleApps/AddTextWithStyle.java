package org.example.sampleApps;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class AddTextWithStyle extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        Scene scene = new Scene(pane, 400, 400);
        
        pane.setTop(addHBox("Top"));
        pane.setLeft(addVBox("Left"));
        pane.setRight(addVBox("Right"));
        pane.setBottom(addHBox("Bottom"));
        
        scene.getStylesheets()
                .add( StyledLogin.class.getClassLoader().getResource("textStyles.css").toExternalForm() );
        
        primaryStage.setTitle("Adding Text");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static HBox addHBox(String str) {
        HBox hbox = new HBox();
        Text text = new Text(str);
        hbox.setId("hbox");
        text.setId("textstyle");
        hbox.getChildren().add(text);
        return hbox;
    }
    
    public static VBox addVBox(String str) {
        VBox vbox = new VBox();
        Text text = new Text(str);
        vbox.setId("vbox");
        text.setId("textstyle");
        vbox.getChildren().add(text);
        return vbox;
    }
    
    public static void main(String[] args) {
        launch(args);
    }   
}
