package com.company;

import java.util.Map;

public class GameBoard {
    public static String getBoard(Map<Integer, String> board) {
        String gameBoard = "";
        for (Integer coordinate : board.keySet()) {
            gameBoard += board.get(coordinate);
            if(coordinate % 3 ==0) gameBoard += System.lineSeparator();
        }
        return gameBoard;
    }
}
