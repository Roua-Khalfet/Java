import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("belvedere","Tunis");
        Zoo myZootwo = new Zoo("belvedere2","Tunis");

        //LION
        Animal lion = new Animal("katous","cat",4,true);
        myZoo.addAnimal(lion);
        System.out.println("Recherche de Lion: " + myZoo.searchAnimal(lion));

        //LION2
        Animal lionn = new Animal("katous","cat",4,true);
        myZoo.addAnimal(lionn);
        System.out.println("Recherche du Lion dupliqué: " + myZoo.searchAnimal(lionn));


        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein");
        } else {
            System.out.println("Le zoo n'est pas plein");
        }

        myZoo.comparerZoo(myZoo, myZootwo).displayZoo();

        //myZoo.displayZoo();
        //System.out.println(myZoo);
        //System.out.print(myZoo.toString());

    }
}
