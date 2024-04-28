package TicTacToc.Stratgery;

import TicTacToc.modules.BotDifficulityType;

import javax.print.DocFlavor;

public class BotDifficulityFactoryMethod {

    public BotDifficulityStratergy botStargtery(BotDifficulityType botStargtery){

        if(botStargtery.equals(BotDifficulityType.EASY))
        {
            return  new EasyPlayingBotStratergy();
        } else if (botStargtery.equals(BotDifficulityType.MEDIUM)) {
            return  new MediumPlayingBotStartergy();
        } else if (botStargtery.equals(BotDifficulityType.HARD)) {
            return  new HardPlayingBotStartergy();
        }

        return  null;
    }
}
