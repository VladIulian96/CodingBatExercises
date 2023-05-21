package String_1;

public class extraEnd {

//    Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
//    The string length will be at least 2.

    public static void main(String[] args) {
        System.out.println(new extraEnd().extraEnd("Hello"));
    }

    public String extraEnd(String str) {
        String endWord = "";

        for(int i = str.length() - 2; i < str.length(); i++) {
            endWord += str.charAt(i);
        }

        return endWord + endWord + endWord;
    }

}
