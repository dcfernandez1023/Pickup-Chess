package Models.Pieces;

public class Horse extends Piece {
    public Horse(int[] pos, int color, String name, String initial) {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos, Piece[][] board) {
        return false;
    }
}
