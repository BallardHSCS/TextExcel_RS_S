
import java.util.Scanner;

public class TextExcel {
    public static void main(String[] args) {

        Scanner command_input = new Scanner(System.in);
        boolean done = false;

        Spreadsheet sheet = new Spreadsheet();
        System.out.println("If you seek to exit the program, type 'exit'");
        System.out.println("For adding to the Spreadsheet, type commands in the format of 'A3 = Fool' in order to put data on the spreadsheet ");
        System.out.println("To clear all cells on the Sheet, type clear, otherwise, type CellName(A3) = clear");
        System.out.println("For formulas, type your formula in the correct syntax of 'A1 = ( enter formula )'");
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

            //TODO: Error Check certain cases below, for example if contents contain' = ' within a string input
            else if (user_input.contains(" = ")) {
               sheet.setCell(user_input);
                if (user_input.contains("(")) {


                } else if (user_input.contains("\"")) {


                } else {

            }

        }
        else{
                System.out.println(sheet.printCell(user_input));
            }
    }while (!done);
        command_input.close();}}
