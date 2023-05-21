package Warmup_1;

public class missingChar {

//    Given a non-empty string and an int n, return a new string where the char at index n has been removed.
//    The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

    public static void main(String[] args) {
        System.out.println(new missingChar().missingChar("kitty", 1));
    }

    public String missingChar(String str, int n) {
        String word = "";
        for(int i = 0; i <= str.length() - 1; i++) {
            if(i == n) continue;
            word += str.charAt(i);
        }

        return word;
    }


}
