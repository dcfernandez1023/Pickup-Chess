package Models.Pieces;

public class Bishop extends Piece {
    public Bishop(int[] pos, String color, String name, String initial) {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos) {
        return false;
    }
}
