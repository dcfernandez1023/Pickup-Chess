package Models.Pieces;

public class Horse extends Piece {
    public Horse(int[] pos, String color, String name, String initial) {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos) {
        return false;
    }
}
