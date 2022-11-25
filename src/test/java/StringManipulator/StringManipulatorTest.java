package StringManipulator;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @org.junit.jupiter.api.Test
    void trimAndConcat() {
        StringManipulator trimConcatTestCase1 = new StringManipulator();
        assertEquals("HelloWorld", trimConcatTestCase1.trimAndConcat("     Hello    ", "      World"   ));
    }
}