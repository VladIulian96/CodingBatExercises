package String_1;

public class without2 {

//    Given a string, if a length 2 substring appears at both its beginning and end,
//    return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
//    The substring may overlap with itself, so "Hi" yields "".
//    Otherwise, return the original string unchanged.

    public static void main(String[] args) {
        System.out.println(new without2().without2("HelloHe"));
    }

    public String without2(String str) {
        if(str.length() <= 1)
            return str;

        if(str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2))) {
            str = str.substring(2);
        }

        return str;
    }

}
