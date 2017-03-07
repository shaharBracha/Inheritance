package Shahar;

import Shahar.Terminal.Passenger;
import Shahar.Terminal.VIPPassenger;
import Shahar.bascketBall.BascketBallTeam;
import Shahar.zoo.Animal;
import Shahar.zoo.Cow;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // To make a menu.......

        BascketBallTeam myTeam = new BascketBallTeam();

        myTeam.addPlayer();
        myTeam.addPlayer();
        myTeam.addPlayer();
        myTeam.addPlayer();
        myTeam.addPlayer();

        myTeam.practiceThowFromline();


    }
}
