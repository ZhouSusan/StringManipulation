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

    void getIndexOfCharTest() {
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

    void concatSubstringTest() {
        StringManipulator concatSubStr1 = new StringManipulator();
        StringManipulator concatSubStr2 = new StringManipulator();
        String concatString1 = concatSubStr1.concatSubstring("chocochoclatecoco", 5, 13, " cake");
        String concatString2 = concatSubStr2.concatSubstring(" FrozenIceFrosty", 7, 9, " Cream Cake");
        assertAll(() -> assertEquals("chocolate cake", concatString1),
                () -> assertEquals("Ice Cream Cake", concatString2));
    }
}