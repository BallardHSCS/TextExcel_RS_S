
public class SpreadSheet {
    public static final int SHEET_HEIGHT = 10;
    public static final int SHEET_WIDTH = 7;
    private int letterA = 'A';

    private Cell[][] cellArray;

    public SpreadSheet() {
        cellArray = new Cell[SHEET_HEIGHT][SHEET_WIDTH];
        for (int rPos = 0; rPos < SHEET_HEIGHT; rPos++) {

            for (int cPos = 0; cPos < SHEET_WIDTH; cPos++) {


                cellArray[rPos][cPos] = new Cell();
                cellArray[rPos][cPos].equals("           |");


            }
        }
    }

    public String toString() {
        String sheetPrint = "";
        String nextRow = "------------+------------+------------+------------+------------+------------+------------+------------+\n";
        sheetPrint += "            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |\n" + nextRow;
        for (int rPos = 0; rPos < SHEET_HEIGHT; rPos++) {
            if (rPos >= 9) {
                sheetPrint += "     " + (rPos + 1) + "     |";
            } else {
                sheetPrint += "     " + (rPos + 1) + "      |";
            }
            for (int cPos = 0; cPos < SHEET_WIDTH; cPos++) {

                sheetPrint += cellArray[rPos][cPos].printToSpreadsheet();
                sheetPrint+="|";

            }
            sheetPrint += "\n";
            sheetPrint += nextRow;
        }


        return sheetPrint;
    }


    public void clear() {

        for (int let = 0; let < SHEET_HEIGHT; let++) {
            for (int num = 0; num < SHEET_WIDTH; num++) {
                cellArray[let][num].equals(Cell.EMPTY_CELL);

            }
        }


    }
    /**
     * Takes input from TextExcel and returns cell locations
     * for the main method to use when exchanging data with the Cell class
     * @param input
     */
   public void setCell(String input){
       String[] user_input_parts = input.split(" ");
       String cellName = user_input_parts[0];
       String data = user_input_parts[2];
       char letter = cellName.charAt(0);
       int number = Integer.parseInt(cellName.substring(1));
       int thisChar = letter - letterA;
        for(int row = 0; row<){}

}








}