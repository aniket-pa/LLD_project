package TicTacToc.controller;

import TicTacToc.Stratgery.WinningStragtery;
import TicTacToc.modules.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {


    public static Game startGame(Integer dimension, List<Player> players, List<WinningStragtery> winningStragteryList){

        return  Game.createGameBuilderInstance()
                .setGameBuilderBoard(dimension)
                .setPlayers(players)
                .setWinningStragteries(winningStragteryList)
                .build();
    }

    public void drawMatrix(Game game){
        game.drawMatrix(game);
    }

    public void makeMove(Game game, Scanner sc){

        game.makeMove(game, sc);

    }

    public GameState getGameState(Game game){
        return game.getGameState();
    }
}
