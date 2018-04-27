
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

    /**
     * Overloads string data in order to rewrite contents to be called by print method
     *@param data it the fraction from the constructor
     * **/
    public Cell(String data){
        contents = data;
    }


    public String printToSpreadsheet(){
        return formatCell(contents);
    }


    public String formatCell(String input){
        int format = EMPTY_CELL.length();
        int formatdif = format - input.length();
        for(int i = 0; i< formatdif; i++ ){
            input += " ";

        }
        String formatted = input;

        return formatted;
    }
}


