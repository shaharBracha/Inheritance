package Shahar.zoo;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Cow extends Animal {

    public Cow(String name) {
        super(name, "Cow");
    }

    public void makeSound(){
        System.out.println("Moooo");
    }

    public void giveMilk(){
        System.out.println("Giving milk");
    }


}
