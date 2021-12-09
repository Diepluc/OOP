import java.util.List;

public class ShapeUtil {
    /**
     * info.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String info = "Circle:\n";
        String infoTriangle = "Triangle:\n";
        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) instanceof Circle) {
                info += shapes.get(i).getInfo() + "\n";
            } else if (shapes.get(i) instanceof Triangle) {
                infoTriangle += shapes.get(i).getInfo() + "\n";
            }
        }
        info += infoTriangle;
        return info;
    }
}
