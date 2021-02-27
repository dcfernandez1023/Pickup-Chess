package Models.Pieces;

public class ChessPiece extends Piece {

    public ChessPiece(int[] pos, int color, String name, String initial) {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove (int[] newPos, Piece[][] board)  {
        return true;
    }
}
