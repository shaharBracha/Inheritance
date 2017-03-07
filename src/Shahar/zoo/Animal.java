package Shahar.zoo;

/**
 * Created by p0018972 on 03/03/2017.
 */
public class Animal {
    private final String name;
    private final String species;

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }
}
