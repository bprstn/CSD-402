// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment Module 11: JavaFX HBox Example idea taken from GeeksforGeeks

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class HBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create an HBox layout
        HBox hbox = new HBox(10); // Spacing of 10 pixels

        // Add buttons to the HBox
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Add buttons to the layout
        hbox.getChildren().addAll(btn1, btn2, btn3);

        // Set up the scene
        Scene scene = new Scene(hbox, 300, 100);
        primaryStage.setTitle("JavaFX HBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
