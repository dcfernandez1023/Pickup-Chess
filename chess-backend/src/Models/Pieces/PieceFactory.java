package Models.Pieces;

import java.util.ArrayList;

public class PieceFactory {

    //generate one piece
    public Piece createPiece(int[] pos, String color, String name, String initial) {
        return new ChessPiece(pos, color, name, initial);
    }

    // generate all pieces on a board
    public ArrayList<Piece> createAllPieces() {
        ArrayList<Piece> pieces = new ArrayList<>(32);

        /* MANUALLY GENERATE ALL PIECES */

        //white pieces
        Piece whiteRook1 = new Rook(new int[]{0, 0}, "white", "Rook", "R");
        Piece whiteHorse1 = new ChessPiece(new int[]{0, 1}, "white", "Horse", "H");
        Piece whiteBishop1 = new ChessPiece(new int[]{0, 2}, "white", "Bishop", "B");
        Piece whiteKing = new ChessPiece(new int[]{0, 3}, "white", "King", "K");
        Piece whiteQueen = new ChessPiece(new int[]{0, 4}, "white", "Queen", "Q");
        Piece whiteBishop2 = new ChessPiece(new int[]{0, 5}, "white", "Bishop", "B");
        Piece whiteHorse2 = new ChessPiece(new int[]{0, 6}, "white", "Horse", "H");
        Piece whiteRook2 = new Rook(new int[]{0, 7}, "white", "Rook", "R");
        pieces.add(whiteRook1);
        pieces.add(whiteHorse1);
        pieces.add(whiteBishop1);
        pieces.add(whiteKing);
        pieces.add(whiteQueen);
        pieces.add(whiteBishop2);
        pieces.add(whiteHorse2);
        pieces.add(whiteRook2);
        for(int i = 0; i < 8; i++) {
            Piece whitePawn = new ChessPiece(new int[]{1, i}, "white", "Pawn", "P");
            pieces.add(whitePawn);
        }

        //black pieces
        for(int i = 0; i < 8; i++) {
            Piece blackPawn = new ChessPiece(new int[]{6, i}, "black", "Pawn", "P");
            pieces.add(blackPawn);
        }
        Piece blackRook1 = new Rook(new int[]{7, 0}, "black", "Rook", "R");
        Piece blackHorse1 = new ChessPiece(new int[]{7, 1}, "black", "Horse", "H");
        Piece blackBishop1 = new ChessPiece(new int[]{7, 2}, "black", "Bishop", "B");
        Piece blackKing = new ChessPiece(new int[]{7, 3}, "black", "King", "K");
        Piece blackQueen = new ChessPiece(new int[]{7, 4}, "black", "Queen", "Q");
        Piece blackBishop2 = new ChessPiece(new int[]{7, 5}, "black", "Bishop", "B");
        Piece blackHorse2 = new ChessPiece(new int[]{7, 6}, "black", "Horse", "H");
        Piece blackRook2 = new Rook(new int[]{7, 7}, "black", "Rook", "R");
        pieces.add(blackRook1);
        pieces.add(blackHorse1);
        pieces.add(blackBishop1);
        pieces.add(blackKing);
        pieces.add(blackQueen);
        pieces.add(blackBishop2);
        pieces.add(blackHorse2);
        pieces.add(blackRook2);

        return pieces;
    }
}
