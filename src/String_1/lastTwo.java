package String_1;

public class lastTwo {

//    Given a string of any length, return a new string where the last 2 chars,
//    if present, are swapped, so "coding" yields "codign".

    public static void main(String[] args) {
        System.out.println(new lastTwo().lastTwo("coding"));
    }

    public String lastTwo(String str) {
        if(str.length() < 2) {
            return str;
        }
        if(str.length() == 2) {
            return str.substring(1) + str.charAt(0);
        }

        return str.substring(0, str.length() - 2) + str.substring(str.length() - 1) + str.substring(str.length() - 2, str.length() - 1);
    }

}
