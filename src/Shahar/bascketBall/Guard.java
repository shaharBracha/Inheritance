package Shahar.bascketBall;

import Shahar.IO;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Guard extends Player {

    private double blocksAVG;


    public Guard() {
        super();
        this.blocksAVG = IO.getDouble("enter player blocks avarage: ");
    }

    public double getBlocksAVG() {
        return blocksAVG;
    }

    public String toString(){

        return "Player{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", blocks AVG='" + blocksAVG + '\'' +
                ", hight=" + hight +
                '}';
    }
}
