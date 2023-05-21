package Warmup_1;


public class startHi {

//    Given a string, return true if the string starts with "hi" and false otherwise.

    public static void main(String[] args) {
        System.out.println(new startHi().startHi("hiLol"));
        String lmao = "hiLol";
        System.out.println(lmao.length());
    }

    public boolean startHi(String str) {
        if(str.length() < 2) return false;
        if(str.substring(0, 2).equalsIgnoreCase("hi")) return true;
        return false;
    }

}
