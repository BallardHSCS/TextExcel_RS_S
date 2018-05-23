
import java.text.Normalizer;
import java.util.Scanner;

public class TextExcel {
    public static void main(String[] args) {
        Spreadsheet sheet = new Spreadsheet();
        FormulaCell formula = new FormulaCell("", sheet);
        Scanner command_input = new Scanner(System.in);
        boolean done = false;
        char printerChar = '"';


        System.out.println("If you seek to exit the program, type 'exit'");
        System.out.println("For adding to the Spreadsheet, type commands in the format of 'A3 = Fool' in order to put data on the spreadsheet ");
        System.out.println("Particularly for strings make sure your string contains " + printerChar + printerChar + " in a format such as A3 = " + printerChar + " Fool" + printerChar);
        System.out.println("To clear all cells on the Sheet, type clear, otherwise, type CellName(A3) = clear");
        System.out.println("For formulas, type your formula in the correct syntax of 'A1 = ( enter formula )' \n");
        System.out.println(sheet);

        do {
            System.out.println("Please enter a command, full documentation will arrive later near completion");

            String user_input = command_input.nextLine();
            //Titled 'quit' within the specification
            if (user_input.equalsIgnoreCase("exit")) {
                done = true;
            } else if (user_input.equalsIgnoreCase("print")) {
                System.out.println(sheet);
            } else if (user_input.contains("clear")) {
                sheet.clear(user_input);
            }

            else if (user_input.contains(" = ")) {
                sheet.setCell(user_input);


            }
            else if (user_input.contains("=")==false && (65 < user_input.toUpperCase().charAt(0) && user_input.toUpperCase().charAt(0) < 90)){
                System.out.println(sheet.getCell(Integer.parseInt(user_input.charAt(0))-65,user_input.charAt(1)));
            }
            else if (user_input.contains("(")){
                System.out.println((formula.operations(user_input)));
            }
            else if (user_input.contains("sum")){
                    formula.average(user_input);
            }

        } while (!done);
        command_input.close();
    }
}
