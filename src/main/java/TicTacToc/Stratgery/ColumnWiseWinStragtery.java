package TicTacToc.Stratgery;

import TicTacToc.modules.Cell;
import TicTacToc.modules.Game;
import TicTacToc.modules.GameState;
import TicTacToc.modules.Player;

import java.util.List;

public class ColumnWiseWinStragtery implements  WinningStragtery{


    @Override
    public void win(Game game, Integer row, Integer col, Player playingPlayer) {

        boolean flag = true;
        for(int i=0 ; i< game.getBoard().getSize(); i++){

            Cell rowData = game.getBoard().getGrid().get(i).get(col);

            if(playingPlayer.getSymbol() != rowData.getSymbol()){
                flag = false;
                break;
            }

        }

        if (flag){
            game.setGameState(GameState.COMPLETED);
            game.setWinner(playingPlayer);
        }
    }

}
