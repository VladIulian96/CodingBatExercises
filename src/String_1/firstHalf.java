package String_1;

public class firstHalf {

//    Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

    public static void main(String[] args) {
        System.out.println(new firstHalf().firstHalf("HelloWorld"));
    }

    public String firstHalf(String str) {
        String firstHalf = "";

        for(int i = 0; i < (str.length()) / 2; i++) {
            firstHalf += str.charAt(i);
        }

        return firstHalf;
    }

}
