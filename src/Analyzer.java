import java.util.ArrayList;
import java.util.List;

public class Analyzer {

    private int rowCounter;
    private int charCounter;
    private List<String> array = new ArrayList<>();


    public void process(String input) {

        ifBlankInput(input);

        String[] words = input.split(" ");
        for (String word : words) {
            array.add(word);
        }

        rowCounter++;
        charCounter += input.length();
    }

    public void printAll() {

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }

    public int getWordCounter() {
        return array.size();
    }

    public int getRowCounter() {
        return rowCounter;
    }

    public int getCharCounter() {
        return charCounter;
    }

    public String getLongestWord() {
        String longestWord = "";

        for (int i = 0; i < array.size(); i++) {

            if (array.get(i).length() >= longestWord.length()) {
                longestWord = array.get(i);
            }
        }
        return longestWord;
    }

    public boolean checkIfStop(String input) {
        if (input.equalsIgnoreCase("stop")) {
            return true;
        }
        return false;
    }

    public String ifBlankInput(String input) {
        if (input.isEmpty()) {
            return "No input, try again...";
        }
        return null;
    }
}
