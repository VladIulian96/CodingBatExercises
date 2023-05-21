package String_1;

public class makeOutWord {

//    Given an "out" string length 4, such as "<<>>", and a word,
//    return a new string where the word is in the middle of the out string, e.g. "<<word>>".
//    Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

    public static void main(String[] args) {
        System.out.println(new makeOutWord().makeOutWord("<<>>", "Hello"));
    }

    public String makeOutWord(String out, String word) {
        String fullWord = "";
        String symbol1 = out.substring(0, 2);
        String symbol2 = out.substring(2, 4);

        fullWord = symbol1 + word + symbol2;

        return fullWord;
    }

}
