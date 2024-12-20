package org.example.sampleApps;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class PAColleges extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label response = new Label("Select a college or university");
        
        ListView<String> lvColleges;
        
        Text title = new Text("PA Colleges or Universities");
        title.setFill(Paint.valueOf("#2A5058"));
        title.setFont(Font.font("Verdana", FontWeight.BOLD, 20));
        
        FlowPane root = new FlowPane(10,10);
        root.setAlignment(Pos.CENTER);
        
        ObservableList<String> colleges = FXCollections.observableArrayList(
                "Penn State", "Drexel", "Widener", "Shippensburg",
                "Bloomsburg", "Penn Tech", "Lockhaven", "Kutztown");
        lvColleges = new ListView<String>(colleges);
        lvColleges.setPrefSize(300, 150);
        
        MultipleSelectionModel<String> lvSelModel = lvColleges.getSelectionModel();
        lvSelModel.selectedItemProperty()
                .addListener(new ChangeListener<String>() {
                    public void changed(ObservableValue<? extends String> changed,
                            String oldVal, String newVal) {
                        response.setText("You selected " + newVal);
                    }
                });
        
        root.getChildren().add(title);
        root.getChildren().add(lvColleges);
        root.getChildren().add(response);
        
        Scene scene = new Scene(root, 350, 300);
        primaryStage.setTitle("ListView");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
