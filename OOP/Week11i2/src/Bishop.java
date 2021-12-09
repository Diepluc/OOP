import java.util.List;

public class Bishop extends Piece {
    public Bishop(int x, int y) {
        super(x, y);
    }

    public Bishop(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "B";
    }

    /**
     * kiem tra.
     */
    public boolean canMove(Board board, int x, int y) {
        int x1 = getCoordinatesX();
        int y1 = getCoordinatesY();
        List<Piece> pieces = board.getPieces();
        if (Math.abs((x1 - x)) != Math.abs((y1 - y))) {
            return false;
        }
        if (x == x1 && y == y1) {
            return false;
        }


        for (Piece piece : pieces) {
            int x2 = piece.getCoordinatesX();
            int y2 = piece.getCoordinatesY();
            if (Math.abs((x2 - x1)) == Math.abs((y2 - y1))) {
                if (x2 == x && y2 == y && piece.getColor().equals(getColor())) {
                    return false;
                }

                if (x < x1 && y > y1) {
                    if (x2 < x1 && y2 > y1 && y2 < y) {
                        return false;
                    }
                }

                if (x < x1 && y < y1) {
                    if (x2 < x1 && y2 < y1 && y2 > y) {
                        return false;
                    }
                }

                if (x > x1 && y > y1) {
                    if (x2 > x1 && y2 > y1 && y2 < y) {
                        return false;
                    }
                }

                if (x > x1 && y < y1) {
                    if (x2 > x1 && y2 < y1 && y2 > y) {
                        return false;
                    }
                }
            }
        }
        return true;
    }


    /**
     * kiem tra va cham.
     */
    public boolean checkPosition(Piece p) {
        if (getCoordinatesX() == p.getCoordinatesX() && getCoordinatesY() == p.getCoordinatesY()) {
            return true;
        }
        return false;
    }
}
