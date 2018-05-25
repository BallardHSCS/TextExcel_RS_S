/*
* This is the FormulaCell class.
* It extends from the Cell class.
* Depending on situation it should store the
*
* */


import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.ArrayList;

public class FormulaCell extends Cell {
    private Spreadsheet sheet;
    private int letterA = 'A';
    private int letterZ = 'Z';
    String printContents = "";


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
     * @param contents
     * @return exitVal
     */
    public double operations(String contents) {
        int leftRow = 0;
        int leftCol = 0;
        int rightRow = 0;
        int rightCol = 0;
        double exitVal = 0;
        int opLength = 2;
        int elementIndex = 0;
        String[] inPart = contents.split(" ");
        String sideL = inPart[1];
        String sideR = "";
        for (int i = 2; i < inPart.length - 1; i += opLength) {
            sideR = inPart[i + 1];
            if (letterA < sideL.toUpperCase().charAt(0) && sideL.toUpperCase().charAt(0) < letterZ) {
                leftRow = sideL.charAt(1);
                leftCol = sideL.charAt(0) - letterA;

                sideL =findCellVal(leftRow,leftCol);

            }
            if (letterA < sideR.toUpperCase().charAt(0) && sideR.toUpperCase().charAt(0) < letterZ) {
                rightRow = sideR.charAt(1);
                rightCol = sideR.charAt(0) - letterA;
                sideR = findCellVal(rightRow, rightCol);

            }


            exitVal = operator(inPart[i].charAt(elementIndex), Double.parseDouble(sideL), Double.parseDouble(sideR));
            sideL = Double.toString(exitVal);


        }
        return exitVal;
    }


    private String findCellVal(int row ,int col ) {

    return sheet.getCellVal(row,col);

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
    private double operator(char in, double num1, double num2) {
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
        return newNum;
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
    public double average(String input) {
        String[] parseForCells = input.split(" ");
        ArrayList<Double> dubs = new ArrayList<>();

        String firstCell = parseForCells[2];
        char letter = firstCell.charAt(0);
        letter = Character.toUpperCase(letter);
        int row = Integer.parseInt(firstCell.substring(1))-1;
        int col = letter - letterA;


        String secondCell = parseForCells[4];
        char letterTwo = secondCell.charAt(0);
        letterTwo = Character.toUpperCase(letterTwo);
        int rowTwo = Integer.parseInt(secondCell.substring(1))-1;
        int colTwo = letterTwo - letterA;
        for(int r = row; r < rowTwo; r++){
            for(int c = col; c < colTwo; c++){
                dubs.add(Double.parseDouble(sheet.getCell(r, c)));
            }
        }

        return sum(dubs)/ dubs.size();
    }

    /*public void sum(int numCells){
    ArrayList <Double> cellsAdd = new ArrayList<Double>();
    for(int i = 0; i<numCells; i++){
    cellsAdd += ;
}
        }*/
    private double sum( ArrayList<Double> dubs) {
        int total = 0;
        for(int i = 0; i < dubs.size(); i ++){
            total += dubs.get(i);
        }

        return total;
    }

    public double sum(String input){
        String[] parseForCells = input.split(" ");
        ArrayList<Double> dubs = new ArrayList<>();

        String firstCell = parseForCells[2];
        char letter = firstCell.charAt(0);
        letter = Character.toUpperCase(letter);
        int row = Integer.parseInt(firstCell.substring(1))-1;
        int col = letter - letterA;


        String secondCell = parseForCells[4];
        char letterTwo = secondCell.charAt(0);
        letterTwo = Character.toUpperCase(letterTwo);
        int rowTwo = Integer.parseInt(secondCell.substring(1))-1;
        int colTwo = letterTwo - letterA;
        for(int r = row; r < rowTwo; r++){
            for(int c = col; c < colTwo; c++){
                dubs.add(Double.parseDouble(sheet.getCell(r, c)));
            }
        }

        return sum(dubs);
    }

public double getNumCell(String input) {
double cellVal = 0;

return cellVal;
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




