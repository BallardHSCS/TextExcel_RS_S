import static oracle.jrockit.jfr.events.Bits.doubleValue;

public class Spreadsheet {
    public static final int SHEET_HEIGHT = 10;
    public static final int SHEET_WIDTH = 7;
    public String partialBFVal;
    private int letterA = 'A';
    private Cell[][] cellArray;

    public Spreadsheet() {
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
                sheetPrint += "|";

            }
            sheetPrint += "\n";
            sheetPrint += nextRow;
        }


        return sheetPrint;
    }



    public void clear(String type) {
        if (type.contains(" ")) {
            if(type.contains("-")){
                String[] range_parts = type.split(" ");
                String firstCell = range_parts[2];
                char letter = firstCell.charAt(0);
                letter = Character.toUpperCase(letter);
                int row = Integer.parseInt(firstCell.substring(1))-1;
                int col = letter - letterA;


                String secondCell = range_parts[4];
                char letterTwo = secondCell.charAt(0);
                letterTwo = Character.toUpperCase(letterTwo);
                int rowTwo = Integer.parseInt(secondCell.substring(1))-1;
                int colTwo = letterTwo - letterA;


            }
            else{
            String[] user_input_parts = type.split(" ");
            String cellName = user_input_parts[1];
            char letter = cellName.charAt(0);
            letter = Character.toUpperCase(letter);
            int row = Integer.parseInt(cellName.substring(1))-1;
            int col = letter - letterA;
            cellArray[row][col] = new Cell();
        }}

        else {
            for (int let = 0; let < SHEET_HEIGHT; let++) {
                for (int num = 0; num < SHEET_WIDTH; num++) {
                    cellArray[let][num] = new Cell();

                }
            }
        }
    }



    public String printCell(String input){

        char letter = input.charAt(0);
        letter = Character.toUpperCase(letter);
        int row = Integer.parseInt(input.substring(1))-1;
        int col = letter - letterA;
        String cellprint = cellArray[row][col].printToSpreadsheet();
        return cellprint;
    }

    /**
     * Takes input from TextExcel and returns cell locations
     * for the main method to use when exchanging data with the Cell class
     *
     * @param input
     */
    public void setCell(String input) {
        char stringChecker = '"';
        FormulaCell formulaCell = new FormulaCell(Cell.EMPTY_CELL, this);
        NumberCell number;
        if(input.contains("(")){
            String data = "";
            String[] user_input_parts = input.split(" ");
            String cellName = user_input_parts[0];
            char letter = cellName.charAt(0);
            letter = Character.toUpperCase(letter);
            int row = Integer.parseInt(cellName.substring(1)) - 1;
            int col = letter - letterA;
            for (int i = 2; i <= user_input_parts.length -1; i++){
                data += user_input_parts[i] + " ";
            }
            cellArray[row][col] = new FormulaCell(data, this);



        }
        else if(input.contains(stringChecker + "")){
            String[] user_input_parts = input.split(" ");
            String cellName = user_input_parts[0];
            String data = user_input_parts[2];
            char letter = cellName.charAt(0);
            letter = Character.toUpperCase(letter);
            int row = Integer.parseInt(cellName.substring(1)) - 1;
            int col = letter - letterA;
            cellArray[row][col] = new Cell(data);
        }

        else {
            String[] user_input_parts = input.split(" ");
            String cellName = user_input_parts[0];
            String data = user_input_parts[2];
            char letter = cellName.charAt(0);
            letter = Character.toUpperCase(letter);
            int row = Integer.parseInt(cellName.substring(1)) - 1;
            int col = letter - letterA;
            cellArray[row][col] = new NumberCell(data);


        }}

    public  String getCell(int r, int c){
        return  cellArray[r][c].printToSpreadsheet();
    }

    //TODO Checkpoint 6
    public void order() {
    }

    public void reverseOrder() {
    }

    public void sorter(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int minPos = minimumPosition(a, i);
            swap(a, minPos, i);
        }
    }


    private static int minimumPosition(int a[], int from) {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) {
            if (a[i] < a[minPos]) {
                minPos = i;
            }
        }
        return minPos;
    }

    public static int linearSearch(int[] a, int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;

    }

    private static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

//TODO: Fix Format Cell
//TODO: Fix print and calls of formulas with the operation method
//TODO Finish recursion and cell references

/*
* Submit 5 and then we will use search and sort algorithms with ranges in order to properly reference and use sorting
* Push 6 than final
* */