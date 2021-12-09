public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        length = side;
        width = side;
    }

    /**
     * khoi tao.
     */
    public Square(double side, String color, boolean filled) {
        length = side;
        width = side;
        super.color = color;
        super.filled = filled;
    }

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        length = side;
        width = side;
    }

    /**
     * ghi de.
     */
    @Override
    public void setWidth(double side) {
        width = side;
        length = side;
    }

    /**
     * ghi de.
     */
    @Override
    public void setLength(double side) {
        length = side;
        width = side;
    }

    /**
     * chuoi.
     */
    public String toString() {
        return "Square[side=" + getSide() + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

}
