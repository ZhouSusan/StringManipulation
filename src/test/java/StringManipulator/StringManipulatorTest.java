package StringManipulator;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @org.junit.jupiter.api.Test
    void trimAndConcatTest() {
        StringManipulator trimConcatTestCase1 = new StringManipulator();
        StringManipulator trimConcatTestCase2 = new StringManipulator();
        assertEquals("HelloWorld", trimConcatTestCase1.trimAndConcat("     Hello    ", "      World"   ));
        assertEquals("HappyThanksgiving!", trimConcatTestCase2.trimAndConcat("     Happy","Thanksgiving!      "));
    }

    void getIndexOrNull() {
        StringManipulator getIndexOfChar = new StringManipulator();
        int indexOfChar = getIndexOfChar.getIndexOrNull("Happy Gobble Gobble Turkey Day!", 'G');
        int indexOfChar2 = getIndexOfChar.getIndexOrNull("Happy Gobble Gobble Turkey Day!", 'z');
        assertEquals(7, indexOfChar);
        assertEquals(-1, indexOfChar2);
    }
}