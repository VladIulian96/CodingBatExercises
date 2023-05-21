package Warmup_1;

public class diff21 {

//    Given an int n, return the absolute difference between n and 21,
//    except return double the absolute difference if n is over 21.

    public static void main(String[] args) {
        System.out.println(new diff21().diff21(22));
    }

    public int diff21(int n) {
        return n > 21 ? 2 * (n - 21) : 21 - n;
    }

}
