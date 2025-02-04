import java.util.Arrays;

public class Zoo {
    Animal [] animals;
    String name, city;
    int nbrCages=25;

    public Zoo(String name, String city, int nbrCages){
        animals = new Animal[nbrCages];
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
    }

    public void displayZoo(){
        System.out.println("Name: " + name + " City: " + city + " Nombre de cages: " + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}