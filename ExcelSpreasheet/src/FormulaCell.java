/**
 * This is the FormulaCell class.
 * It extends from the Cell class.
 * Depending on situation it should store the
 */


import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.ArrayList;

public class FormulaCell extends Cell {
    private Spreadsheet sheet;
    private int letterA = 'A';
    private int letterZ = 'Z';
    private int num1 = '1';

    String contents = GetContents();




    /*TODO create a formula method that is called after a formula is interpreted in parsing
      TODO
    */

    public FormulaCell(String data, Spreadsheet newSheet) {
        super(data);
        sheet = newSheet;


    }

    //Contents: ( 1 + 3 )
    //TODO Finish checkpoint 4, this is the easy part
    //ISSUE: You do not need a house ArrayList in order to store the split, split does it for you
    public void operationsMod(String contents, int intNum) {

    }

    /**
     * @param checkString
     * @return returns cell contents, as a string.
     */

    public String CellCheck(String checkString) {
        String[] input = checkString.split("");
        if ((checkString.toUpperCase().charAt(0) >= letterA) && (checkString.toUpperCase().charAt(0) <= letterZ)) {
            int Row = (int) Double.parseDouble(input[1]) - 1;
            int Col = checkString.charAt(0) - (letterA);
            checkString = sheet.getCell(Row, Col);
            if (checkString.contains("(")) {
                operations(sheet.getCell(Row, Col));
            }
            checkString = sheet.getCell(Row, Col);
            // this is where the program turns the reference into cell contents, and then calls it as a formula again, just in case its a formula.


        }
        return checkString;
    }

    /**
     * @param contents
     * @return exitVal as a string
     */

    public String operations(String contents) {
        this.contents = contents;
        String returnable = "";
        String exitVal = "";

        int opLength = 2;
        int elementIndex = 0;
/*ERROR*/
        String[] inPart = contents.split(" ");
        if (contents.contains("sum")) {
            exitVal = Double.toString(sum(contents));
        } else if (contents.contains("avg")) {
            exitVal = Double.toString(average(contents));
        } else {
            if (inPart.length <= 3) {
                exitVal += Double.parseDouble(CellCheck(inPart[1]));
            }
            String sideL = inPart[1];
            sideL = CellCheck(sideL);


            for (int i = 2; i < inPart.length - 1; i += opLength) {
                inPart[i - 1] = sideL;
                String sideR = CellCheck(inPart[i + 1]);


                exitVal = operator(inPart[i].charAt(elementIndex), Double.parseDouble(sideL), Double.parseDouble(sideR));
                sideL = exitVal;


            }
        }
        return exitVal;
    }


    /**
     * This method, is for accessing the contents of cells, so that it can be printed in the board.
     *
     * @return returns the contents of the formatted cell.
     */
    public String printToSpreadsheet() {
/*ERROR*/
        return formatCell(operations(contents));
    }



               /* String preNum = inPart[step];
                String preOp = inPart[step + 1];
                String preNum2 = inPart[step + 2];

                double newNum1 = Double.parseDouble(preNum);
                double newNum2 = Double.parseDouble(preNum2);
                char operatorIn = preOp.charAt(1);
                exitVal += operator(operatorIn, newNum1, newNum2); */


//TODO: Make @operator private in the future

    /**
     * @param in   in is the designation for operators taken into the method
     * @param num1 First number used in operation
     * @param num2 Second number used in operation
     *             Example: ( 'num1' 'in' 'num2' )
     * @return
     */
    // ( 1 + 3 * 9 )
    private String operator(char in, double num1, double num2) {
        double newNum = -1;
        if (in == '+') {
            newNum = (num1 + num2);
        } else if (in == '-') {
            newNum = (num1 - num2);
        } else if (in == '*') {
            newNum = (num1 * num2);
        } else if (in == '/') {
            newNum = (num1 / num2);
        } else {
            System.out.println("Invalid Operator");
        }
        return Double.toString(newNum);
    }
        /*
        * Create a for loop here that goes from the [1] position to .length -1
        * Within each execution, check the position save it as either a number or a char. Save numbers as double variables
        * and compare chars as operators, use rules of pemdas to preform operations based on the operator by using the saved doubles
        * As a precondition, it may be wise to recognize that numbers appear ever other index
        * */


    /* TODO CHECKPOINT 5
   *This all belongs in CP 5 and CP 6 respectively
   * Use recursion to access and call cells, I haven't really thought this through as much
   *Recursion is an important aspect
   * There may be some documentation in the google docs
   * */

    /**
     * @param input
     * @return average of input, as a double.
     */
    public double average(String input) {
        String[] parseForCells = input.split(" ");
        ArrayList<Double> dubs = new ArrayList<>();

        String firstCell = parseForCells[2];
        char letter = firstCell.charAt(0);
        letter = Character.toUpperCase(letter);
        int row = Integer.parseInt(firstCell.substring(1)) - 1;
        int col = letter - letterA;


        String secondCell = parseForCells[4];
        char letterTwo = secondCell.charAt(0);
        letterTwo = Character.toUpperCase(letterTwo);
        int rowTwo = Integer.parseInt(secondCell.substring(1)) - 1;
        int colTwo = letterTwo - letterA;
        for (int r = row; r <= rowTwo; r++) {
            for (int c = col; c <= colTwo; c++) {
                dubs.add(Double.parseDouble(sheet.getCell(r, c)));
            }
        }

        return sum(dubs) / dubs.size();
    }

    /*public void sum(int numCells){
    ArrayList <Double> cellsAdd = new ArrayList<Double>();
    for(int i = 0; i<numCells; i++){
    cellsAdd += ;
}
        }*/

    /**
     * @param dubs as an array list
     * @return sum of the input, as a double.
     */
    private double sum(ArrayList<Double> dubs) {
        int total = 0;
        for (int i = 0; i < dubs.size(); i++) {
            total += dubs.get(i);
        }

        return total;
    }

    /**
     * @param input as a string
     * @return sum of numbers, as a double
     */
    public double sum(String input) {
        String[] parseForCells = input.split(" ");
        ArrayList<Double> dubs = new ArrayList<>();

        String firstCell = parseForCells[2];
        char letter = firstCell.charAt(0);
        letter = Character.toUpperCase(letter);
        int row = Integer.parseInt(firstCell.substring(1)) - 1;
        int col = letter - letterA;


        String secondCell = parseForCells[4];
        char letterTwo = secondCell.charAt(0);
        letterTwo = Character.toUpperCase(letterTwo);
        int rowTwo = Integer.parseInt(secondCell.substring(1)) - 1;
        int colTwo = letterTwo - letterA;
        for (int r = row; r <= rowTwo; r++) {
            for (int c = col; c <= colTwo; c++) {
                dubs.add(Double.parseDouble(sheet.getCell(r, c)));
            }
        }

        return sum(dubs);
    }

    /**
     * UNUSED
     *
     * @param input String input
     * @return number cell value
     */
    public double getNumCell(String input) {
        double cellVal = 0;

        return cellVal;
    }
}

//TODO Checkpoint 6





