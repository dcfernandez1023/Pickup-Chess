package Controllers.Game;

import Models.Game.ChessGame;

public class GameController {

    private ChessGame game;

    public GameController() {
        this.game = new ChessGame();
    }

    /*
        * makes a move on the board for the specified player
        * Params:
            * playerTurn: player making the move - 0 for white, 1 for black
            * curPos: current position of the piece to be moved
            * newPos: new position of the piece to be moved
        * throws exception if the move is invalid or it is not the turn of the player making the move
    */
    public void playerMove(int player, int[] curPos, int[] newPos) throws Exception {
        this.game.makeMove(player, curPos, newPos);
    }

    public void displayBoard() {
        this.game.printBoard();
    }

    public int getPlayerTurn() {
        return this.game.getPlayerTurn();
    }
}
