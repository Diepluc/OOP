import java.util.ArrayList;

public class Board {
    public static final int WIDTH = 8;
    public static final int HEIGHT = 8;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public Board() {

    }

    /**
     * add.
     */
    public void addPiece(Piece p) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == p.getCoordinatesX()
                    && piece.getCoordinatesY() == p.getCoordinatesY()) {
                return;
            }
        }
        pieces.add(p);
    }

    /**
     * kiem tra dieu kien.
     */
    public boolean validate(int x, int y) {
        if (1 <= x && x <= 8 && 1 <= y && y <= 8) {
            return true;
        }
        return false;
    }

    /**
     * truy cap vi tri.
     */
    public void removeAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x
                    && piece.getCoordinatesY() == y) {
                pieces.remove(piece);
                return;
            }
        }
    }

    /**
     * truy cap vi tri.
     */
    public Piece getAt(int x, int y) {
        for (Piece piece : pieces) {
            if (piece.getCoordinatesX() == x
                    && piece.getCoordinatesY() == y) {
                return piece;
            }
        }
        return null;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(ArrayList<Piece> pieces) {
        this.pieces = pieces;
    }


}
