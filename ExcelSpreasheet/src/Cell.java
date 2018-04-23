
/*
This is the generic Cell class, where most of the programming for a cell is done.
The rest of the Cell classes are extended from this class, and inherit its properties.


*/

import java.util.Scanner;

public class Cell {


    public static final String EMPTY_CELL = "            ";

    private String contents;


    public Cell() {
         contents = EMPTY_CELL;


    }
    public Cell(String data){

    }


    public void emptyCell(int RowPos, int ColPos) {


    }
}
