package Models.Pieces;

public class Rook extends Piece {
    public Rook(int[] pos, String color, String name, String initial) {
        super(pos, color, name, initial);
    }

    /*
        * validates the movement of the rook
        * returns true if valid, false otherwise
    */
    @Override
    public boolean isValidMove (int[] newPos) {
        /*
            * Cases for move being invalid (e.g. doesn't align with rook's movement on the board):
                * Case 1: rook moves out of the board (row < 0, row > 7 or col < 0, col > 7)
                * Case 2: rook moves in a diagonal (both the row AND the col increments or decrements)
        */

        // case 1
        if(newPos[0] < 0 || newPos[0] > 7 || newPos[1] < 0 || newPos[1] > 7) {
            return false;
        }
        // case 2
        if(newPos[0] - this.currentPosition[0] != 0 && newPos[1] - this.currentPosition[1] != 0) {
            return false;
        }
        return true;
    }
}
