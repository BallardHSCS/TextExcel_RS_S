public class SpreadSheet {
    public static final int SHEET_HEIGHT = 10;
    public static final int SHEET_WIDTH = 7;

    Cell[][] cellArray = new Cell[SHEET_WIDTH][SHEET_HEIGHT];

    public SpreadSheet() {
        for (int wPos = 0; wPos <= SHEET_WIDTH; wPos++) {


            for (int hPos = 0; hPos <= SHEET_HEIGHT; hPos++) {
                cellArray[wPos][hPos] = new Cell();


            }
        }
    }

    public void SpreadSheetPrint() {
        for (int i = 0; i <= SHEET_HEIGHT/2; i++) {
            if (i % 0 != 0) {
                System.out.println("------------+------------+------------+------------+------------+------------+------------+");
            }
            if (i % 0 == 0) {
                System.out.println("|            |            |            |            |            |            |            |");

            }




        }
    }

public static void main(String args[]){
        








    }
}
















