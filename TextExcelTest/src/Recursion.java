
public class Recursion {

   private int letterA = 'A';

    Recursion() {
    }


    private boolean containsCellReference(String str) {
        boolean result = false;
        if (str.length() == 2) {
            result = true;
        }
    return result;
    }

    private double cellTester(String str){
        char letter = str.charAt(0);
        letter = Character.toUpperCase(letter);
        int row = Integer.parseInt(str.substring(1))-1;
        int col = letter - letterA;

        //String content = cellArray[row][col].printToSpreadsheet();
        //double val = Double.getDouble(content);

    return 0;


}}