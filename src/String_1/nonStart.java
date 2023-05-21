package String_1;

public class nonStart {

//    Given 2 strings, return their concatenation, except omit the first char of each.
//    The strings will be at least length 1.

    public static void main(String[] args) {
        System.out.println(new nonStart().nonStart("Hello", "World"));
    }

    public String nonStart(String a, String b) {
        String firstWord = "";
        String secondWord = "";

        for(int i = 1; i < a.length(); i++) {
            firstWord += a.charAt(i);
        }

        for(int i = 1; i < b.length(); i++) {
            secondWord += b.charAt(i);
        }

        return firstWord.concat(secondWord);
    }

}
