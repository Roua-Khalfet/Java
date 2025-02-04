import java.util.Scanner;

class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal("family","name", 5, false);

        Zoo myZoo = new Zoo( "name", "city", 25);
        System.out.println(myZoo);
        System.out.println(myZoo.toString());



    }

}