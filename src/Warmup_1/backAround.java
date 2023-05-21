package Warmup_1;

public class backAround {

//    Given a string, take the last char and return a new string with the last char added at the front and back,
//    so "cat" yields "tcatt". The original string will be length 1 or more.

    public static void main(String[] args) {
        System.out.println(new backAround().backAround("kitty"));
    }

    public String backAround(String str) {
        String lastChar = String.valueOf(str.charAt(str.length() - 1));

        return lastChar + str + lastChar;
    }


}
