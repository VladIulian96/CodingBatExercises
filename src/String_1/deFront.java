package String_1;

public class deFront {

//    Given a string, return a version without the first 2 chars.
//    Except keep the first char if it is 'a' and keep the second char if it is 'b'.
//    The string may be any length. Harder than it looks.

    public static void main(String[] args) {
        System.out.println(new deFront().deFront("Hello"));
    }

    public String deFront(String str) {
        if(str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            return str;
        }

        if(str.charAt(0) == 'a' && str.charAt(1) != 'b') {
            return str.charAt(0) + str.substring(2);
        }

        if(str.charAt(0) != 'a' && str.charAt(1) == 'b') {
            return str.substring(1);
        }

        return str.substring(2);
    }

}
