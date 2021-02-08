package Models.Pieces;

public class King extends Piece {
    public King(int[] pos, String color, String name, String initial)
    {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos) {
        return false;
    }
}
