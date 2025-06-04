
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logic logic = new Logic();
        boolean isON = true;


        System.out.println("Write input followed by [ENTER]. Write [Stop] to stop");

        while (isON) {
            String input = scanner.nextLine();

            if (logic.checkIfStop(input)) {
                isON = false;
            } else {
                logic.process(input);
            }
        }

        System.out.println();
        logic.printAll();
        System.out.println();
        System.out.println("Word counter: " + logic.getWordCounter());
        System.out.println("Row counter: " + logic.getRowCounter());
        System.out.println("Character counter: " + logic.getCharCounter());
        System.out.println("Longest word: " + logic.getLongestWord());

    }
}
