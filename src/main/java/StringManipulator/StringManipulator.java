package StringManipulator;

public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String concatStr = str1.trim() + str2.trim();
        return concatStr;
    }

    public int getIndexOfChar(String text, char letter) {
        int indexOfChar = text.indexOf(letter);
        return indexOfChar;
    }

    public int getIndexOfSubString(String line, String text) {
        int indexOfSubString = line.indexOf(text);
        return indexOfSubString;
    }

    public String concatSubstring(String text1, int start, int end, String text2) {
        String subStr = text1.substring(start, end);
        return subStr.concat(text2);
    }
}
