/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import chess.ChessMatch;




/**
 *
 * @author Marcos Alexandre Pereira
 */
public class Program {

    public static void main(String[] args) {

       ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }

}
