package com.flavio.chesssystem.boardgame;

public class Piece {

    protected Positon positon;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        positon = null;
    }

    protected Board getBoard() {
        return board;
    }
}
