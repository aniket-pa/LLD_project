package TicTacToc.modules;

import java.util.ArrayList;
import java.util.List;

public class  Board{

    Integer dimension;

    List<List<Cell>> grid;

    public Board(int size){
        this.dimension = size;
        this.grid =  new ArrayList<>();

        for(int i=0 ; i < dimension; i++){
            grid.add(new ArrayList<>());
           for(int j =0 ; j <dimension; j++){
               Cell cell = new Cell(i,j);
               grid.get(i).add(cell);
           }
        }

    }

    public Integer getSize() {
        return dimension;
    }

    public void setSize(Integer size) {
        this.dimension = size;
    }

    public List<List<Cell>> getGrid() {
        return grid;
    }

    public void setGrid(List<List<Cell>> grid) {
        this.grid = grid;
    }

    public  void drawBoard(){

        List<List<Cell>> matrix =  this.getGrid();
        int size = matrix.size();

        for (List<Cell> cellValue : matrix) {
            for (Cell cell : cellValue) {
                if (cell.getCellState() == CellState.EMPTY) {
                    System.out.print("| - ");
                } else {
                    char symbol = cell.getSymbol().getSymbol();
                    System.out.print(symbol);
                }
            }

            System.out.print("|");
            System.out.println();
        }
    }
}