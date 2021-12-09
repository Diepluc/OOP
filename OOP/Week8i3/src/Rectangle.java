public class Rectangle extends Shape {
    protected double width;
    protected double length;
    protected Point topLeft;

    public Rectangle() {
    }

    /**
     * khoi tao.
     */
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    /**
     * khoi tao.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * bang.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        this(width, length, color, filled);
        this.topLeft = topLeft;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return (width + length) * 2;
    }


    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * chuoi.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Rectangle) {
            Rectangle re = (Rectangle) obj;
            if (re.width == width && re.length == length) {
                return true;
            }
        }
        return false;
    }

    /**
     * bang.
     */
    public int hashCode() {
        Rectangle re = new Rectangle(width, length);
        return re.hashCode();
    }


    /**
     * chuoi.
     */
    public String toString() {
        return "Rectangle[topLeft=" + topLeft.toString() + ",width="
                + width + ",length=" + length + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }
}
