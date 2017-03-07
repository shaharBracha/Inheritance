package Shahar.Terminal;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Passenger {  //if class is final, it can't be inherited...
    protected String name; // able to access in subClasses.

    // listen to audio in 1.18 and up !
    private double age;

    public Passenger(String name, double age) {
        this.name = name;
        this.age = age;
    }

    public Passenger() {
    }

     public double priceToPay(double basicTicketPrice){

        return basicTicketPrice;
     }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



}
