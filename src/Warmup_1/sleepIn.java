package Warmup_1;

public class sleepIn {

//    The parameter weekday is true if it is a weekday,
//    and the parameter vacation is true if we are on vacation.
//    We sleep in if it is not a weekday, or we're on vacation.
//    Return true if we sleep in.

    public static void main(String[] args) {
        System.out.println(new sleepIn().sleepIn(false, true));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return vacation ? true : weekday ? false : true;
    }

}
