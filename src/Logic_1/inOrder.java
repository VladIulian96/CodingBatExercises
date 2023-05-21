package Logic_1;

public class inOrder {

//    Given three ints, a b c, return true if b is greater than a, and c is greater than b.
//    However, with the exception that if "bOk" is true, b does not need to be greater than a.

    public static void main(String[] args) {
        System.out.println(new inOrder().inOrder(1, 2, 3, true));
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return (!bOk && b > a && c > b) || (bOk && c > b);
    }

}
