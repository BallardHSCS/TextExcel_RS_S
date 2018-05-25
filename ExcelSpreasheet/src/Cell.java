
/*
This is the generic Cell class, where most of the programming for a cell is done.
The rest of the Cell classes are extended from this class, and inherit its properties.


*/

import java.util.Scanner;

public class Cell {


    public static final String EMPTY_CELL = "            ";
    private FormulaCell operations;
    private String contents;


    public Cell() {
        contents = EMPTY_CELL;


    }

    /**
     * Overloads string data in order to rewrite contents to be called by print method
     *
     * @param data it the fraction from the constructor
     **/
    public Cell(String data) {

        contents = data;
    }

    /**
     * This method, is for accessing the contents of cells, so that it can be printed in the board.
     *
     * @return returns the contents of the formatted cell.
     */
    public String printToSpreadsheet() {


        return formatCell(contents);

    }

    /**
     * The formatCell method is for making sure that the user input is valid input.
     * It helps keep the board from crashing.
     *
     * @param input requires user input in a string
     * @return returnes a new formatted cell
     */

    //TODO: Make it so that if @param input.length() > 12, the cell will not be accepted and a message will be printed to the user
    public String formatCell(String input) {

        String formatted = input;
        int format = EMPTY_CELL.length();
        int formatdif = format - input.length();
        if ((formatdif < 0)) {
            System.out.println(formatdif);
            formatted = formatted.substring(0,(formatted.length() - Math.abs(formatdif)-1));
            formatted += ">";

        } else if (input.length() < format) {
            if (input.length() % 2 == 0) {
                for (int numSpaces = 0; numSpaces < formatdif / 2; numSpaces++) {
                    formatted = " " + formatted;
                }
                for (int afterSpaces = 0; afterSpaces < (formatdif / 2); afterSpaces++) {
                    formatted = formatted + " ";
                }
            } else {
                for (int numSpaces = 0; numSpaces < formatdif / 2; numSpaces++) {
                    formatted = " " + formatted;
                }
                for (int afterSpaces = 0; afterSpaces < (formatdif / 2) + 1; afterSpaces++) {
                    formatted = formatted + " ";
                }
            }


        }


        return formatted;
    }



}


