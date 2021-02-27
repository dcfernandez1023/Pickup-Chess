package Models.Pieces;

public class Bishop extends Piece {
    public Bishop(int[] pos, int color, String name, String initial) {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos, Piece[][] board)
    {
        return false;
    }
}
