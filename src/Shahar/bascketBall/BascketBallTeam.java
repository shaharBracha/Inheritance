package Shahar.bascketBall;

import Shahar.IO;

import java.util.ArrayList;

/**
 * Created by p0018972 on 05/03/2017.
 */
public class BascketBallTeam {

    private ArrayList<Player> team;

    public BascketBallTeam() {
        team = new ArrayList<>();
    }

    public ArrayList<Player> getTeam() {
        return team;
    }


    public void addPlayer(){
        int c = IO.getInt("what kind of player it is ? \n" +
        "\t1) Center Player\n\t2) Guard Player\n\t3) Offense Player");
        switch (c){
            case 1:
                team.add(new Center());
                break;
            case 2:
                team.add(new Guard());
                break;
            case 3:
                team.add(new OffensePlayer());
                break;
            default:
                System.out.println("NOT a valid choise.... ");

        }
    }

    public void printTeam(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < team.size(); i++) {
            s+= team.get(i).toString() + "\n";
        }
        return s;
    }

    public void practiceThowFromline(){
        System.out.println("This is the team players results for throwing from line: ");
        String score = "";
        String s = "";
        for (int i = 0; i < team.size(); i++) {
            score = team.get(i).throwFromLine()? "IN" : "OUT";
            s = team.get(i).getName() + " threw, and its..... : " + score +"\n";
            System.out.println(s);


        }


    }

}
