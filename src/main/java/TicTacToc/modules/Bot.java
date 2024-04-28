package TicTacToc.modules;

public class Bot extends  Player{

    BotDifficulityType botDifficulityType;

    public Bot(Integer id , String name, Symbol symbol , PlayerType playerType ,BotDifficulityType botDifficulityType){
        super(id,name,symbol,playerType);
        this.botDifficulityType = botDifficulityType;
    }

    public BotDifficulityType getBotDifficulityType() {
        return botDifficulityType;
    }

    public void setBotDifficulityType(BotDifficulityType botDifficulityType) {
        this.botDifficulityType = botDifficulityType;
    }
}
