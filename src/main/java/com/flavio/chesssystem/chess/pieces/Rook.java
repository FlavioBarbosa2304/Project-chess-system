package com.flavio.chesssystem.chess.pieces;

import com.flavio.chesssystem.boardgame.Board;
import com.flavio.chesssystem.chess.ChessPiece;
import com.flavio.chesssystem.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
