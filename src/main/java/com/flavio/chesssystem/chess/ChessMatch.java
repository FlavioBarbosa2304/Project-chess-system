package com.flavio.chesssystem.chess;

import com.flavio.chesssystem.boardgame.Board;
import com.flavio.chesssystem.boardgame.Piece;
import com.flavio.chesssystem.boardgame.Position;
import com.flavio.chesssystem.chess.pieces.King;
import com.flavio.chesssystem.chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public  ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for (int i=0; i<board.getRows(); i++){
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return mat;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, Color.WHITE), new Position(0, 3));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 3));
        board.placePiece(new King(board, Color.WHITE), new Position(7, 3));
    }
}
