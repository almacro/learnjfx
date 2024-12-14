package org.example.sampleApps;

import java.net.URL;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class StyledLogin extends Application {
    
    public void start(Stage primaryStage) {
        
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25,25,25,25));
        
        Scene scene = new Scene(grid, 300, 275);
        
        Text sceneTitle = new Text("Please Login:");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        Label userName = new Label("User Name:");
        TextField userTextField = new TextField();
        Label pw = new Label("Password:");
        PasswordField pwBox = new PasswordField();
        
        grid.add(sceneTitle, 0, 0, 2, 1);
        grid.add(userName, 0, 1);
        grid.add(userTextField, 1, 1);
        grid.add(pw, 0, 2);
        grid.add(pwBox, 1, 2);
        
        grid.setGridLinesVisible(false);
        
        Button btn = new Button("Sign In");
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 4);

        final Text actionTarget = new Text();
        grid.add(actionTarget, 1, 6);
        
        btn.setOnAction(event -> {
            actionTarget.setFill(Color.TURQUOISE);
            actionTarget.setText("Sign in button pressed");
        });
        /*
        URL u = getClass().getClassLoader().getResource("login.css");
        scene.getStylesheets().add(u.toString());
        */
        scene.getStylesheets()
                .add( StyledLogin.class.getClassLoader().getResource("login.css").toExternalForm() );
        
        primaryStage.setTitle("JavaFX Styled Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }    
}
