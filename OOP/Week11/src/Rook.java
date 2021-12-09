import java.util.List;

public class Rook extends Piece {

    public Rook(int x, int y) {
        super(x, y);
    }

    public Rook(int x, int y, String color) {
        super(x, y, color);
    }

    public String getSymbol() {
        return "R";
    }


    /**
     * xet theo toa do Oxy.
     */
    public boolean canMove(Board board, int x, int y) {
        List<Piece> pieces = board.getPieces();
        if (getCoordinatesX() != x && getCoordinatesY() != y) {
            return false;
        }
        if (getCoordinatesX() == x) {
            for (Piece piece : pieces) {
                if (piece.getCoordinatesX() == x) {
                    if ((piece.getCoordinatesY() > getCoordinatesY()
                            && piece.getCoordinatesY() < y)
                            || (piece.getCoordinatesY() < getCoordinatesY()
                            && piece.getCoordinatesY() > y)) {
                        return false;
                    } else if (piece.getCoordinatesY() == y
                            && piece.getColor().equals(getColor())) {
                        return false;
                    }
                }
            }
        } else if (getCoordinatesY() == y) {
            for (Piece piece : pieces) {
                if (piece.getCoordinatesY() == y) {
                    if ((piece.getCoordinatesX() > getCoordinatesX()
                            && piece.getCoordinatesX() < x)
                            || (piece.getCoordinatesX() < getCoordinatesX()
                            && piece.getCoordinatesX() > x)) {
                        return false;
                    } else if (piece.getCoordinatesX() == x
                            && piece.getColor().equals(getColor())) {
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
