package Models.Pieces;

public class Pawn extends Piece {
    public Pawn(int[] pos, int color, String name, String initial) {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos) {
        return false;
    }
}
