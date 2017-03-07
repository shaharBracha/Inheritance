package Shahar.Terminal;

import java.util.ArrayList;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Flight {

    private ArrayList<Passenger> passengers = new ArrayList<>();

    public void bookFlight(Passenger p){
        passengers.add(p);
    }



}
