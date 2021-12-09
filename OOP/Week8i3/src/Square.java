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

    /**
     * bang.
     */
    public Square(Point p, double side, String color, boolean filled) {
        this(side, color, filled);
        topLeft = p;
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
    public boolean equals(Object obj) {
        if (obj instanceof Square) {
            Square re = (Square) obj;
            if (re.width == width && re.length == length) {
                return true;
            }
        }
        return false;
    }

    /**
     * chuoi.
     */
    public String toString() {
        return "Square[topLeft=" + topLeft.toString() + ",side="
                + getSide() + ",color="
                + super.getColor() + ",filled=" + super.isFilled() + "]";
    }

}
