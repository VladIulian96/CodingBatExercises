package String_1;

public class startWord {

//    Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string,
//    except its first char does not need to match exactly.
//    On a match, return the front of the string, or otherwise return the empty string.
//    So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip".
//    The word will be at least length 1.

//    startWord("hippo", "hi") → "hi"
//    startWord("hippo", "xip") → "hip"
//    startWord("hippo", "i") → "h"

    public static void main(String[] args) {
        System.out.println(new startWord().startWord("hippo", "h"));
    }

    public String startWord(String str, String word) {
        boolean matchingWord = false;
        String result = "";

        if(str == "")
            return str;

        if(str.contains(word.substring(1))) {
            matchingWord = true;
        }

        if(matchingWord) {
            for(int i = 0; i < word.length(); i++) {
                result += str.charAt(i);
            }
            return result;
        } else {
            return "";
        }
    }

}
