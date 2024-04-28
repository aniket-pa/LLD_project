package TicTacToc.modules;

public class Symbol {

    Character symbol;
    String color;

    public Symbol(Character symbol, String color){
        this.symbol = symbol;
        this.color = color;
    }
    public Character getSymbol() {
        if (this.symbol != null){
            return symbol;
        }
        return null;
    }

    public void setSymbol(Character symbol) {
        this.symbol = symbol;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
