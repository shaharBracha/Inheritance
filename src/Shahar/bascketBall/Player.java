package Shahar.bascketBall;

import Shahar.IO;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Player {
    protected boolean havaTheBall = false;
    Random r = new Random();
    protected String name;
    protected String lastName;

    protected int linePercent;
    protected int fildPercent;
    protected int bowPercent;

    protected int shirtNumber;
    protected double hight;
    protected LocalDateTime bDay = LocalDateTime.now(); // to Fix.....

    public Player(String name, String lastName, int linePercent, int fildPercent, int bowPercent, int shirtNumber, double hight) {
        this.name = name;
        this.lastName = lastName;
        this.linePercent = linePercent;
        this.fildPercent = fildPercent;
        this.bowPercent = bowPercent;
        this.shirtNumber = shirtNumber;
        this.hight = hight;
    }

    public Player() {
        this(IO.getString("Enter Player name: "),IO.getString("Enter Player Last name: "),IO.getInt("Enter line percent: "),IO.getInt("Enter fild percent: "),
                IO.getInt("Enter bow percent: "),IO.getInt("Enter shirt number: "),IO.getDouble("Enter player hight: "));
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getLinePercent() {
        return linePercent;
    }

    public int getFildPercent() {
        return fildPercent;
    }

    public int getBowPercent() {
        return bowPercent;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public double getHight() {
        return hight;
    }

    public LocalDateTime getbDay() {
        return bDay;
    }

    public void drible(){
        System.out.println("dribeling");

    }

    public boolean throwFromLine(){
        return r.nextInt(101) <= this.linePercent;
    }

    public boolean throwFromFild(){
        return r.nextInt(101) <= this.fildPercent;
    }
    public boolean throwFromBow(){
        return r.nextInt(101) <= this.bowPercent;
    }


    @Override
    public String toString() {
        return "Player{" +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", linePercent=" + linePercent +
                ", hight=" + hight +
                '}';
    }
}
