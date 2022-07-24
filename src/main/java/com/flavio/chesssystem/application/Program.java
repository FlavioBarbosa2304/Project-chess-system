package com.flavio.chesssystem.application;

import com.flavio.chesssystem.boardgame.Positon;
import com.flavio.chesssystem.chess.ChessMatch;
import com.flavio.chesssystem.chess.ChessPiece;

public class Program {
    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}
