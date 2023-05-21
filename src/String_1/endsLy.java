package String_1;

public class endsLy {

//    Given a string, return true if it ends in "ly".

    public static void main(String[] args) {
        System.out.println(new endsLy().endsLy("Helloly"));
    }

    public boolean endsLy(String str) {
        if(str.length() < 2) return false;

        if(str.charAt(str.length() - 2) == 'l' && str.charAt(str.length() - 1) == 'y') {
            return true;
        }
        return false;
    }

}
