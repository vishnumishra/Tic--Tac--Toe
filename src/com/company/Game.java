package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    public  Map<Integer,String> gameBoard = new HashMap<Integer, String>();

    public void initBoard() {
        gameBoard.put(1, "- ");
        gameBoard.put(2, "- ");
        gameBoard.put(3, "-");
        gameBoard.put(4, "- ");
        gameBoard.put(5, "- ");
        gameBoard.put(6, "-");
        gameBoard.put(7, "- ");
        gameBoard.put(8, "- ");
        gameBoard.put(9, "-");
    }

    public void play(){
        Integer count=0;
        String player1 = "X ";
        String player2 = "O ";
        initBoard();
        while (++count <=9){
            System.out.println("please enter the choice...");
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();
            if(count % 2 ==0)
               gameBoard.put(userChoice,player1);
            else gameBoard.put(userChoice,player2);
            System.out.println(GameBoard.getBoard(getBoard()));

        }
    }

    public  Map<Integer, String> getBoard() {
        return gameBoard;
    }


}
