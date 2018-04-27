/*
* This is the NumberCell class.
* It extends from the Cell class.
* Depending on situation, it will store the Cell data as a double, or an int.
* */

public class NumberCell extends Cell{

    public NumberCell(){



    }


    public double doubleCell(String contents){
       double numReturn = new Double(contents);


        return numReturn ;
    }

}