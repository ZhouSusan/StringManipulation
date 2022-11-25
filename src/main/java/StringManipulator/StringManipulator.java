package StringManipulator;

public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String concatStr = str1.trim() + str2.trim();
        return concatStr;
    }

    public int getIndexOrNull(String text, char letter) {
        int indexOfChar = text.indexOf(letter);
        return indexOfChar;
    }
}
