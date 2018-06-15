
import java.text.Normalizer;
import java.util.Scanner;

public class TextExcel {
    private static final int letterA = 'A';
    private static char printerChar = '"';
    public static void main(String[] args) {
        Spreadsheet sheet = new Spreadsheet();
        FormulaCell formula = new FormulaCell("", sheet);
        Scanner command_input = new Scanner(System.in);
        boolean done = false;


        System.out.println(help() + "\n");
        System.out.println(sheet);

        do {
            System.out.println("Please enter a command, full documentation will arrive later near completion");

            String user_input = command_input.nextLine();
            //Titled 'quit' within the specification
            if (user_input.equalsIgnoreCase("exit")) {
                done = true;
            } else if (user_input.equalsIgnoreCase("print")) {
/*ERROR*/                System.out.println(sheet);
            } else if (user_input.contains("clear")) {
                sheet.clear(user_input);
            } else if (user_input.contains(" = ")) {
                sheet.setCell(user_input);


            }
          /*  else if (user_input.contains("=")==false && (65 < user_input.toUpperCase().charAt(0) && user_input.toUpperCase().charAt(0) < 90)){
                System.out.println(sheet.getCell(Integer.parseInt(user_input.charAt(0))-65,user_input.charAt(1)));
            }*/
            else if (user_input.contains("(")) {
                System.out.println(formula.operations(user_input));
            } else if (user_input.contains("sum")) {
                System.out.println(formula.sum(user_input));
            } else if (user_input.contains("avg")) {
                System.out.println(formula.average(user_input));

            }else if(user_input.contains("help")){
                System.out.println(help());
            }
            else {
                char letter = user_input.toUpperCase().charAt(0);
                int col = letter - letterA;
                int row = Integer.parseInt(user_input.substring(1));
                System.out.println(sheet.printCell(user_input));
            }

        } while (!done);
        command_input.close();
    }

    private static String help() {
        String helper = "If you seek to exit the program, type 'exit'\n" +
                "For adding to the Spreadsheet, type commands in the format of 'A3 = Fool' in order to put data on the spreadsheet \n" +
                "Particularly for strings make sure your string contains " + printerChar + printerChar + " in a format such as A3 = " + printerChar + " Fool" + printerChar + "\n" +
                "To clear all cells on the Sheet, type clear, otherwise, type CellName(A3) = clear \n" + "For formulas, type your formula in the correct syntax of 'A1 = ( enter formula )' \n"
                ;
        return helper;
    }

}



