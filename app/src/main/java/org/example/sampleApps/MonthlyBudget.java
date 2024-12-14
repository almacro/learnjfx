package org.example.sampleApps;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author almacro
 */
public class MonthlyBudget extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //setUserAgentStylesheet(STYLESHEET_CASPIAN);
        ObservableList<PieChart.Data> pieData =
                FXCollections.observableArrayList(
                new PieChart.Data("Rent", 500),
                new PieChart.Data("Electric", 125),
                new PieChart.Data("Groceries", 235),
                new PieChart.Data("Entertainment", 200),
                new PieChart.Data("Cell Phone", 80));
        
        PieChart budget = new PieChart(pieData);
        budget.setTitle("Monthly Expenses");
        
        FlowPane root = new FlowPane();
        root.getChildren().add(budget);
        
        Scene scene = new Scene(root, 500, 500);

        primaryStage.setTitle("Monthly Budget");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
