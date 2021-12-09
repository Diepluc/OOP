import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle rect = new Rectangle(100, 100);

        // toggle the visibility of 'rect' every 500ms
        Timeline timeline =
                new Timeline(new KeyFrame(Duration.millis(500), e -> rect.setVisible(!rect.isVisible())));
        timeline.setCycleCount(Animation.INDEFINITE); // loop forever
        timeline.play();

        primaryStage.setScene(new Scene(new StackPane(rect), 200, 200));
        primaryStage.show();
    }
}