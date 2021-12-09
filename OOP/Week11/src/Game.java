import java.util.ArrayList;
import java.util.List;

public class Game {
    private Board board;
    private final ArrayList<Move> moveHistory = new ArrayList<>();

    public Game(Board board) {
        this.board = board;
    }

    /**
     * move.
     */
    public void movePiece(Piece piece, int x, int y) {
        if (piece.canMove(board, x, y)) {
            Piece p = board.getAt(x, y);
            if (p != null) {
                Move move = new Move(piece.getCoordinatesX(),
                        x, piece.getCoordinatesY(), y, piece, p);
                moveHistory.add(move);
                board.removeAt(x, y);
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
            } else {
                piece.setCoordinatesX(x);
                piece.setCoordinatesY(y);
                Move move = new Move(piece.getCoordinatesX(), x,
                        piece.getCoordinatesY(), y, piece);
                moveHistory.add(move);
            }
        }
    }


    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public ArrayList<Move> getMoveHistory() {
        return moveHistory;
    }

}
