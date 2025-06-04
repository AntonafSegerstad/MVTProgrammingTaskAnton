
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Analyzer process = new Analyzer();
        boolean isON = true;


        System.out.println("Write input followed by [ENTER]. Write [Stop] to stop");

        while (isON) {
            String input = scanner.nextLine();

            if (process.checkIfStop(input)) {
                isON = false;
            } else {
                process.process(input);
            }
        }

        System.out.println();
        process.printAll();
        System.out.println();
        System.out.println("Word counter: " + process.getWordCounter());
        System.out.println("Row counter: " + process.getRowCounter());
        System.out.println("Character counter: " + process.getCharCounter());
        System.out.println("Longest word: " + process.getLongestWord());

    }
}
