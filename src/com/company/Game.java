package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    public  Map<Integer,String> gameBoard = new HashMap<Integer, String>();

    public void initBoard() {
        gameBoard.put(1, "- ");
        gameBoard.put(2, "- ");
        gameBoard.put(3, "- ");
        gameBoard.put(4, "- ");
        gameBoard.put(5, "- ");
        gameBoard.put(6, "- ");
        gameBoard.put(7, "- ");
        gameBoard.put(8, "- ");
        gameBoard.put(9, "- ");
    }


    public boolean isPlayerWin(String playerSymbol) {
        int[] diagonal1={1,5,9};
        int[] diagonal2={3,5,7};
        int[] r1={1,2,3};
        int[] r2={4,5,6};
        int[] r3={7,8,9};
        int[] c1={1,4,7};
        int[] c2={2,5,8};
        int[] c3={3,6,9};

        int[][] allConditions = {diagonal1,diagonal2,r1,r2,r3,c1,c2,c3};
        boolean win = true;
        for (int[] condition : allConditions) {
            for (int i : condition) {
                if(!gameBoard.get(i).equals(playerSymbol))
                    win = false;
            }
            if(win) return true;
            win = true;
        }
        return false;
    }

    public void play(){
        Integer count=1;
        String playerSymbol="";
        initBoard();
        while (count <=9){
            System.out.println("please enter the choice...");
            System.out.println("Play user "+getPlayerSymbol(count)+"\n");
            Scanner sc = new Scanner(System.in);
            int userChoice = sc.nextInt();
            if(gameBoard.get(userChoice).equals("- ")){
                playerSymbol =getPlayerSymbol(count);
                gameBoard.put(userChoice,playerSymbol);
                count++;
            }

            if(isPlayerWin(playerSymbol)){
                System.out.println("**************  Player " + playerSymbol + " Win ********************\n");
                System.out.println(GameBoard.getBoard(getBoard()));
                System.exit(0);
            }
            System.out.println(GameBoard.getBoard(getBoard()));
        }
        System.out.println("..............Game Dra .............");
    }

    private String getPlayerSymbol(Integer count) {
        return (count % 2 == 0)?"O ":"X ";
    }

    public  Map<Integer, String> getBoard() {
        return gameBoard;
    }


}
