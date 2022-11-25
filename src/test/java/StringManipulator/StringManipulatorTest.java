package StringManipulator;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @org.junit.jupiter.api.Test
    void trimAndConcatTest() {
        StringManipulator trimConcatTestCase1 = new StringManipulator();
        assertEquals("HelloWorld", trimConcatTestCase1.trimAndConcat("     Hello    ", "      World"   ));
    }

    void getIndexOrNull() {
        StringManipulator getIndexOfChar = new StringManipulator();
        int indexOfChar = getIndexOfChar.getIndexOrNull("Happy Gobble Gobble Turkey Day!", 'G');
        assertEquals(7, indexOfChar);
    }
}