public abstract class Piece {
    private int coordinatesX;
    private int coordinatesY;
    private String color;

    /**
     * khoi toa.
     */
    public Piece(int x, int y) {
        if (1 <= x && x <= 8) {
            this.coordinatesX = x;
        }
        if (1 <= y && y <= 8) {
            this.coordinatesY = y;
        }
    }

    /**
     * khoi toa.
     */
    public Piece(int x, int y, String color) {
        if (1 <= x && x <= 8) {
            this.coordinatesX = x;
        }
        if (1 <= y && y <= 8) {
            this.coordinatesY = y;
        }
        if (color.equals("black")) {
            this.color = color;
        } else {
            this.color = "white";
        }
    }


    public int getCoordinatesX() {
        return coordinatesX;
    }

    public void setCoordinatesX(int coordinatesX) {
        this.coordinatesX = coordinatesX;
    }

    public int getCoordinatesY() {
        return coordinatesY;
    }

    public void setCoordinatesY(int coordinatesY) {
        this.coordinatesY = coordinatesY;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char convertCoordinates(int x) {
        String str = "abcdefgh";
        return str.charAt(x - 1);
    }

    public abstract String getSymbol();

    public abstract boolean canMove(Board board, int x, int y);

    public abstract boolean checkPosition(Piece p);
}
