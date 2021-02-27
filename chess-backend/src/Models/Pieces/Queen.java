package Models.Pieces;

public class Queen extends Piece {
    public Queen(int[] pos, int color, String name, String initial)
    {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos, Piece[][] board) {
        return false;
    }
}
