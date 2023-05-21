package String_1;

public class conCat {

//    Given two strings, append them together (known as "concatenation") and return the result.
//    However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

    public static void main(String[] args) {
        System.out.println(new conCat().conCat("abc", "cat"));
    }

    public String conCat(String a, String b) {
        if(a == "")
            return b;
        if(b == "")
            return a;

        if(a.substring(a.length() - 1).equals(b.substring(0, 1))) {
            return a + b.substring(1, b.length());
        } else {
            return a + b;
        }
    }

}
