public class Rectangle extends Shape {
    protected double width;
    protected double length;

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

    /**
     * chuoi.
     */
    public String toString() {
        return "Rectangle[width=" + width + ",length=" + length
                + ",color=" + super.getColor() + ",filled=" + super.isFilled() + "]";
    }
}
