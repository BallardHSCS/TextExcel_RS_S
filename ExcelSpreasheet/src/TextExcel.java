
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
            SpreadSheet functionObj = new SpreadSheet();
            //Titled 'quit' within the specification
            if (user_input.equalsIgnoreCase("exit")) {
                done = true;
            } else if (user_input.equalsIgnoreCase("print")) {
                SpreadSheet.print();
            } else if (user_input.equalsIgnoreCase("clear")) {
                SpreadSheet.clear();
            } else if (user_input.equalsIgnoreCase("")) {

            }
        }
        while (!done);
        command_input.close();
    }


}

