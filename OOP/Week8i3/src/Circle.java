public class Circle extends Shape {
    protected double radius;
    protected Point center;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * khoi tao.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(Point p, double radius, String color, boolean filled) {
        this(radius, color, filled);
        this.center = p;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }


    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * chuoi.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            if (c.getRadius() == radius) {
                return true;
            }
        }
        return false;
    }

    /**
     * chuoi.
     */
    public int hashCode() {
        Circle c = new Circle(radius);
        return c.hashCode();
    }

    /**
     * chuoi.
     */
    public String toString() {
        return "Circle[center=" + center.toString() + ",radius=" + radius + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }
}
