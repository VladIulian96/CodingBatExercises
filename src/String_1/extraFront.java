package String_1;

public class extraFront {

//    Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
//    The string may be any length.
//    If there are fewer than 2 chars, use whatever is there.

    public static void main(String[] args) {
        System.out.println(new extraFront().extraFront("Hi"));
    }

    public String extraFront(String str) {
        if(str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
        if(str.length() == 1) {
            return str.substring(0, 1) + str.substring(0, 1) + str.substring(0, 1);
        }
        return str;
    }


}
