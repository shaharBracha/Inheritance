package Shahar.bascketBall;

import Shahar.IO;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class OffensePlayer extends Player {

    private double offensivFoulsAVG;

    public OffensePlayer() {
        super();
        this.offensivFoulsAVG = IO.getDouble("enter offensivFoulsAVG: ");
    }


    public double getOffensivFoulsAVG() {
        return offensivFoulsAVG;
    }

    public String toString(){

        return "Player{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", offensivFouls AVG='" + offensivFoulsAVG + '\'' +
                ", hight=" + hight +
                '}';
    }


}