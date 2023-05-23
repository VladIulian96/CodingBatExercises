package String_1;

public class frontAgain {

//    Given a string, return true if the first 2 chars in the string also appear at the end of the string,
//    such as with "edited".
    public static void main(String[] args) {
        System.out.println(new frontAgain().frontAgain("edited"));
    }

    public boolean frontAgain(String str) {
        if(str.length() >= 2 && str.substring(0, 2).equalsIgnoreCase(str.substring(str.length() - 2))) {
            return true;
        }
        return false;
    }

}
