package TicTacToc;

import TicTacToc.Stratgery.ColumnWiseWinStragtery;
import TicTacToc.Stratgery.DiagonalWiseWinStragtery;
import TicTacToc.Stratgery.RowWiseWinStragteries;
import TicTacToc.Stratgery.WinningStragtery;
import TicTacToc.Utils.RandomColorGenerator;
import TicTacToc.controller.GameController;
import TicTacToc.modules.*;

import java.util.*;

class  Client{

    public static Boolean checkDuplicateSymbol(Set<Character> symbolsSet , Character botPlayingSymbol){
            if(symbolsSet.contains(botPlayingSymbol)){
                System.out.println("Symbol is already selected");
                return  Boolean.FALSE;
            }
            else {
                symbolsSet.add(botPlayingSymbol);
                return  Boolean.TRUE;
            }
    }
    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("Do you want to Start the game Y/N");
        char gameStart = sc.nextLine().charAt(0);

        if (Character.toLowerCase(gameStart) != 'y'){
            sc.close();
            return;
        }

        List<Player> players = new ArrayList<>();
        int playerId = 123;

        System.out.println("Enter the size of matrix");
        Integer gridSize = sc.nextInt();

        Set<Character> symbolsSet =  new HashSet<>();

        while(true) {
            System.out.print("To continue selecting players press ENTER to START the game enter 'start' ");
            String input = sc.nextLine();

            if(input.equals("start")){
               break;
            }

            System.out.println("Do you want Bot Player Yes / no:");
            String botPlayer = sc.nextLine();
            System.out.println("Player selected: "+botPlayer);

            if (botPlayer.toLowerCase().equals("yes")) {
                System.out.println(" What should be the Bot playing Stragtery EASY, MEDIUM OR HARD");
                String botPlayerStragtery = sc.nextLine();
                System.out.println("Given name to Bot");
                String botName = sc.nextLine();

                char botPlayingSymbol;

                while(true){
                    System.out.println("Select symbol for player");
                    botPlayingSymbol = sc.nextLine().charAt(0);

                    if(symbolsSet.contains(botPlayingSymbol)){
                        System.out.println("Symbol is already selected");
                        continue;
                    }
                    else {
                        symbolsSet.add(botPlayingSymbol);
                        break;
                    }
                }
                Symbol symbol = new Symbol(botPlayingSymbol, RandomColorGenerator.generateRandomColor());
                playerId+=1;
                Player botPlayerDetails = new Player(playerId, botName, symbol, PlayerType.BOT);

                players.add(botPlayerDetails);
            } else {
                System.out.println("Enter the name of the Player");
                String botName = sc.nextLine();
                char botPlayingSymbol;

                while(true){
                    System.out.println("Select symbol for player");
                    botPlayingSymbol = sc.nextLine().charAt(0);

                    if(symbolsSet.contains(botPlayingSymbol)){
                        System.out.println("Symbol is already selected");
                        continue;
                    }
                    else {
                        symbolsSet.add(botPlayingSymbol);
                        break;
                    }
                }
                Symbol symbol = new Symbol(botPlayingSymbol, RandomColorGenerator.generateRandomColor());
                playerId+=1;
                Player botPlayerDetails = new Player(playerId, botName, symbol, PlayerType.HUMAN);
                players.add(botPlayerDetails);
            }

        }

        List<WinningStragtery> winningStrategy = new ArrayList<>();

        HashMap<String, WinningStragtery> strategies = new HashMap<>();
        strategies.put("row", new RowWiseWinStragteries());
        strategies.put("col", new ColumnWiseWinStragtery());
        strategies.put("diagonal", new DiagonalWiseWinStragtery());


        System.out.println("Please select winning strategy, it can be single or multiple ");
        System.out.println("Menu are as follow 1: row , 2:col, 3: diagonal , 4:all , 5:stop ");

        while (true){
            System.out.println("Please enter strategy to continue and 'stop' to STOP ");
            String step = sc.nextLine();
            step = step.toLowerCase();
            if(step.equals("stop")){
              break;
            }

            if (step.equals("all")){
                strategies.forEach( (key,value)-> winningStrategy.add((value)) );
                break;
            }

            winningStrategy.add(strategies.get(step));
        }


        GameController gameController =  new GameController();

        Game game = GameController.startGame(gridSize,players, winningStrategy);


        while (gameController.getGameState(game).equals(GameState.INPROGRESS)){
            gameController.drawMatrix(game);
            try {
               gameController.makeMove(game, sc);

            }
            catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        }

        gameController.drawMatrix(game);

        if (gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game is Draw");
        } else if (gameController.getGameState(game).equals(GameState.COMPLETED)) {
            System.out.println("Winner of the Game is"+game.getPlayingPlayer().getName() );
        }




    }

}