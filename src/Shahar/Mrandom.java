package Shahar;

import java.util.Random;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Mrandom extends Random {


    public int getInt(int from, int to) {
        return nextInt(to - from) + from;
    }


    public int nextInt(){
        return super.nextInt();
    }

}
