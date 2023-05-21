package String_1;

public class withoutEnd2 {

//    Given a string, return a version without both the first and last char of the string.
//    The string may be any length, including 0.

    public static void main(String[] args) {
        System.out.println(new withoutEnd2().withoutEnd2("Hello"));
    }

    public String withoutEnd2(String str) {
        if(str.length() >= 2) {
            str = str.substring(1, str.length() - 1);
        } else {
            str = "";
        }
        return str;
    }

}
