package Logic_1;

public class greenTicket {

//    You have a green lottery ticket, with ints a, b, and c on it.
//    If the numbers are all different from each other, the result is 0.
//    If all of the numbers are the same, the result is 20.
//    If two of the numbers are the same, the result is 10.

    public static void main(String[] args) {
        System.out.println(new greenTicket().greenTicket(1, 1, 1));
    }

    public int greenTicket(int a, int b, int c) {

        if(a != b && b != c && a != c) {
            return 0;
        }

        if(a == b && b == c) {
            return 20;
        }

        return 10;
    }

}