package org.example.challenge;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Create a bar chart for new car sales
 * 
 * @author almacro
 */
public class CarSales extends Application {
    @Override
    public void start(Stage primaryStage) {
        Axis xAxis = new CategoryAxis();
        xAxis.setLabel("Seller");
        
        Axis yAxis = new NumberAxis();
        yAxis.setLabel("Sales");
        
        BarChart carSales = new BarChart(xAxis, yAxis);
        carSales.setTitle("Sales Report");
        
        XYChart.Series<String,Integer> jan = new XYChart.Series<>();
        jan.setName("Jan");
        XYChart.Series<String,Integer> feb = new XYChart.Series<>();
        feb.setName("Feb");
        XYChart.Series<String,Integer> mar = new XYChart.Series<>();
        mar.setName("Mar");

        jan.getData().addAll(
                new XYChart.Data<>("Linda",110000), 
                new XYChart.Data<>("Mary",120000));
        feb.getData().addAll(
                new XYChart.Data<>("Linda",90000),
                new XYChart.Data<>("Mary",70000));
        mar.getData().addAll(
                new XYChart.Data<>("Linda",140000),
                new XYChart.Data<>("Mary",160000));
        
        carSales.getData().addAll(jan, feb, mar);

        BorderPane root = new BorderPane();
        root.setPadding(new Insets(25, 25, 25, 25));
        root.setCenter(carSales);
        
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Sales");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
