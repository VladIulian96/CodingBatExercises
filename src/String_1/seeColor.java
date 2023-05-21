package String_1;

public class seeColor {

//    Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

    public static void main(String[] args) {
        System.out.println(new seeColor().seeColor("red"));
    }

    public String seeColor(String str) {
        if(str.length() < 3)
            return "";

        if(str.substring(0, 3).contains("red")) {
            return "red";
        }
        if(str.length() >= 4 && str.substring(0, 4).contains("blue")) {
            return "blue";
        }
        return "";
    }

}
