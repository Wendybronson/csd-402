/*
 * Wendy Bronson
 * CSD-402
 * Module 1.3 Programming Assignment
 * August 16, 2026
 *
 * Purpose:
 * This program calculates the amount of energy needed
 * to heat water from an initial temperature to a final
 * temperature. The result is displayed in Joules.

 */

package bronson_module_1_3_csd402_fx;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;


public class App extends Application {

    @Override
    public void start(Stage stage) {

        // Ask the user for the amount of water in kilograms.
        TextInputDialog waterDialog = new TextInputDialog();
        waterDialog.setTitle("Water Energy Calculator");
        waterDialog.setHeaderText("Enter the amount of water in kilograms:");
        String waterInput = waterDialog.showAndWait().orElse("0");

        // Ask the user for the initial temperature.
        TextInputDialog initialDialog = new TextInputDialog();
        initialDialog.setTitle("Water Energy Calculator");
        initialDialog.setHeaderText("Enter the initial temperature in Celsius:");
        String initialInput = initialDialog.showAndWait().orElse("0");

        // Ask the user for the final temperature.
        TextInputDialog finalDialog = new TextInputDialog();
        finalDialog.setTitle("Water Energy Calculator");
        finalDialog.setHeaderText("Enter the final temperature in Celsius:");
        String finalInput = finalDialog.showAndWait().orElse("0");

        // Convert the user input to numbers.
        double waterMass = Double.parseDouble(waterInput);
        double initialTemperature = Double.parseDouble(initialInput);
        double finalTemperature = Double.parseDouble(finalInput);

        // Calculate the energy needed to heat the water.
        double energy = waterMass
                * (finalTemperature - initialTemperature)
                * 4184;

        // Display the result in Joules.
        Alert result = new Alert(Alert.AlertType.INFORMATION);
        result.setTitle("Water Energy Calculator");
        result.setHeaderText("Energy Required");
        result.setContentText("The energy needed is "
                + String.format("%,.2f", energy)
                + " Joules.");

        result.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }
}