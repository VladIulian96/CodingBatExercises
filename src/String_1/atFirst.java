package String_1;

public class atFirst {

//    Given a string, return a string length 2 made of its first 2 chars.
//    If the string length is less than 2, use '@' for the missing chars.

    public static void main(String[] args) {
        System.out.println(new atFirst().atFirst("hello"));
    }

    public String atFirst(String str) {
        if(str.length() < 1) {
            return str + "@@";
        }

        if(str.length() < 2) {
            return str + "@";
        }

        return str.substring(0, 2);
    }

}
