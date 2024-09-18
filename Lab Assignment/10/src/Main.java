import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class TriangleVisual extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a pane to hold the triangle
        Pane pane = new Pane();

        // Create a triangle using the Polygon class
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
                100.0, 150.0, // Point A (x1, y1)
                200.0, 50.0, // Point B (x2, y2)
                300.0, 150.0 // Point C (x3, y3)
        );

        // Set the color of the triangle
        triangle.setFill(Color.LIGHTBLUE);
        triangle.setStroke(Color.BLACK);

        // Add the triangle to the pane
        pane.getChildren().add(triangle);

        // Create a scene and place it in the stage
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Triangle Visual");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
