package Models.Game;

import Models.Pieces.Piece;
import Models.Pieces.PieceFactory;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ChessGame {

    private Piece[][] board;
    private ArrayList<Piece> eatenWhitePieces;
    private ArrayList<Piece> eatenBlackPieces;
    private int playerTurn; // 0 for white, 1 for black
    private PieceFactory pieceFactory;

    public ChessGame() {
        initializeGame();
    }

    // prints board
    public void printBoard() {
        String display = "";
        for(int i = 0; i < this.board.length; i++) {
            Piece[] row = this.board[i];
            for(int j = 0; j < row.length; j++) {
                if(row[j] == null)
                    display += "  ";
                else
                    display += row[j].getInitial() + " ";
            }
            display += "\n";
        }
        System.out.println(display);
    }

    // initializes data members
    private void initializeGame() {
        this.initializeBoard();
        this.eatenWhitePieces = new ArrayList<>(16); // eliminated white pieces
        this.eatenBlackPieces = new ArrayList<>(16); // eliminated black pieces
        this.playerTurn = 0; // set player's turn to white
    }

    // initializes board with ChessPiece objects
    private void initializeBoard() {
        this.board = new Piece[8][8]; // 8x8 board
        this.pieceFactory = new PieceFactory(); // factory to generate pieces
        ArrayList<Piece> pieces = this.pieceFactory.createAllPieces(); // pieces currently on the board
        for(int i = 0; i < pieces.size(); i++) {
            Piece piece = pieces.get(i);
            int[] pos = piece.getInitialPosition();
            this.board[pos[0]][pos[1]] = piece;
        }
    }
}
