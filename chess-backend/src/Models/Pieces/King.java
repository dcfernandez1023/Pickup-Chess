package Models.Pieces;

public class King extends Piece {
    public King(int[] pos, int color, String name, String initial)
    {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos, Piece[][] board) {
        return false;
    }
}
