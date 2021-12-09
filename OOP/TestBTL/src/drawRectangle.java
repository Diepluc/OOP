import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class drawRectangle extends Application {
    @Override
    public void start(Stage stage) {
        //Drawing a Rectangle
        Rectangle rectangle = new Rectangle();

        //Setting the properties of the rectangle
        rectangle.setX(150.0f);
        rectangle.setY(75.0f);
        rectangle.setWidth(200);
        rectangle.setHeight(200);
        rectangle.setArcHeight(200);
        rectangle.setArcWidth(300);


        Polygon polygon = new Polygon();
        polygon.getPoints().addAll(new Double[]{
                250.0, 50.0,
                400.0, 150.0,
                400.0, 250.0,
                150.0, 250.0,
                150.0, 150.0,
        });

        //Creating a Group object
        Group root = new Group(polygon);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);

        //Setting title to the Stage
        stage.setTitle("Drawing a Rectangle");

        //Adding scene to the stage
        stage.setScene(scene);

        //Displaying the contents of the stage
        stage.show();
    }
    public static void main(String args[]){
        launch(args);
    }
} 