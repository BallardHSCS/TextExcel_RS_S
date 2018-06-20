/*
* This is the NumberCell class.
* It extends from the Cell class.
* Depending on situation, it will store the Cell data as a double, or an int.
* */

public class NumberCell extends Cell {
    /**
     * @param data number cell constructor
     */
    public NumberCell(String data) {
        super(data);
    }

    /**
     * @param contents String contents to convert to double
     * @return double
     */
    public double doubleCell(String contents) {
        double numReturn = new Double(contents);


        return numReturn;
    }

}