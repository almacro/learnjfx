package org.example.challenge;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class AskMe extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("FXMLAskMe.fxml"));
        
        Scene scene = new Scene(root, 500, 275);
        stage.setTitle("Ask Me");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
