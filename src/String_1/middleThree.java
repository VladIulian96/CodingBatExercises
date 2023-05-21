package String_1;

public class middleThree {

//    Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and".
//    The string length will be at least 3.

    public static void main(String[] args) {
        System.out.println(new middleThree().middleThree("Candy"));
    }

    public String middleThree(String str) {
        String fullWord = str.substring(str.length() / 2 - 1, str.length() / 2 + 2);

        return fullWord;
    }

}
