package com.flavio.chesssystem.chess.pieces;

import com.flavio.chesssystem.boardgame.Board;
import com.flavio.chesssystem.chess.ChessPiece;
import com.flavio.chesssystem.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
}
