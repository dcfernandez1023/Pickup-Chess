package Models.Pieces;

import java.util.ArrayList;

public class PieceFactory {

    //generate one piece
    public Piece createPiece(int[] pos, int color, String name, String initial) {
        return new ChessPiece(pos, color, name, initial);
    }

    // generate all pieces on a board
    public ArrayList<Piece> createAllPieces() {
        ArrayList<Piece> pieces = new ArrayList<>(32);

        /* MANUALLY GENERATE ALL PIECES */

        //white pieces
        Piece whiteRook1 = new Rook(new int[]{0, 0}, 0, "Rook", "R");
        Piece whiteHorse1 = new ChessPiece(new int[]{0, 1}, 0, "Horse", "H");
        Piece whiteBishop1 = new ChessPiece(new int[]{0, 2}, 0, "Bishop", "B");
        Piece whiteKing = new ChessPiece(new int[]{0, 3}, 0, "King", "K");
        Piece whiteQueen = new ChessPiece(new int[]{0, 4}, 0, "Queen", "Q");
        Piece whiteBishop2 = new ChessPiece(new int[]{0, 5}, 0, "Bishop", "B");
        Piece whiteHorse2 = new ChessPiece(new int[]{0, 6}, 0, "Horse", "H");
        Piece whiteRook2 = new Rook(new int[]{0, 7}, 0, "Rook", "R");
        pieces.add(whiteRook1);
        pieces.add(whiteHorse1);
        pieces.add(whiteBishop1);
        pieces.add(whiteKing);
        pieces.add(whiteQueen);
        pieces.add(whiteBishop2);
        pieces.add(whiteHorse2);
        pieces.add(whiteRook2);
        for(int i = 0; i < 8; i++) {
            Piece whitePawn = new ChessPiece(new int[]{1, i}, 0, "Pawn", "P");
            pieces.add(whitePawn);
        }

        //black pieces
        for(int i = 0; i < 8; i++) {
            Piece blackPawn = new ChessPiece(new int[]{6, i}, 1, "Pawn", "P");
            pieces.add(blackPawn);
        }
        Piece blackRook1 = new Rook(new int[]{7, 0}, 1, "Rook", "R");
        Piece blackHorse1 = new ChessPiece(new int[]{7, 1}, 1, "Horse", "H");
        Piece blackBishop1 = new ChessPiece(new int[]{7, 2}, 1, "Bishop", "B");
        Piece blackKing = new ChessPiece(new int[]{7, 3}, 1, "King", "K");
        Piece blackQueen = new ChessPiece(new int[]{7, 4}, 1, "Queen", "Q");
        Piece blackBishop2 = new ChessPiece(new int[]{7, 5}, 1, "Bishop", "B");
        Piece blackHorse2 = new ChessPiece(new int[]{7, 6}, 1, "Horse", "H");
        Piece blackRook2 = new Rook(new int[]{7, 7}, 1, "Rook", "R");
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
