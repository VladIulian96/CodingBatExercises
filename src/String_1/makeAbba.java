package String_1;

public class makeAbba {

//    Given two strings, a and b, return the result of putting them together in the order abba,
//    e.g. "Hi" and "Bye" returns "HiByeByeHi".

    public static void main(String[] args) {
        System.out.println(new makeAbba().makeAbba("Hello", "Bye"));
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

}
