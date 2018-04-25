
import java.util.Scanner;

public class TextExcel {
    public static void main(String[] args) {

        Scanner command_input = new Scanner(System.in);
        boolean done = false;

        SpreadSheet sheet = new SpreadSheet();
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
            } else if (user_input.equalsIgnoreCase("clear")) {
                sheet.clear();
            } else if (user_input.contains(" = ")) {
                String [] user_input_parts =  user_input.split(" ");
                String cellName = user_input_parts[0];
                String data = user_input_parts[2];
                char letter = cellName.charAt(0);
                int number =Integer.parseInt(cellName.substring(1));

    }
        while (!done);
        command_input.close();


}}

