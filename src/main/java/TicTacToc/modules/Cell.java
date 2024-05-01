package TicTacToc.modules;

public class Cell {

    Integer row;
    Integer col;

    Symbol symbol;

    CellState cellState;

    public  Cell(Integer row, Integer col){
        this.row = row;
        this.col =  col;
        this.symbol = null;
        this.cellState = CellState.EMPTY;
    }


    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCol() {
        return col;
    }

    public void setCol(Integer col) {
        this.col = col;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }
}
