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
            System.out.print("To continue press ENTER to stop write 'stop' ");
            String input = sc.nextLine();

            if(input.equals("stop")){
                sc.close();
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

        sc.close();


//        List<Player> players = new ArrayList<>();
//        players.add( new Player(123, "Aniket", new Symbol('#',"#fff"), PlayerType.HUMAN) );
//        players.add(new Player(124, "Tejas", new Symbol('O',"#FFA500"), PlayerType.BOT ));
//
//
        GameController gameController =  new GameController();

        List<WinningStragtery> winningStragteries = new ArrayList<>();
        winningStragteries.add( new RowWiseWinStragteries());
        winningStragteries.add( new ColumnWiseWinStragtery());
        winningStragteries.add( new DiagonalWiseWinStragtery());

        Game game = GameController.startGame(3,players, winningStragteries);

        while (gameController.getGameState(game).equals(GameState.INPROGRESS)){
            gameController.drawMatrix(game);
            gameController.makeMove(game);
        }
//
        if (gameController.getGameState(game).equals(GameState.DRAW)){
            System.out.println("Game is Draw");
        } else if (gameController.getGameState(game).equals(GameState.COMPLETED)) {
            System.out.println("Winner of the Game is ");
        }


    }

}