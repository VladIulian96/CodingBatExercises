package String_1;

public class middleTwo {

//    Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
//    The string length will be at least 2.

    public static void main(String[] args) {
        System.out.println(new middleTwo());
    }

    public String middleTwo(String str) {
        if(str.length() < 2) {
            return "";
        }

        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

}
