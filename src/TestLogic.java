
import org.junit.Test;

import static org.junit.Assert.*;

public class TestLogic {
    Logic test = new Logic();
    Main testMain = new Main();


    @Test
    public void testRowCounter() {

        test.process("Line 1");
        test.process("Line 2");
        test.process("Line 3");

        int expected = 3;
        int actual = test.getRowCounter();

        assertEquals(expected, actual);
    }

    @Test
    public void testCharCounter() {

        test.process("This is 21 characters");
        test.process("This is 21 characters");

        int expected = 42;
        int actual = test.getCharCounter();

        assertEquals(expected, actual);
    }

    @Test
    public void testWordCounter() {

        test.process("This is 4 words");
        test.process("This is 4 words");

        int expected = 8;
        int actual = test.getWordCounter();

        assertEquals(expected, actual);
    }

    @Test
    public void testFindLongestWord() {

        test.process("Short");
        test.process("Longer");
        test.process("VeryMuchLongest");
        test.process("Shorter");

        String expected = "VeryMuchLongest";
        String actual = test.getLongestWord();

        assertEquals(expected, actual);
    }

    @Test
    public void testIfInputIsStop() {
        assertTrue(test.checkIfStop("stop"));
    }

    @Test
    public void ifInputBlank() {

        String expected = "No input, try again...";
        String actual = test.ifBlankInput("");
        assertEquals(expected, actual);
    }

}
