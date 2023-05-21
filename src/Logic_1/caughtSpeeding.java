package Logic_1;

public class caughtSpeeding {

    public static void main(String[] args) {
        new caughtSpeeding().caughtSpeeding(70, true);
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(speed <= 60) return 0;
        if(speed >= 61 && speed <= 80) return 1;
        if(speed >= 81) return 2;

        return 0;
    }


}
