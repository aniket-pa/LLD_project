package TicTacToc.Stratgery;

import TicTacToc.modules.Cell;
import TicTacToc.modules.Game;
import TicTacToc.modules.GameState;
import TicTacToc.modules.Player;

import java.util.List;

public class DiagonalWiseWinStragtery implements WinningStragtery{


    /**
     * @param game 
     * @param row
     * @param playingPlayer
     * @return
     */
    @Override
    public void win(Game game, Integer row, Integer col, Player playingPlayer) {

        List<List<Cell>> grid = game.getBoard().getGrid();
        boolean flag = true;

        if( Math.abs(row - col) == (game.getBoard().getSize()-1)  ){

            for(int j = game.getBoard().getSize()-1, i= 0  ; j >= 0  ;  j--, i++){

                Cell cellValue = grid.get(i).get(j);
                if(cellValue.getSymbol() != playingPlayer.getSymbol() )
                {
                    flag=false;
                    break;
                }

            }

            if (flag){
                game.setGameState(GameState.COMPLETED);
                game.setWinner(playingPlayer);
            }

        } else if (row.equals(col)) {

            for(int i=0 ; i <game.getBoard().getSize(); i++){

                Cell cellValue = grid.get(i).get(i);
                if(cellValue.getSymbol() != playingPlayer.getSymbol() )
                {
                    flag=false;
                    break;
                }

            }

            if (flag){
                game.setGameState(GameState.COMPLETED);
                game.setWinner(playingPlayer);
            }

        }




    }
}
