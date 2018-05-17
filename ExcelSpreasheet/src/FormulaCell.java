/*
* This is the FormulaCell class.
* It extends from the Cell class.
* Depending on situation it should store the
*
* */


import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

import java.util.ArrayList;

public class FormulaCell extends Cell {
    ArrayList<Cell> refCells = new ArrayList<Cell>();
    private String contents = "";

    /*TODO create a formula method that is called after a formula is interpreted in parsing
      TODO
    */

    public void formulaCell() {
        contents = super.EMPTY_CELL;
    }

    //Contents: ( 1 + 3 )
    //TODO Finish checkpoint 4, this is the easy part
    //ISSUE: You do not need a house ArrayList in order to store the split, split does it for you
    public void operationsMod(String contents, int intNum) {

    }

    /**
     * @param contents
     *
     */
    public double operations(String contents) {
        double exitVal = 0;
        int opLength = 2;
        int elementIndex = 0;
        String[] inPart = contents.split(" ");



        String sideL = inPart[1];
        String sideR = "";
        for (int i = 2; i < inPart.length - 1; i += opLength) {
            sideR = inPart[i + 1];

            exitVal = operator(inPart[i].charAt(elementIndex), Double.parseDouble(sideL), Double.parseDouble(sideR));
            sideL = Double.toString(exitVal);

        }
        return exitVal;}

               /* String preNum = inPart[step];
                String preOp = inPart[step + 1];
                String preNum2 = inPart[step + 2];

                double newNum1 = Double.parseDouble(preNum);
                double newNum2 = Double.parseDouble(preNum2);
                char operatorIn = preOp.charAt(1);
                exitVal += operator(operatorIn, newNum1, newNum2); */


//TODO: Make @operator private in the future

    /**
     *
     * @param in
     * in is the designation for operators taken into the method
     *
     * @param num1
     * First number used in operation
     *
     * @param num2
     * Second number used in operation
     *
     * Example: ( 'num1' 'in' 'num2' )
     *
     * @return
     */
    // ( 1 + 3 * 9 )
    public double operator(char in, double num1, double num2) {
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
    public void average() {

    }
    /*public void sum(int numCells){
    ArrayList <Double> cellsAdd = new ArrayList<Double>();
    for(int i = 0; i<numCells; i++){
    cellsAdd += ;
}
        }*/


    public void sum() {
    }

    //TODO Checkpoint 6
    public void order() {

    }

    public void reverseOrder() {

    }


    public void sorter() {


    }


}




