import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Layer {
    private List<Shape> shapes = new ArrayList<Shape>();

    /**
     * thong tin.
     */
    public void addShape(Shape shape) {
        this.shapes.add(shape);
    }

    /**
     * thong tin.
     */
    public void removeCircles() {
        shapes.removeIf(c -> c instanceof Circle);
    }

    /**
     * thong tin.
     */
    public String getInfo() {
        String str = "Layer of crazy shapes:\n";
        for (Shape shape : shapes) {
            str += shape.toString() + "\n";
        }
        return str;
    }

    /**
     * thong tin.
     */
    public void removeDuplicates() {
        shapes = shapes.stream().distinct().collect(Collectors.toList());
    }


    public List<Shape> getShapeList() {
        return shapes;
    }
}
