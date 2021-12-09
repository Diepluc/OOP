import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.VPos;
import javafx.scene.*;
import javafx.scene.canvas.*;
import javafx.scene.layout.StackPane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TextCanvas extends Application {
    @Override public void start(Stage primaryStage) {
        Canvas canvas = new Canvas(175, 40);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setTextAlign(TextAlignment.CENTER);
        gc.setTextBaseline(VPos.CENTER);
        gc.fillText(
                "Text centered on your Canvas",
                Math.round(canvas.getWidth()  / 2),
                Math.round(canvas.getHeight() / 2)
        );

        StackPane layout = new StackPane();
        layout.getChildren().addAll(canvas);

        primaryStage.setScene(new Scene(layout));
        primaryStage.show();
    }
    public static void main(String[] args) { launch(args); }
}