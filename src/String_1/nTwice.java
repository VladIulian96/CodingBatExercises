package String_1;

public class nTwice {

//    Given a string and an int n,
//    return a string made of the first and last n chars from the string.
//    The string length will be at least n.

    public static void main(String[] args) {
        System.out.println(new nTwice().nTwice("abcdefghijklmnopqrstuvwxyz", 2));
    }

    public String nTwice(String str, int n) {

        String begginingOfWord = "";
        for(int i = 0; i < n; i++) {
            begginingOfWord += str.charAt(i);
        }

        String endOfWord = "";
        for(int i = str.length() - n; i < str.length(); i++) {
            endOfWord += str.charAt(i);
        }
        return begginingOfWord + endOfWord;
    }

}
