public class Triangle implements GeometricObject {
    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * check.
     */
    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        if (p1.getPointX() == p2.getPointX()
                && p1.getPointY() == p2.getPointY()
                || p1.getPointX() == p3.getPointX()
                && p1.getPointY() == p3.getPointY()
                || p3.getPointX() == p2.getPointX()
                && p3.getPointY() == p2.getPointY()) {
            throw new RuntimeException();
        }
        double testPX = p1.getPointX() - p2.getPointX();
        double testPY = p1.getPointY() - p2.getPointY();
        double testPX2 = p1.getPointX() - p3.getPointX();
        double testPY2 = p1.getPointY() - p3.getPointY();
        double tp1 = testPX / testPX2;
        double tp2 = testPY / testPY2;
        if (tp1 == tp2) {
            throw new RuntimeException();
        }
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }


    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    /**
     * dien tich.
     */
    @Override
    public double getArea() {
        double t1 = p1.distance(p2);
        double t2 = p2.distance(p3);
        double t3 = p3.distance(p1);
        double p = (t1 + t2 + t3) / 2;
        return Math.sqrt(p * (p - t1) * (p - t2) * (p - t3));
    }

    /**
     * chu vi.
     */
    @Override
    public double getPerimeter() {
        return p1.distance(p2) + p2.distance(p3) + p1.distance(p3);
    }

    /**
     * info.
     */
    public String getInfo() {
        return "Triangle[(" + String.format("%.2f", p1.getPointX())
                + "," + String.format("%.2f", p1.getPointY())
                + "),(" + String.format("%.2f", p2.getPointX())
                + "," + String.format("%.2f", p2.getPointY())
                + "),(" + String.format("%.2f", p3.getPointX())
                + "," + String.format("%.2f", p3.getPointY())
                + ")]";
    }
}
