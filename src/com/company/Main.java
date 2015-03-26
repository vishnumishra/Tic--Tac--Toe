package com.company;

public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        new Banner().showInstruction();
        game.initBoard();
        System.out.println(GameBoard.getBoard(game.getBoard()));
        game.play();
    }
}
