/*
* This is the FormulaCell class.
* It extends from the Cell class.
* Depending on situation it should store the
*
* */


import java.util.ArrayList;

public class FormulaCell extends Cell {
ArrayList <Cell> refCells = new ArrayList<Cell>();

    /*TODO create a formula method that is called after a formula is interpreted in parsing
      TODO
    */




    //ISSUE: You do not need a house ArrayList in order to store the split, split does it for you
    public void operators(String contents){
        String[] inPart = contents.split(" ");
        /*
        * Create a for loop here that goes from the [1] position to .length -1
        * Within each execution, check the position save it as either a number or a char save numbers as double variables
        * and compare chars as operators, use rules of pemdas to preform operations based on the operator by using the saved doubles
        * As a precondition, it may be wise to recognize that numbers appear ever other index
        * */

        
    }

    public void formulaCell() {



    }
    public void Average(){

    }
    /*public void sum(int numCells){
    ArrayList <Double> cellsAdd = new ArrayList<Double>();
    for(int i = 0; i<numCells; i++){
    cellsAdd += ;
}
        }*/


    public void order(){

    }
    public void reverseOrder(){

    }
    public void sorter(){


    }


}
