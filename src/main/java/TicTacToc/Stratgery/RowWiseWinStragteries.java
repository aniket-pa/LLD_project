package TicTacToc.Stratgery;

import TicTacToc.modules.Cell;
import TicTacToc.modules.Game;
import TicTacToc.modules.GameState;
import TicTacToc.modules.Player;

import java.util.List;

public class RowWiseWinStragteries implements WinningStragtery{


    /**
     *
     */
    @Override
    public void win(Game game, Integer row, Integer col ,Player player) {

        List<List<Cell>> grid = game.getBoard().getGrid();
        List<Cell> columnData = grid.get(row);

        boolean flag = true;
        for(Cell cell : columnData){

            if(player.getSymbol() != cell.getSymbol()){
                flag = false;
                break;
            }
        }


        if (flag){
            game.setGameState(GameState.COMPLETED);
            game.setWinner(player);
        }

    }


}
