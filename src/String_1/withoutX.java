package String_1;

public class withoutX {

//    Given a string, if the first or last chars are 'x',
//    return the string without those 'x' chars, and otherwise return the string unchanged.

    public static void main(String[] args) {
        System.out.println(new without2().without2("xHix"));
    }

    public String withoutX(String str) {
        if(str.length() < 2) {
            return "";
        }

        if(str.substring(0, 1).contains("x")) {
            str = str.substring(1);
        }

        if(str.substring(str.length() - 1).contains("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

}
