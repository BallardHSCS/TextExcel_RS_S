
import java.util.Scanner;

public class TextExcel {
    public static void main(String[] args) {

        Scanner command_input = new Scanner(System.in);
        boolean done = false;

        Spreadsheet sheet = new Spreadsheet();
        System.out.println("");
        System.out.println("");
        System.out.println("");


        do {
            System.out.println("Please enter a command, proper documentation will arrive later near completion");

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
    }while (!done);
        command_input.close();}}
