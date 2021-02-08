package Models.Pieces;

public class Queen extends Piece {
    public Queen(int[] pos, String color, String name, String initial)
    {
        super(pos, color, name, initial);
    }

    @Override
    public boolean isValidMove(int[] newPos) {
        return false;
    }
}
