Reverse Words in a String
Write a function named reverseWordsInString that takes a string as an input parameter and returns a string.  The input string will be a sentence and the output string should be that sentence with the words reversed. The input sentence string will not contain leading or trailing spaces and the words will always be separated by a single space. A word is defined as a sequence of non-space characters.

Write this function using whichever programming language you prefer.  Again, write your answer as a function with a string input parameter that returns a string.

Example usage of the method/function (in Java):

public class FunctionClass {

    public static void main(String[] args) {
        FunctionClass fc = new FunctionClass();

        String str = "Lumpy potato";
        System.out.println(fc.reverseWordsInString(str));
        str = "I am a coder";
        System.out.println(fc.reverseWordsInString(str));
        str = "Reverse these words";
        System.out.println(fc.reverseWordsInString(str));
    }

//(function definition below)

}

Expected console output:
potato Lumpy
coder a am I
words these Reverse

