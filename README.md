# String Manipulation
<hr>
<p>You've been asked to implement a series of string manipulation methods. 
    To do these, you will need to utilize built in string methods. 
    Use the StringManipulator and StringManipulatorTesting classes. 
    Below are the method signatures and a short description of the method to be implemented.
</p>

# Objectives:
<hr> 
<ul>
    <li>Practice method signatures by implementing the tasks below.</li>
    <li>Implement some of the most used string methods.</li>
</ul>

# Tasks:
<hr>
Create a StringManipulator class that implements the following methods:</p>
<ul>
    <li>String trimAndConcat(String, String): Trim both input strings and then concatenate them. 
        Return the new string. Feel free to use the trim method of the String class.</li>
    <li>Integer getIndexOrNull(String, char): Get the index of the character and return either the index or null. If the character appears multiple times, return the first index. 
    Feel free to use the indexOf method of the String class.</li>
    <li>Integer getIndexOrNull(String, String): Get the index of the start of the substring and return either the index or null. 
    Feel free to use the indexOf method of the String class.</li>
    <li>String concatSubstring(String, int, int, String): Get a substring using a starting and ending index, and concatenate that with the second string input to our method. 
    Feel free to use the substring method of the String class.</li>
</ul>
<p>Then create a StringManipulatorTest to test all these methods.</p>