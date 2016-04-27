package eu.sathra.mavlink;

/**
 * Created by Wesley on 28/04/2016.
 */
public class Sender {

    public static void main(String[] args) {
        MAV mav = new MAV();
        mav.sendManualControl((short)1,(short)1,(short)1,(short)1);
    }

}
