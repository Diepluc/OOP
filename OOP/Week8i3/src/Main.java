import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Layer layer = new Layer();
        Rectangle re = new Rectangle(new Point(3, 3), 7, 54, "RED", true);
        layer.addShape(re);
        System.out.println();
        List<Shape> shapes = layer.getShapeList();
        System.out.println(shapes.size());
        for (Shape s : shapes) {
            String sm = s.toString();
            System.out.println(sm);
        }
    }
}
