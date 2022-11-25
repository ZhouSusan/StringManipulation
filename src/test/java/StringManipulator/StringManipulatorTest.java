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

    void getIndexOrNullTest() {
        StringManipulator getIndexOfChar = new StringManipulator();
        int indexOfChar = getIndexOfChar.getIndexOfChar("Happy Gobble Gobble Turkey Day!", 'G');
        int indexOfChar2 = getIndexOfChar.getIndexOfChar("Happy Gobble Gobble Turkey Day!", 'z');
        assertEquals(7, indexOfChar);
        assertEquals(-1, indexOfChar2);
    }

    void getIndexOfSubStringTest() {
        StringManipulator getIndexOfSubString = new StringManipulator();
        int indexOfSubStr1 = getIndexOfSubString.getIndexOfSubString("Let's watch a scary movie later.", "movie");
        int indexOfSubStr2 = getIndexOfSubString.getIndexOfSubString("I ate too much turkey...", "netflix");
        assertAll(() -> assertEquals(21, indexOfSubStr2),
                () -> assertNotEquals(4, indexOfSubStr2));
    }
}