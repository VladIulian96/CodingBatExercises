package String_1;

public class theEnd {

//    Given a string, return a string length 1 from its front, unless front is false,
//    in which case return a string length 1 from its back.
//    The string will be non-empty.

    public static void main(String[] args) {
        System.out.println(new theEnd().theEnd("Hello", true));
    }

    public String theEnd(String str, boolean front) {
        String word = "";
        if(front) {
            word = String.valueOf(str.charAt(0));
        } else {
            word = String.valueOf(str.charAt(str.length() - 1));
        }

        return word;
    }

}
