package Shahar.bascketBall;

import Shahar.IO;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Center extends Player {

    private double passAVG;

    public Center(){
        super();
        this.passAVG = IO.getDouble("enter player pass avarage: ");
    }


    public double getPassAVG() {
        return passAVG;
    }

    public String toString(){

        return "Player{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pass AVG='" + passAVG + '\'' +
                ", hight=" + hight +
                '}';
    }
}
