package TicTacToc.Stratgery;

import TicTacToc.modules.Game;
import TicTacToc.modules.Player;

public interface WinningStragtery {

    public void win(Game game, Integer row, Integer col, Player playingPlayer);
}
