package Models.Pieces;

public class Rook extends Piece {
    public Rook(int[] pos, int color, String name, String initial) {
        super(pos, color, name, initial);
    }

    /*
        * validates the movement of the rook
        * returns true if valid, false otherwise
    */
    @Override
    public boolean isValidMove (int[] newPos, Piece[][] board) {
        /*
            * Cases for move being invalid (e.g. doesn't align with rook's movement on the board):
                * Case 1: rook moves out of the board (row < 0, row > 7 or col < 0, col > 7)
                * Case 2: rook moves in a diagonal (both the row AND the col increments or decrements)
                * Case 3: rook moves past another piece that is blocking it
        */

        // CASE 1
        if(this.isOutOfBoard(newPos)) {
            return false;
        }
        // CASE 2
        if(newPos[0] - this.currentPosition[0] != 0 && newPos[1] - this.currentPosition[1] != 0) {
            return false;
        }
        // CASE 3
        // check if piece is blocking it in horizontal direction
        int xStarting = this.currentPosition[0];
        int xEnding = newPos[0];
        int yStarting = this.currentPosition[1];
        int yEnding = newPos[1];
        if(xStarting < xEnding) {
            for(int i = xStarting; i <= xEnding; i++) {
                Piece pieceAtCurrentPos = board[this.currentPosition[0]][i];
                if(i == xEnding && pieceAtCurrentPos != null && this.color == pieceAtCurrentPos.color) {
                    return false;
                }
                if(pieceAtCurrentPos != null) {
                    return false;
                }
            }
        }
        else if(xStarting > xEnding) {
            for(int i = xStarting; i >= xEnding; i--) {
                Piece pieceAtCurrentPos = board[this.currentPosition[0]][i];
                if(i == xEnding && pieceAtCurrentPos != null && this.color == pieceAtCurrentPos.color) {
                    return false;
                }
                if(pieceAtCurrentPos != null) {
                    return false;
                }
            }
        }

        // check if piece is blocking it in the vertical direction
        if(yStarting < yEnding) {
            for(int i = yStarting; i <= yEnding; i++) {
                Piece pieceAtCurrentPos = board[i][this.currentPosition[1]];
                if(i == yEnding && pieceAtCurrentPos != null && this.color == pieceAtCurrentPos.color) {
                    return false;
                }
                if(pieceAtCurrentPos != null && i != yEnding) {
                    return false;
                }
            }
        }
        else if(yStarting > yEnding) {
            for(int i = yStarting; i >= yEnding; i--) {
                Piece pieceAtCurrentPos = board[i][this.currentPosition[1]];
                if(i == yEnding && pieceAtCurrentPos != null && this.color == pieceAtCurrentPos.color) {
                    return false;
                }
                if(pieceAtCurrentPos != null) {
                    return false;
                }
            }
        }
        return true;
    }
}
