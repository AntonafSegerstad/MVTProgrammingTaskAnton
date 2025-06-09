public class Analyzer {

    private int rowCounter;
    private int charCounter;
    private int wordCounter;
    private String longestWord;


    public Analyzer (){
        longestWord = "";
        rowCounter = 0;
        charCounter = 0;
        wordCounter = 0;
    }


    public void process(String input) {

        ifBlankInput(input);

        String[] array = input.split(" ");

        for (String word : array) {
            wordCounter++;
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        rowCounter++;
        charCounter += input.length();
    }

    public int getWordCounter() {
        return wordCounter;
    }

    public int getRowCounter() {
        return rowCounter;
    }

    public int getCharCounter() {
        return charCounter;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public boolean checkIfStop(String input) {
        return input.equalsIgnoreCase("stop");
    }

    public String ifBlankInput(String input) {
        if (input.isEmpty()) {
            return "No input, try again...";
        }
        return null;
    }


}
