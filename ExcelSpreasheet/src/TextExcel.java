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
            }

            else if(user_input.equalsIgnoreCase("print")){
                System.out.println(sheet.print());
            }

            else if(user_input.equalsIgnoreCase("clear")){
                System.out.println();
            }
        }
        while (!done);
        command_input.close();
    }


}

