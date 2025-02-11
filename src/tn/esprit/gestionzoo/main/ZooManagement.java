package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Belvedere", "Tunis");
        Zoo myZootwo = new Zoo("Belvederetwo", "Tunis"); // une erreur

        //  âge négatif
        Animal lion = new Animal("cat", "katous", -3, true); //  une erreur

        // Ajout
        myZoo.addAnimal(lion);
        System.out.println("Recherche de Lion: " + myZoo.searchAnimal(lion));

        // test duplication
        Animal lionn = new Animal("cat", "katous", 4, true);
        myZoo.addAnimal(lionn); //msg d'erreur

        if (myZoo.isZooFull()) {
            System.out.println("Le zoo est plein");
        } else {
            System.out.println("Le zoo n'est pas plein");
        }

        Zoo zooPlusGrand = myZoo.comparerZoo(myZoo, myZootwo);
        if (zooPlusGrand != null) {
            System.out.println("Le zoo avec le plus d'animaux est : " + zooPlusGrand.getName());
        } else {
            System.out.println("Les deux zoos ont le même nombre d'animaux.");
        }
    }
}
