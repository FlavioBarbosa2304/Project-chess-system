package com.flavio.chesssystem.chess;

import com.flavio.chesssystem.boardgame.Board;
import com.flavio.chesssystem.boardgame.Piece;

public class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
