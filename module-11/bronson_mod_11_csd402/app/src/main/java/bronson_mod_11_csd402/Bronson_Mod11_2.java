/*
 * Wendy Bronson
 * October 10, 2026
 * CSD 402 Java for Programmers
 * Module 11.2 Written Assignment
 *
 * This program demonstrates the use of
 * JavaFX HBox and VBox layout panes.
 */

package bronson_mod_11_csd402;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Bronson_Mod11_2 extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create buttons for the HBox
        Button homeButton = new Button("Home");
        Button saveButton = new Button("Save");
        Button exitButton = new Button("Exit");

        // HBox places the buttons horizontally
        HBox buttonBox = new HBox(15);
        buttonBox.getChildren().addAll(
                homeButton,
                saveButton,
                exitButton
        );

        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setPadding(new Insets(15));

        // Create labels for the VBox
        Label title = new Label("My Tasks");
        Label task1 = new Label("Complete Java Assignment");
        Label task2 = new Label("Study Chapter 14");
        Label task3 = new Label("Submit Module 11");

        // VBox places the labels vertically
        VBox taskBox = new VBox(12);
        taskBox.getChildren().addAll(
                title,
                task1,
                task2,
                task3
        );

        taskBox.setAlignment(Pos.CENTER_LEFT);
        taskBox.setPadding(new Insets(20));

        // Use BorderPane to hold both examples
        BorderPane root = new BorderPane();

        root.setTop(buttonBox);
        root.setCenter(taskBox);

        // Create the scene
        Scene scene = new Scene(root, 450, 300);

        // Set up the stage
        primaryStage.setTitle("HBox and VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}