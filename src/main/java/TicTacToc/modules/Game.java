package TicTacToc.modules;

import TicTacToc.Stratgery.RowWiseWinStragteries;
import TicTacToc.Stratgery.WinningStragtery;

import java.util.*;

public class Game{

    Board board;

    List<Player> players;

    Integer nextPlayerId;

    List<Move> moves;

    GameState gameState;

    Player winner;

    List<WinningStragtery> winningStragteries;


    private Game(int size, List<Player> players, List<WinningStragtery> winningStragteryList){
        this.board =  new Board(size);
        this.players =  players;
        this.winningStragteries =  winningStragteryList;
        this.nextPlayerId = 0;
        this.gameState = GameState.INPROGRESS;
        this.moves = null;
    }


    public static class GameBuilder{
        Integer dimension;

        List<Player> players;

        List<WinningStragtery> winningStragteries;


        public GameBuilder setGameBuilderBoard(Integer dimension) {
            this.dimension = dimension;
            return this;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public GameBuilder setWinningStragteries(List<WinningStragtery> winningStragteries) {
            this.winningStragteries = winningStragteries;

            return  this;
        }

        void dimensionValidation(Integer dimension, Integer playerCount){
            if (dimension <= playerCount ) {
                throw  new RuntimeException("Players should be one less than dimensions");
            } else {
                if (dimension-1 == playerCount){
                    System.out.println("Good to go");
                }
                else {
                    throw  new RuntimeException("Dimension is: "+dimension+" playerCount :"+playerCount+"Players should be one less than dimensions ");
                }
            }
        }

        void botPlayerCount(List<Player> players){
            int botCount =0;
            for(Player player: players){
                if (botCount > 1){
                    throw  new RuntimeException("There should be only one Bot");
                }
               if(player.playerType.equals(PlayerType.BOT))
               {
                   botCount +=1;
               }
            }
        }

        void symbolValidation(List<Player> players){
            Set<Character> symbols = new HashSet<>();

            for(Player player: players){
                if (symbols.contains(player.symbol.symbol)){
                    throw  new RuntimeException("No Two symbols should be same");
                }
                else {
                    symbols.add(player.symbol.symbol);
                }
            }

        }

        void playerInputValidation(GameBuilder gameBuilder){

            Integer playerCount = gameBuilder.players.size();
            System.out.println("Player count"+playerCount);
            dimensionValidation(gameBuilder.dimension, playerCount);
            botPlayerCount(gameBuilder.players);
            symbolValidation(gameBuilder.players);
        }

        public  Game build(){

            playerInputValidation(this);

            return  new Game(this.dimension,this.players,this.winningStragteries);
        }
    }


    public static GameBuilder createGameBuilderInstance(){

        return  new GameBuilder();
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getNextPlayerId() {
        return nextPlayerId;
    }

    public void setNextPlayerId(Integer nextPlayerId) {
        this.nextPlayerId = nextPlayerId;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public  void drawMatrix(Game game){
        game.board.drawBoard();
    }

    public  Player getPlayingPlayer(){

        for (Player player : players){
            if (player.getId().equals(this.nextPlayerId)){
                return player;
            }
        }

        return null;
    }

    public  void  makeMove(Game game){
        Player playingPlayer = getPlayingPlayer();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the next Move");
        System.out.println("Please enter the row number");
        Integer rowNum = sc.nextInt();
        System.out.println("Please enter the column number");
        Integer colNum = sc.nextInt();

        WinningStragtery rowWise = new RowWiseWinStragteries();



    }
}