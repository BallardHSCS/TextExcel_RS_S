public class SpreadSheet {
    public static final int SHEET_HEIGHT = 10;
    public static final int SHEET_WIDTH = 7;

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

                sheetPrint += "            |";
                cellArray[rPos][cPos].equals("            ");

            }
            sheetPrint += "\n";
            sheetPrint += nextRow;
        }


        return sheetPrint;
    }

    public static String print() {
        for (int let = 0; let < SHEET_HEIGHT; let++) {
            for (int num = 0; num < SHEET_WIDTH; num++) {
                this.cellArray[let][num]
            }
        }


        return "";
    }

    public void clear() {

        for (int let = 0; let < SHEET_HEIGHT; let++) {
            for (int num = 0; num < SHEET_WIDTH; num++) {
                cellArray[let][num].equals(Cell.EMPTY_CELL);

            }
        }


    }
}