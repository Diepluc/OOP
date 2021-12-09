public class Point {
    private double pointX;
    private double pointY;

    public Point(double x, double y) {
        this.pointX = x;
        this.pointY = y;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * bang.
     */
    public double distance(Point p) {
        double x = pointX - p.getPointX();
        double y = pointY - p.getPointY();
        return Math.sqrt(x * x + y * y);
    }

    /**
     * bang.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            if (p.getPointX() == pointX && p.getPointY() == pointY) {
                return true;
            }
        }
        return false;
    }

    /**
     * bang.
     */
    public int hashCode() {
        Point p = new Point(pointX, pointY);
        return p.hashCode();
    }

    /**
     * bang.
     */
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }
}
