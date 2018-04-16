public class SpreadSheet {
    public static final int SHEET_HEIGHT = 10;
    public static final int SHEET_WIDTH = 7;

    private Cell[][] cellArray;

    public SpreadSheet() {
        cellArray = new Cell[SHEET_WIDTH][SHEET_HEIGHT];
        for (int rPos = 0; rPos <= SHEET_HEIGHT; rPos++) {

            for (int cPos = 0; cPos <= SHEET_WIDTH; cPos++) {

                cellArray[rPos][cPos] = new Cell();
            }
        }
    }


   /* public String () {
        System.out.println( "            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |");
        System.out.println("------------+------------+------------+------------+------------+------------+------------+------------+");
        for (int i = 0; i <= SHEET_HEIGHT*2 ; i++) {
            if (i % 2 != 0) {
                System.out.println("------------+------------+------------+------------+------------+------------+------------+------------+");
            }
            if (i % 2 == 0) {
                if(i>=18){
                    System.out.print("     " + ((i+2)/2) + "     ");
                    System.out.println("|            |            |            |            |            |            |            |");
                }
                else{
                    System.out.print("     " + ((i+2)/2) + "      ");
                    System.out.println("|            |            |            |            |            |            |            |");

                }
            }

            if(i>=18){
                System.out.println("------------+------------+------------+------------+------------+------------+------------+------------+");
            }
        }
        return "";}

*/

    public String toString() {
        String sheetPrint = "";
        String nextRow = "------------+------------+------------+------------+------------+------------+------------+------------+\n";
        sheetPrint += "            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |\n" + nextRow;
        for (int rPos = 0; rPos < SHEET_HEIGHT; rPos++) {
            sheetPrint += "     " + rPos + "     ";
            for (int cPos = 1; cPos < SHEET_WIDTH; cPos++) {
                sheetPrint += "|            |";

            }
            sheetPrint += "\n";
            sheetPrint += nextRow;
        }


        return sheetPrint;
    }

    public void createCell() {
    }
}