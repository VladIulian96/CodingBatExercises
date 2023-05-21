package String_1;

public class lastChars {

//    Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
//    so "yo" and "java" yields "ya".
//    If either string is length 0, use '@' for its missing char.

    public static void main(String[] args) {
        System.out.println(new lastChars().lastChars("Hello", "Java"));
    }

    public String lastChars(String a, String b) {
        String firstWord = "";
        String secondWord = "";

        if(a.equalsIgnoreCase("")) {
            firstWord = "@";
        } else {
            firstWord = String.valueOf(a.charAt(0));
        }

        if(b.equalsIgnoreCase("")) {
            secondWord = "@";
        } else {
            secondWord = String.valueOf(b.charAt(b.length() - 1));
        }

        return String.valueOf(firstWord + secondWord);
    }

}
