// Name: Brian Preston
// Class: CSD 402 - Java Programming
// Assignment Module 11: JavaFX VBox Example idea from GeeksforGeeks

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBoxExample extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a VBox layout
        VBox vbox = new VBox(15); // Spacing of 15 pixels

        // Add buttons to the VBox
        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");

        // Add buttons to the layout
        vbox.getChildren().addAll(btn1, btn2, btn3);

        // Set up the scene
        Scene scene = new Scene(vbox, 200, 150);
        primaryStage.setTitle("JavaFX VBox Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
