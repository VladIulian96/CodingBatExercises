package String_1;

public class helloName {

//    Given a string of even length, return the first half.
//    So the string "WooHoo" yields "Woo".

    public static void main(String[] args) {
        System.out.println(new helloName().helloName("Bob"));
    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

}
