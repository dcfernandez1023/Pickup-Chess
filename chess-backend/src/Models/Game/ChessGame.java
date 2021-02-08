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

    /*
        * moves a piece on the board from curPos to newPos
        * throws exception if newPos is invalid or it is not the turn of the specified player
    */
    public void makeMove(int player, int[] curPos, int[] newPos) throws Exception {
        Piece piece = this.board[curPos[0]][curPos[1]];
        if(player != this.playerTurn || player != piece.getColor()) {
            throw new Exception("InvalidMove: Wrong player's move");
        }
        if(this.isValidPlacement(newPos) && piece.isValidMove(newPos)) {
            this.board[newPos[0]][newPos[1]] = piece;
            piece.setCurrentPosition(newPos[0], newPos[1]);
            if(this.playerTurn == 0) {
                this.playerTurn = 1;
            }
            else if(this.playerTurn == 1) {
                this.playerTurn = 0;
            }
        }
        else {
            throw new Exception("InvalidMove: Invalid movement for " + piece.getName());
        }
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }

    public void setEatenWhitePieces(ArrayList<Piece> eatenWhitePieces) {
        this.eatenWhitePieces = eatenWhitePieces;
    }

    public void setEatenBlackPieces(ArrayList<Piece> eatenBlackPieces) {
        this.eatenBlackPieces = eatenBlackPieces;
    }

    public void setPlayerTurn(int playerTurn) {
        this.playerTurn = playerTurn;
    }

    public void setPieceFactory(PieceFactory pieceFactory) {
        this.pieceFactory = pieceFactory;
    }

    public Piece[][] getBoard() {
        return this.board;
    }

    public ArrayList<Piece> getEatenWhitePieces() {
        return this.eatenWhitePieces;
    }

    public ArrayList<Piece> getEatenBlackPieces() {
        return this.eatenBlackPieces;
    }

    public int getPlayerTurn() {
        return this.playerTurn;
    }

    public PieceFactory getPieceFactory() {
        return this.pieceFactory;
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
            if(i != this.board.length - 1) {
                display += "\n";
            }
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

    // returns true if there is no piece on the specified position, false otherwise
    private boolean isValidPlacement(int[] newPos) {
        if(this.board[newPos[0]][newPos[1]] == null) {
            return true;
        }
        return false;
    }
}
